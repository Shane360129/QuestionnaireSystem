package com.example.quest0618.service.impl;

import com.example.quest0618.constants.RtnCode;
import com.example.quest0618.entity.SubTitleQuestion;
import com.example.quest0618.repository.SubTitleQuestionDao;
import com.example.quest0618.service.ifs.SubTitleQuestionSerivice;
import com.example.quest0618.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class SubTitleQuestionImpl implements SubTitleQuestionSerivice {

    @Autowired
    private SubTitleQuestionDao subTitleQuestionDao;

    @Override
    public SubTitleQuestionResponse addSubTitleQuestion(AddSubTitleQuestionRequest addSubTitleQuestionRequest) {

        SubTitleQuestion subTitleQuestion = new SubTitleQuestion();
        List<SubTitleQuestion> subTitle = subTitleQuestionDao.findAllById(Collections.singleton(addSubTitleQuestionRequest.getSubTitleId()));
        for (SubTitleQuestion item : subTitle) {
            if (item.getSort() == addSubTitleQuestionRequest.getSort()) {
                return new SubTitleQuestionResponse(RtnCode.SORT_CANNOT_REPEAT.getMessage());
            }
        }
        if (addSubTitleQuestionRequest.getSubTitleQuestion().isEmpty()
                || addSubTitleQuestionRequest.getSubTitleId() == 0) {
            return new SubTitleQuestionResponse(RtnCode.CANNOT_EMPTY.getMessage());
        }
        subTitleQuestion.setTitleId(addSubTitleQuestionRequest.getSubTitleId());
        subTitleQuestion.setSubTitleQuestion(addSubTitleQuestionRequest.getSubTitleQuestion());
        subTitleQuestion.setSort(addSubTitleQuestionRequest.getSort());
        subTitleQuestion.setMustFill(addSubTitleQuestionRequest.isMustFill());
        subTitleQuestionDao.save(subTitleQuestion);

        return new SubTitleQuestionResponse(RtnCode.ADD_TITLE_SUCCESS.getMessage());
    }

    @Override
    public SubTitleQuestionResponse deleteSubTitleQuestion(DeleteSubTitleQuestionRequest deleteSubTitleQuestionRequest) {
        Optional<SubTitleQuestion> subTitleQuestion = subTitleQuestionDao.findById(deleteSubTitleQuestionRequest.getSubTitleId());
        if (deleteSubTitleQuestionRequest.getSubTitleId() == 0) {
            return new SubTitleQuestionResponse(RtnCode.CANNOT_EMPTY.getMessage());
        }
        if (subTitleQuestion.isEmpty()) {
            return new SubTitleQuestionResponse(RtnCode.TITLE_NOT_FOUND.getMessage());
        }

        subTitleQuestionDao.delete(subTitleQuestion.get());
        return new SubTitleQuestionResponse(RtnCode.EDIT_SUCCESS.getMessage());
    }

    @Override
    public SubTitleQuestionResponse editSubTitleQuestion(EditSubTitleQuestionRequest editSubTitleQuestionRequest) {
        System.out.println(editSubTitleQuestionRequest);
        Optional<SubTitleQuestion> subTitleQuestion = subTitleQuestionDao.findById(editSubTitleQuestionRequest.getSubTitleId());
        if(!subTitleQuestion.isPresent()){
            return new SubTitleQuestionResponse(RtnCode.TITLE_NOT_FOUND.getMessage());
        }
        if(editSubTitleQuestionRequest.getSubTitleQuestion().isEmpty()
                ||editSubTitleQuestionRequest.getSubTitleQuestion() == null){
            return new SubTitleQuestionResponse(RtnCode.TITLE_ERROR_CANNOT_EMPTY.getMessage());
        }
        subTitleQuestion.get().setSubTitleQuestion(editSubTitleQuestionRequest.getSubTitleQuestion());
        subTitleQuestion.get().setMustFill(editSubTitleQuestionRequest.isMustFill());
        subTitleQuestionDao.save(subTitleQuestion.get());

        return new SubTitleQuestionResponse(RtnCode.EDIT_SUCCESS.getMessage());
    }

    @Override
    public SubTitleQuestionResponse findSubTitleQuestion(FindSubTitleQuestionRequest findSubTitleQuestionRequest){

        List<SubTitleQuestion> subTitleQuestion = subTitleQuestionDao.findAllByTitleId(findSubTitleQuestionRequest.getTitleId());
        return new SubTitleQuestionResponse(RtnCode.FIND_SUCCESS.getMessage(),subTitleQuestion);
    }
}
