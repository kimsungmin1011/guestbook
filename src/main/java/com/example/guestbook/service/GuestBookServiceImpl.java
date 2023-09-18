package com.example.guestbook.service;

import com.example.guestbook.domain.Entry;
import com.example.guestbook.repository.GuestBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // 스프링의 서비스 빈으로 등록합니다.
public class GuestBookServiceImpl implements GuestBookService {

    @Autowired  // GuestBookRepository 타입의 빈을 자동으로 주입받습니다.
    private GuestBookRepository guestBookRepository;

    @Override
    /**
     * 방명록의 모든 항목을 조회하여 반환합니다.
     *
     * @return 방명록의 모든 항목 리스트
     */
    public List<Entry> getAllEntries() {
        return guestBookRepository.findAll();
    }

    @Override
    /**
     * 전달받은 방명록 항목을 저장(추가)합니다.
     *
     * @param entry 저장할 방명록 항목
     */
    public void addEntry(Entry entry) {
        guestBookRepository.save(entry);
    }
}
