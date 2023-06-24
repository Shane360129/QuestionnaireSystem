package com.example.quest0618.repository;

import com.example.quest0618.entity.TitleQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitleQuestionDao extends JpaRepository<TitleQuestion,Integer> {

    public List<TitleQuestion> findByStatusOrderByStartTime(boolean status);

    public TitleQuestion findByTitle(String title);

    @Query("SELECT t FROM TitleQuestion t WHERE t.title LIKE %:keyword%")
    public List<TitleQuestion> byTitleLike(String keyword);


}