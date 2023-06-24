package com.example.quest0618.vo;

public class EditSubTitleQuestionRequest {

    private int subTitleId;
    private String subTitleQuestion;
    private int sort;
    private boolean mustFill;

    public int getSubTitleId() {
        return subTitleId;
    }

    public void setSubTitleId(int subTitleId) {
        this.subTitleId = subTitleId;
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
