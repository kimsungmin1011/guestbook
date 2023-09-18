package com.example.guestbook.controller;

import com.example.guestbook.domain.Entry;
import com.example.guestbook.service.GuestBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // 이 클래스가 REST API의 컨트롤러 역할을 하는 클래스임을 나타냅니다.
@RequestMapping("/guestbook")  // 이 컨트롤러에서 처리하는 모든 요청의 기본 URL 경로를 "/guestbook"으로 설정합니다.
@CrossOrigin(origins = "http://localhost:3000") // React 앱의 URL을 여기에 지정
public class GuestBookController {

    @Autowired  // GuestBookService 타입의 빈을 자동으로 주입받습니다.
    private GuestBookService guestBookService;

    @GetMapping  // HTTP GET 요청을 처리하는 메소드를 나타냅니다.
    public List<Entry> getAllEntries() {
        // 모든 방명록 항목을 가져와 반환합니다.
        return guestBookService.getAllEntries();
    }

    @PostMapping  // HTTP POST 요청을 처리하는 메소드를 나타냅니다.
    public void addEntry(@RequestBody Entry entry) {
        // 전달받은 방명록 항목을 추가합니다.
        guestBookService.addEntry(entry);
    }
}
