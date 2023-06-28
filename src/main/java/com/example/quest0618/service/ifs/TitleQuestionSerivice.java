package com.example.quest0618.service.ifs;

import com.example.quest0618.vo.*;

public interface TitleQuestionSerivice {

    public TitleQuestionResponse addTitleQuestion(AddTitleQuestionRequest addTitleQuestionRequest);

    public TitleQuestionResponse findByTitleId(FindTitleByNameRequest findTitleByNameRequest);

    public TitleQuestionResponse editTitleQuestion(EditTitleQuestionRequest editTitleQuestionRequest);

    public TitleQuestionResponse deleteTitleQuestion(DeleteTitleQuestionRequest deleteTitleQuestionRequest);

    public TitleQuestionResponse findAllQuestion();
}
