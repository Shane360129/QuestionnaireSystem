package com.example.quest0618.vo;

import com.example.quest0618.entity.AnswerType;

import java.util.List;
import java.util.Optional;

public class AnswerTypeResponse {

    private int answerTypeId;
    private String message;
    private Optional<AnswerType> answerType;
    private List<StatisticsResponse> statisticsResponse;

    public AnswerTypeResponse(String message) {
        this.message = message;
    }

    public AnswerTypeResponse(Optional<AnswerType> answerType) {
        this.answerType = answerType;
    }

    public int getAnswerTypeId() {
        return answerTypeId;
    }

    public void setAnswerTypeId(int answerTypeId) {
        this.answerTypeId = answerTypeId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Optional<AnswerType> getAnswerType() {
        return answerType;
    }

    public void setAnswerType(Optional<AnswerType> answerType) {
        this.answerType = answerType;
    }
}
