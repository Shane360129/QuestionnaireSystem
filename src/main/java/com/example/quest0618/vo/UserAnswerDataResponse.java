package com.example.quest0618.vo;

import com.example.quest0618.entity.UserAnswerData;

import java.util.List;

public class UserAnswerDataResponse {

    private int userAnswerDataId;
    private List<UserAnswerData> answerData;
    private String message;

    public UserAnswerDataResponse(String message) {
        this.message = message;
    }

    public UserAnswerDataResponse(List<UserAnswerData> answerData) {

    }

    public int getUserAnswerDataId() {
        return userAnswerDataId;
    }

    public void setUserAnswerDataId(int userAnswerDataId) {
        this.userAnswerDataId = userAnswerDataId;
    }

    public List<UserAnswerData> getAnswerData() {
        return answerData;
    }

    public void setAnswerData(List<UserAnswerData> answerData) {
        this.answerData = answerData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
