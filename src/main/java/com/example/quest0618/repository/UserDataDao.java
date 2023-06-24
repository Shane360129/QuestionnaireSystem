package com.example.quest0618.repository;

import com.example.quest0618.entity.TitleQuestion;
import com.example.quest0618.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDataDao extends JpaRepository<UserData,Integer> {


}
