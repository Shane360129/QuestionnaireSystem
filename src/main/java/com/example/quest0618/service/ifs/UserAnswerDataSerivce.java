package com.example.quest0618.service.ifs;

import com.example.quest0618.vo.GetUserAnswerDataRequest;
import com.example.quest0618.vo.SaveUserAnswerDataRequest;
import com.example.quest0618.vo.StatisticsResponse;
import com.example.quest0618.vo.UserAnswerDataResponse;

public interface UserAnswerDataSerivce {

    public UserAnswerDataResponse saveUserAnswerData(SaveUserAnswerDataRequest saveUserAnswerDataRequest);

    public StatisticsResponse getUserAnswerData(GetUserAnswerDataRequest getUserAnswerDataRequest);
}
