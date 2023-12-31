package com.example.quest0618.controller;


import com.example.quest0618.service.ifs.TitleQuestionSerivice;
import com.example.quest0618.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class TitleQuestionController {

    @Autowired
    TitleQuestionSerivice titleQuestionSerivice;

    @PostMapping(value = "addTitle")
    public TitleQuestionResponse titleQuestionResponse(@RequestBody AddTitleQuestionRequest addTitleQuestionRequest){
        return titleQuestionSerivice.addTitleQuestion(addTitleQuestionRequest);
    }

    @PostMapping(value = "findTitle")
    public TitleQuestionResponse titleQuestionResponse(@RequestBody FindTitleByNameRequest findTitleByNameRequest){
        return titleQuestionSerivice.findByTitleId(findTitleByNameRequest);
    }

        @PostMapping(value = "editTitleQuestion")
    public TitleQuestionResponse editTitleQuestion(@RequestBody EditTitleQuestionRequest editTitleQuestionRequest){
        return titleQuestionSerivice.editTitleQuestion(editTitleQuestionRequest);
    }

    @PostMapping(value = "deleteQuestion")
    public TitleQuestionResponse deleteTitleQuestion(@RequestBody DeleteTitleQuestionRequest deleteTitleQuestionRequest){
        return titleQuestionSerivice.deleteTitleQuestion(deleteTitleQuestionRequest);
    }

    @GetMapping(value = "findAllQuestion")
    public TitleQuestionResponse findAllQuestion(){
        return titleQuestionSerivice.findAllQuestion();
    }
}
