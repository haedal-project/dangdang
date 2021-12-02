package com.sparta.dangdang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DangDangApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(DangDangApplication.class, args);
//    }
//
//}

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "classpath:aws.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(DangDangApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }
}