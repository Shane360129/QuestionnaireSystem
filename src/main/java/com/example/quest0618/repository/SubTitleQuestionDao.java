package com.example.quest0618.repository;

import com.example.quest0618.entity.SubTitleQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubTitleQuestionDao extends JpaRepository<SubTitleQuestion,Integer> {

    public List<SubTitleQuestion> findAllByTitleId(int i);

}
