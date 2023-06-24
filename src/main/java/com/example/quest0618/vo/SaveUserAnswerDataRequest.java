package com.example.quest0618.vo;

import javax.persistence.Column;
import javax.persistence.Id;

public class SaveUserAnswerDataRequest {

    private int userAnswerDataId;
    private int titleId;
    private int subtitleId;
    private int userId;
    private String answerContent;

    public int getUserAnswerDataId() {
        return userAnswerDataId;
    }

    public void setUserAnswerDataId(int userAnswerDataId) {
        this.userAnswerDataId = userAnswerDataId;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public int getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(int subtitleId) {
        this.subtitleId = subtitleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }
}
