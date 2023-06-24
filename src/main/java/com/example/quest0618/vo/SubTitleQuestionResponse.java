package com.example.quest0618.vo;

import com.example.quest0618.entity.SubTitleQuestion;

import java.util.List;

public class SubTitleQuestionResponse {

    private String message;
    private SubTitleQuestion subTitleQuestion;
    private List<SubTitleQuestion> subTitleQuestionList;

    public SubTitleQuestionResponse(String message) {
        this.message = message;
    }

    public SubTitleQuestionResponse(String message, List<SubTitleQuestion> subTitleQuestionList) {
        this.message = message;
        this.subTitleQuestionList = subTitleQuestionList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SubTitleQuestion getSubTitleQuestion() {
        return subTitleQuestion;
    }

    public void setSubTitleQuestion(SubTitleQuestion subTitleQuestion) {
        this.subTitleQuestion = subTitleQuestion;
    }

    public List<SubTitleQuestion> getSubTitleQuestionList() {
        return subTitleQuestionList;
    }

    public void setSubTitleQuestionList(List<SubTitleQuestion> subTitleQuestionList) {
        this.subTitleQuestionList = subTitleQuestionList;
    }
}
