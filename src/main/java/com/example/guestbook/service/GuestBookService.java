package com.example.guestbook.service;

import com.example.guestbook.domain.Entry;
import java.util.List;

/**
 * GuestBookService는 방명록과 관련된 주요 비즈니스 연산을 정의하는 인터페이스입니다.
 */
public interface GuestBookService {

    /**
     * 방명록의 모든 항목을 검색합니다.
     *
     * @return 방명록의 모든 항목 리스트
     */
    List<Entry> getAllEntries();

    /**
     * 방명록에 새로운 항목을 추가합니다.
     *
     * @param entry 추가할 방명록 항목
     */
    void addEntry(Entry entry);
}
