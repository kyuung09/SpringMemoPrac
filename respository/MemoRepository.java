package com.example.hanghaememoprac.respository;

import com.example.hanghaememoprac.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long>  {
    List<Memo> findAllByOrderByModifiedAtDesc();
    // 수정시간이 가장 최근인 순서대로 가져와야함
}



