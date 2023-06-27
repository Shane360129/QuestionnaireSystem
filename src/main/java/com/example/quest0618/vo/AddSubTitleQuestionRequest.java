package com.example.quest0618.vo;

public class AddSubTitleQuestionRequest {

    private int titleId;
    private String subTitleQuestion;
    private int sort;
    private boolean mustFill;

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public String getSubTitleQuestion() {
        return subTitleQuestion;
    }

    public void setSubTitleQuestion(String subTitleQuestion) {
        this.subTitleQuestion = subTitleQuestion;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public boolean isMustFill() {
        return mustFill;
    }

    public void setMustFill(boolean mustFill) {
        this.mustFill = mustFill;
    }
}
