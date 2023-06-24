package com.example.quest0618.service.ifs;

import com.example.quest0618.vo.*;

import java.util.List;

public interface TitleQuestionSerivice {

    public TitleQuestionResponse addTitleQuestion(AddTitleQuestionRequest addTitleQuestionRequest);

    public TitleQuestionResponse findByTitleName(FindTitleByNameRequest findTitleByNameRequest);

    public TitleQuestionResponse editTitleQuestion(EditTitleQuestionRequest editTitleQuestionRequest);

    public TitleQuestionResponse deleteTitleQuestion(DeleteTitleQuestionRequest deleteTitleQuestionRequest);

    public TitleQuestionResponse findAllQuestion(FindAllQuestionRequest findAllQuestionRequest);
}
