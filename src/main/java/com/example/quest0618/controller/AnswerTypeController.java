package com.example.quest0618.controller;

import com.example.quest0618.service.ifs.AnswerTypeService;
import com.example.quest0618.vo.AddAnswerTypeResquest;
import com.example.quest0618.vo.AnswerTypeResponse;
import com.example.quest0618.vo.DeleteAnswerTypeRequest;
import com.example.quest0618.vo.GetAllQuestionsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AnswerTypeController {

    @Autowired
    AnswerTypeService answerTypeService;

    @PostMapping(value = "addAnswerType")
    public AnswerTypeResponse addAnswerType(@RequestBody AddAnswerTypeResquest addAnswerTypeResquest) {
        return answerTypeService.addAnswerType(addAnswerTypeResquest);
    }

    @PostMapping(value = "deleteAnswerType")
    public AnswerTypeResponse deleteAnswerType(@RequestBody DeleteAnswerTypeRequest deleteAnswerTypeRequest) {
        return answerTypeService.deleteAnswerType(deleteAnswerTypeRequest);
    }

    @PostMapping(value = "getAllQuestions")
    public AnswerTypeResponse getAllQuestions(@RequestBody GetAllQuestionsRequest getAllQuestionsRequest) {
        return answerTypeService.getAllQuestions(getAllQuestionsRequest);
    }
}
