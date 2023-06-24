package com.example.quest0618.vo;

import java.util.List;

public class StatisticsResponse {

//      父題目
    private int titleId;
    private String title;
//      子題目List(物件)裡面有回答以及回答比例
    private List<SubTitleAnswer> subtitleAnswer;

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubTitleAnswer> getSubtitleAnswer() {
        return subtitleAnswer;
    }

    public void setSubtitleAnswer(List<SubTitleAnswer> subtitleAnswer) {
        this.subtitleAnswer = subtitleAnswer;
    }
}
