package com.example.guestbook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  // JPA의 엔터티임을 나타냅니다. 이 클래스는 데이터베이스의 테이블과 매핑됩니다.
public class Entry {

    @Id  // 해당 필드가 테이블의 기본 키(primary key)에 매핑된다는 것을 나타냅니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 기본 키 생성을 데이터베이스에 위임함을 나타냅니다.
    private Long id;  // 방명록 항목의 고유 ID
    private String name;  // 작성자 이름
    private String content;  // 방명록 내용

    public Entry() {
        // 기본 생성자
    }

    public Entry(String name, String content) {
        this.name = name;
        this.content = content;
    } // 사용자 정의 생성자

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
