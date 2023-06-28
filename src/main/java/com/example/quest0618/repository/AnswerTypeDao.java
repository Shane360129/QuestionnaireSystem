package com.example.quest0618.repository;

import com.example.quest0618.entity.AnswerType;
import com.example.quest0618.entity.TitleQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerTypeDao extends JpaRepository<AnswerType,Integer> {

    public List<AnswerType> findAllBySubtitleId(int subTitleId);

    public List<AnswerType> findBySubtitleIdIn(List <Integer> subTitleId);

    @Query("SELECT COUNT(*) FROM AnswerType WHERE subtitleId IN (:subtitleIds)")
    public List<AnswerType> getAllAnswerType(@Param("subtitleIds") List<Integer> subtitleIds);

}
