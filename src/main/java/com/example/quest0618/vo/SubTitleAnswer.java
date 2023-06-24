package com.example.quest0618.vo;

import java.util.List;

public class SubTitleAnswer {


    private int titleId;
    private int subTitleId;
//  子題目
    private String subTitle;
//  子題目回答(選項、統計百分比、總數量)
    private List<AnswerStatistics> answerStatistics;

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public int getSubTitleId() {
        return subTitleId;
    }

    public void setSubTitleId(int subTitleId) {
        this.subTitleId = subTitleId;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public List<AnswerStatistics> getAnswerStatistics() {
        return answerStatistics;
    }

    public void setAnswerStatistics(List<AnswerStatistics> answerStatistics) {
        this.answerStatistics = answerStatistics;
    }
}
