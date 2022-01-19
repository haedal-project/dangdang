# DangDang(Spring)
<p align="">
<img src="https://img.shields.io/badge/Java-007396?style=plastic&logo=Java&logoColor=white"/>
<img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=plastic&logo=Spring&logoColor=white"/>
<img src="https://img.shields.io/badge/H2-3423A6?style=plastic&logo=H2&logoColor=white"/></P>

- Spring Boot             
스프링 부트는 많은 설정을 기본적으로 갖추고 있습니다.      
스프링 부트에는 Apache Tomcat이 내장되어 있습니다.   
 
- Spring Data JPA                
스프링 데이터 JPA는 JPA를 더 쉽고 편하게 사용할 수 있게 해줍니다.

<br>

## What is DangDang?
- 소개
강아지들을 키우는 사람들을 위해 만든 커뮤니티 사이트로써,      
강아지와 함께하는 일상의 사진들을 찍거나 동반 가능한 장소를 공유하고,       
강아지에 유용한 정보들을 얻는 프로젝트를 진행하였습니다.

<br>

- 배경
이전에 파이썬으로 기획을 진행했을 때 강아지를 키우는 사람이 팀원의 과반수였었고  
그로인해 관심사가 같았습니다. 여기에 인스타그램 감성으로 키워보자 해서   
반려동물 + 인스타그램 = 댕댕백서가 탄생하게 되었습니다.      

<br>

## 구성
- 멤버 구성 :  백엔드 3명        
              
'댕댕백서' 프로젝트를 진행하며,
        
- 12시 45분에 팀 회고를 진행했습니다. (본인 발표 : 3분, Q&A : 2분, 전체 회고 1~5분)       
- PR하고 Merge 하는 방식으로 협업을 진행했습니다.          
- 이슈생성과 칸반보드를 통해 프로젝트와 브랜치 관리를 진행했습니다.            
- 팀원별 생산성을 고려하고 보다 효율적인 프로젝트 관리를 하기위해 스프린트 기간을 토대로                
   마일드 스톤을 생성해 프로젝트를 진행했습니다.          


<br>

### 역할
프로젝트를 진행할 때 저의 역할은 팀장이었습니다.        
그래서 다른 팀들의 진행 상황과 Github를 보면서 좋은 점들을 가져와 회의시간에 추가하면 좋을 것들을 말씀을 드렸고                    
(commit 틀, issue 등록 틀) 이에 반영된 것을 [wiki](https://github.com/haedal-uni/dangdang/wiki)에 정리하였습니다.               

팀 Github에 wiki 관리와 readme 관리는 주로 제가 하게 되었고,         
팀원들에게 이슈생성과 칸반보드를 적극 활용을 격려했습니다.         
또, pull request를 적극 활용과 pull request할 때 코드 리뷰를 하는 방향으로 진행되도록 노력하였습니다.     

[해당 내용 Tistory로 정리](https://lu-delight.tistory.com/327)

<br>

### 맡은 업무 : 게시글 업로드 

###### 글 작성
<img src = https://user-images.githubusercontent.com/74857364/150071865-90ea8331-df9b-40eb-a164-12ba8de0ae53.png width="50%">

###### 위치 등록
<img src = https://user-images.githubusercontent.com/74857364/150071887-35e94e21-c122-41e2-8469-6455a5210c1c.png width="50%">

<br>

### 구현 과정 + 트러블 슈팅
사용자가 게시글 업로드 페이지에서 글 작성 후 등록 버튼을 누르면, 이미지는 파일 형식으로 로컬에 이미지를 저장합니다.           
S3로 파일 업로드 과정을 거친 후 그리고 로컬에 저장된 이미지를 지웁니다.              
S3로 업로드 후 return 값으로 url을 반환해서 image에 저장해 브라우저에 띄워줍니다.         
 
- .gitignore  
    aws 키 때문에 gitignore에 .yml을 적용시켰는데 실행이 되지 않았습니다.        
    git rm -r --cached . 입력 후 다시 add 하니 적용이 되었습니다.            
    
- S3 적용
    Application에서 s3를 적용하는 yml 파일을 작성했는데 오류가 떴습니다.         
    application.properties와 aws 키가 작성된 aws.yml을 추가해야했는데                 
    application.properties가 존재함에도 새로운 application.yml을 생성해 연결시키려고 해서 오류가 떴던 것이었습니다.              
    
- 이미지 업로드
    이미지 업로드를 시도 했는데 에러가 떴고 파일명을 변경해봤더니 정상적으로 업로드가 되었습니다.           
    이 전에 accessKey와 secretKey를 입력할 때 띄어쓰기를 한 번 안해서 에러가 떴었고             
    그래서 이미지 업로드를 시도할 때 오류가 떠서 로컬에만 저장되어있었는데                  
    같은 파일로 시도를 하니 파일 명이 같아서 업로드가 안된 것이었습니다.                      

<br>

#### 블로그 기록

- 팀 project 기록용                                
    [3차 프로젝트 _ S.A(Starting Assignment)](https://lu-delight.tistory.com/315)          
    [3차 프로젝트_기획안 수정](https://lu-delight.tistory.com/319)          
    [3차 프로젝트_KPT 회고](https://lu-delight.tistory.com/342)              
               
- [개인 TIL](https://lu-delight.tistory.com/category/TIL)          
    [68일차](https://lu-delight.tistory.com/316) ~  [88일차](https://lu-delight.tistory.com/338)              
                         
              
