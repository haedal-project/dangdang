package com.sparta.dangdang.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private User writer;
    @Column(nullable = true)
    private String update_date;
    @Column(nullable = true)
    private String main_image_path;
    @Column(nullable = false)
    private String content;

    public Post(User writer, String update_date, String main_image_path, String content) {
        this.writer = writer;
        this.update_date = update_date;
        this.main_image_path = main_image_path;
        this.content = content;
    }

    public void setWriter(User writer) {
        if(this.writer != null) {
            this.writer.getWritten_posts().remove(this);
        }
        this.writer = writer;

        if(!writer.getWritten_posts().contains(this)) {
            writer.addWritePost(this);
        }
    }
}
