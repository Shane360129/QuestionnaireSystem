package com.example.quest0618.vo;

import com.example.quest0618.entity.TitleQuestion;

import java.util.List;

public class TitleQuestionResponse {

    private String message;
    private TitleQuestion titleQuestion;
    private List<TitleQuestion> titleQuestionList;

    public TitleQuestionResponse(List<TitleQuestion> titleQuestionList) {
        this.titleQuestionList = titleQuestionList;
    }

    public TitleQuestionResponse(String message, List<TitleQuestion> titleQuestionList) {
        this.message = message;
        this.titleQuestionList = titleQuestionList;
    }

    public TitleQuestionResponse(TitleQuestion titleQuestion) {
        this.titleQuestion = titleQuestion;
    }

    public TitleQuestionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TitleQuestion getTitleQuestion() {
        return titleQuestion;
    }

    public void setTitleQuestion(TitleQuestion titleQuestion) {
        this.titleQuestion = titleQuestion;
    }

    public List<TitleQuestion> getTitleQuestionList() {
        return titleQuestionList;
    }

    public void setTitleQuestionList(List<TitleQuestion> titleQuestionList) {
        this.titleQuestionList = titleQuestionList;
    }
}
