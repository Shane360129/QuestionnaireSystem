package com.example.quest0618.vo;

import com.example.quest0618.entity.AnswerType;

import java.util.List;
import java.util.Optional;

public class AnswerTypeResponse {

    private int answerTypeId;
    private String message;
    private List<AnswerType> answerType;

    public AnswerTypeResponse(String message) {
        this.message = message;
    }

    public AnswerTypeResponse(List<AnswerType> answerType) {
        this.answerType = answerType;
    }

    public AnswerTypeResponse(String message, List<AnswerType> answerType) {
        this.message = message;
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

    public List<AnswerType> getAnswerType() {
        return answerType;
    }

    public void setAnswerType(List<AnswerType> answerType) {
        this.answerType = answerType;
    }

}
