package com.example.quest0618.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "useranswerdata")
public class UserAnswerData {

    @Id
    @Column(name = "userAnswerDataId")
    private int userAnswerDataId;
    @Column(name = "titleId")
    private int titleId;
    @Column(name = "subtitleId")
    private int subtitleId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "answerContent")
    private String answerContent;
    @Column(name = "answerTypeId")
    private int answerTypeId;

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

    public int getAnswerTypeId() {
        return answerTypeId;
    }

    public void setAnswerTypeId(int answerTypeId) {
        this.answerTypeId = answerTypeId;
    }
}
