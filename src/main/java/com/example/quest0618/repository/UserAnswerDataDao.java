package com.example.quest0618.repository;

import com.example.quest0618.entity.TitleQuestion;
import com.example.quest0618.entity.UserAnswerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserAnswerDataDao extends JpaRepository<UserAnswerData,Integer> {

    @Query("SELECT COUNT(*) FROM UserAnswerData WHERE subtitleId = :subtitleId")
    public Integer byAnswerCount(int subtitleId);

    @Query("SELECT COUNT(*) FROM UserAnswerData WHERE subtitleId = :subtitleId and answerTypeId = :answerTypeId")
    public Integer bySubtitleIdAndAnswerTypeId(int subtitleId, int answerTypeId);
}
