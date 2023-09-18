package com.example.guestbook.repository;

import com.example.guestbook.domain.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

// 방명록 엔터티에 대한 CRUD 작업을 수행할 수 있는 JPA 리포지토리 인터페이스입니다.
public interface GuestBookRepository extends JpaRepository<Entry, Long> {
    // JpaRepository 인터페이스는 <Entity Type, Primary Key Type>의 형식으로 제네릭을 받습니다.
    // 여기서는 Entry 엔터티와 그 기본 키 타입인 Long을 지정하여 JpaRepository를 확장(extends)하고 있습니다.

    // JpaRepository에는 기본적인 CRUD 연산을 수행하는 여러 메서드가 미리 정의되어 있습니다.
    // 그러므로 개발자는 별도로 CRUD 메서드를 구현할 필요가 없습니다.
    // 필요한 추가적인 쿼리 메서드가 있을 경우에만 여기에 메서드 시그니처를 정의합니다.
}
