package com.example.hanghaememoprac.controller;

import com.example.hanghaememoprac.dto.MemoRequestDto;
import com.example.hanghaememoprac.entity.Memo;
import com.example.hanghaememoprac.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @PostMapping("/api/memos")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto){
        return memoService.createMemo(requestDto);
    }

    @GetMapping("/api/memos")
    public List<Memo> getMemos() {
        return memoService.getMemos();
    }

    @PutMapping("/api/memos/{id}")
    public long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto reqeustDto){
        return memoService.update(id, reqeustDto);
    }

    @DeleteMapping("/api/memos/{id}")
    public Long deleteMemo(@PathVariable Long id){
        return memoService.deleteMemo(id);
    }
}
