package com.example.quest0618.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subtitlequestion")
public class SubTitleQuestion {

    @Id
    @Column(name = "subtitleId")
    private int subtitleId;
    @Column(name = "titleId")
    private int titleId;
    @Column(name = "subTitleQuestion")
    private String subTitleQuestion;
    @Column(name = "sort")
    private int sort;
    @Column(name = "mustFill")
    private boolean mustFill;

    public int getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(int subtitleId) {
        this.subtitleId = subtitleId;
    }

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
