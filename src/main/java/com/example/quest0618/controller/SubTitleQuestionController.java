package com.example.quest0618.controller;

import com.example.quest0618.service.ifs.SubTitleQuestionSerivice;
import com.example.quest0618.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SubTitleQuestionController {

    @Autowired
    private SubTitleQuestionSerivice subTitleQuestionSerivice;

    @PostMapping(value = "addSubTitleQuestion")
    public SubTitleQuestionResponse addSubTitleQuestion(@RequestBody AddSubTitleQuestionRequest addSubTitleQuestionRequest) {
        return subTitleQuestionSerivice.addSubTitleQuestion(addSubTitleQuestionRequest);
    }

    @PostMapping(value = "deleteSubTitleQuestion")
    public SubTitleQuestionResponse deleteSubTitleQuestion(@RequestBody DeleteSubTitleQuestionRequest deleteSubTitleQuestionRequest) {
        return subTitleQuestionSerivice.deleteSubTitleQuestion(deleteSubTitleQuestionRequest);
    }

    @PostMapping(value = "editSubTitleQuestion")
    public SubTitleQuestionResponse editSubTitleQuestion(@RequestBody EditSubTitleQuestionRequest editSubTitleQuestionRequest) {
        return subTitleQuestionSerivice.editSubTitleQuestion(editSubTitleQuestionRequest);
    }

    @PostMapping(value = "findSubTitleQuestion")
    public SubTitleQuestionResponse findSubTitleQuestion(@RequestBody FindSubTitleQuestionRequest findSubTitleQuestionRequest){
        return subTitleQuestionSerivice.findSubTitleQuestion(findSubTitleQuestionRequest);
    }

}
