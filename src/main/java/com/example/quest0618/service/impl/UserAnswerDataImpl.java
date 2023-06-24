package com.example.quest0618.service.impl;

import com.example.quest0618.entity.AnswerType;
import com.example.quest0618.entity.SubTitleQuestion;
import com.example.quest0618.entity.TitleQuestion;
import com.example.quest0618.entity.UserAnswerData;
import com.example.quest0618.repository.AnswerTypeDao;
import com.example.quest0618.repository.SubTitleQuestionDao;
import com.example.quest0618.repository.TitleQuestionDao;
import com.example.quest0618.repository.UserAnswerDataDao;
import com.example.quest0618.service.ifs.AnswerTypeService;
import com.example.quest0618.service.ifs.UserAnswerDataSerivce;
import com.example.quest0618.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserAnswerDataImpl implements UserAnswerDataSerivce {

    @Autowired
    UserAnswerDataDao userAnswerDataDao;
    @Autowired
    TitleQuestionDao titleQuestionDao;
    @Autowired
    SubTitleQuestionDao subTitleQuestionDao;
    @Autowired
    AnswerTypeDao answerTypeDao;


    @Override
    public UserAnswerDataResponse saveUserAnswerData(SaveUserAnswerDataRequest saveUserAnswerDataRequest) {

        UserAnswerData userAnswerData = new UserAnswerData();
        userAnswerData.setAnswerContent(saveUserAnswerDataRequest.getAnswerContent());
        userAnswerData.setTitleId(saveUserAnswerDataRequest.getTitleId());
        userAnswerData.setSubtitleId(saveUserAnswerDataRequest.getSubtitleId());
        userAnswerData.setUserId(saveUserAnswerDataRequest.getUserId());

        userAnswerDataDao.save(userAnswerData);
        return null;
    }

    @Override
    public StatisticsResponse getUserAnswerData(GetUserAnswerDataRequest getUserAnswerDataRequest) {

        Optional<TitleQuestion> answerData = titleQuestionDao.findById(getUserAnswerDataRequest.getTitleId());
        StatisticsResponse statisticsResponse = new StatisticsResponse();
        statisticsResponse.setTitleId(answerData.get().getTitleId());
        statisticsResponse.setTitle(answerData.get().getTitle());
        List<SubTitleQuestion> subTitleList = subTitleQuestionDao.findAllByTitleId(statisticsResponse.getTitleId());
        // 建立子題目的物件
        List<SubTitleAnswer> subTitleAnswers = new ArrayList<>();
        for(SubTitleQuestion item : subTitleList){
            SubTitleAnswer subTitleAnswer = new SubTitleAnswer();
            subTitleAnswer.setSubTitleId(item.getSubtitleId());
            subTitleAnswer.setSubTitle(item.getSubTitleQuestion());
            List<AnswerType> answerTypeList = answerTypeDao.findAllBySubtitleId(subTitleAnswer.getSubTitleId());
            List<AnswerStatistics> answerStatisticsList = new ArrayList<>();
            for (AnswerType i : answerTypeList){
                AnswerStatistics answerStatistics = new AnswerStatistics();
                answerStatistics.setSubTitleId(i.getSubtitleId());
                answerStatistics.setAnswerOptional(i.getAnswerOption());
                // 總回答次數
                Integer answerCount = userAnswerDataDao.byAnswerCount(i.getSubtitleId());
                answerStatistics.setTotle(answerCount);
                Integer subtitleAnswerCount = userAnswerDataDao.bySubtitleIdAndAnswerTypeId(i.getSubtitleId(), i.getAnswerTypeId());
                double count =  (double) answerCount / subtitleAnswerCount;
                answerStatistics.setStatistics(count);
                answerStatisticsList.add(answerStatistics);
            }
            subTitleAnswer.setAnswerStatistics(answerStatisticsList);
            subTitleAnswers.add(subTitleAnswer);
        }
        statisticsResponse.setSubtitleAnswer(subTitleAnswers);

        return statisticsResponse;
    }
}
