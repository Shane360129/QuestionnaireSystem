package com.example.quest0618.service.ifs;

import com.example.quest0618.vo.*;

public interface AnswerTypeService {

    public AnswerTypeResponse addAnswerType(AddAnswerTypeResquest addAnswerTypeResquest);

    public AnswerTypeResponse deleteAnswerType(DeleteAnswerTypeRequest deleteAnswerTypeRequest);

    public AnswerTypeResponse editAnswerType(EditAnswerTypeRequest editAnswerTypeRequest);

    public AnswerTypeResponse findAnswerType(FindAnswerTypeRequest findAnswerTypeRequest);

    public AnswerTypeResponse getAllQuestions(GetAllQuestionsRequest getAllQuestionsRequest);
}
