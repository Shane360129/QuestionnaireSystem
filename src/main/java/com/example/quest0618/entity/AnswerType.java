package com.example.quest0618.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answertype")
public class AnswerType {

    @Id
    @Column(name = "answerTypeId")
    private int answerTypeId;
    @Column(name = "answerOption")
    private String answerOption;
    @Column(name = "optionContent")
    private String optionContent;
    @Column(name = "subtitleId")
    private  int subtitleId;

    public int getAnswerTypeId() {
        return answerTypeId;
    }

    public void setAnswerTypeId(int answerTypeId) {
        this.answerTypeId = answerTypeId;
    }

    public String getAnswerOption() {
        return answerOption;
    }

    public void setAnswerOption(String answerOption) {
        this.answerOption = answerOption;
    }

    public String getOptionContent() {
        return optionContent;
    }

    public void setOptionContent(String optionContent) {
        this.optionContent = optionContent;
    }

    public int getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(int subtitleId) {
        this.subtitleId = subtitleId;
    }
}
