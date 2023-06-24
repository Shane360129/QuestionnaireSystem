package com.example.quest0618.service.impl;


import com.example.quest0618.entity.TitleQuestion;
import com.example.quest0618.repository.TitleQuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

// 自動執行更新開啟狀態
@Component
public class SurveyScheduler {

    @Autowired
    private TitleQuestionDao titleQuestionDao;

    // 指定定時任務的執行間隔和其他屬性
    @Scheduled(cron = "* * 1 * * *") // 每十秒執行一次
    public void checkAndOpenSurveys() {
        // 檢查並開放問券的程式碼
        List<TitleQuestion> surveys = titleQuestionDao.findByStatusOrderByStartTime(false);

        LocalDateTime now = LocalDateTime.now();

        for (TitleQuestion survey : surveys) {
            if (!survey.isStatus() && now.isAfter(survey.getStartTime())) {
                survey.setStatus(true);
                titleQuestionDao.save(survey);
            }

        }
        List<TitleQuestion> surveysTrue = titleQuestionDao.findByStatusOrderByStartTime(true);
        for (TitleQuestion surveyTrue : surveysTrue) {
            if (surveyTrue.isStatus() && now.isAfter(surveyTrue.getEndTime())) {
                surveyTrue.setStatus(false);
                titleQuestionDao.save(surveyTrue);
            }
        }
    }
}
