package com.example.quest0618.service.impl;

import com.example.quest0618.constants.RtnCode;
import com.example.quest0618.entity.TitleQuestion;
import com.example.quest0618.repository.TitleQuestionDao;
import com.example.quest0618.service.ifs.TitleQuestionSerivice;
import com.example.quest0618.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TitleQuestionImpl implements TitleQuestionSerivice {

    @Autowired
    private TitleQuestionDao titleQuestionDao;

    @Override
    public TitleQuestionResponse addTitleQuestion(AddTitleQuestionRequest addTitleQuestionRequest) {

        if (addTitleQuestionRequest.getTitle().isEmpty()
                && addTitleQuestionRequest.getTitle().length() > 150) {
            return new TitleQuestionResponse(RtnCode.TITLE_ERROR_CANNOT_EMPTY.getMessage());
        }
        if (addTitleQuestionRequest.getStartTime().isBefore(LocalDateTime.now())) {
            return new TitleQuestionResponse(RtnCode.STARTTIME_IS_ERROR.getMessage());
        }

        TitleQuestion titleQuestion = new TitleQuestion();
        titleQuestion.setTitle(addTitleQuestionRequest.getTitle());
        titleQuestion.setDirections(addTitleQuestionRequest.getDirections());
        titleQuestion.setStartTime(addTitleQuestionRequest.getStartTime());
        titleQuestion.setEndTime(addTitleQuestionRequest.getEndTime());
        titleQuestion.setStatus(addTitleQuestionRequest.isStatus());
        titleQuestion.setCreatTime(LocalDateTime.now());
        titleQuestionDao.save(titleQuestion);
        return new TitleQuestionResponse(RtnCode.ADD_TITLE_SUCCESS.getMessage());
    }

    @Override
    public TitleQuestionResponse findByTitleId(FindTitleByNameRequest findTitleByNameRequest) {
        Optional<TitleQuestion> titleQuestions = titleQuestionDao.findById(findTitleByNameRequest.getTitleId());
        if (titleQuestions.isEmpty()) {
            return new TitleQuestionResponse(RtnCode.TITLE_NOT_FOUND.getMessage());
        }
        return new TitleQuestionResponse(RtnCode.FIND_SUCCESS.getMessage(),titleQuestions.get());
    }

    @Override
    public TitleQuestionResponse editTitleQuestion(EditTitleQuestionRequest editTitleQuestionRequest) {

        TitleQuestion titleQuestion = titleQuestionDao.findByTitle(editTitleQuestionRequest.getTitleName());
        if (titleQuestion == null) {
            return new TitleQuestionResponse(RtnCode.TITLE_NOT_FOUND.getMessage());
        }
        if (titleQuestion.isStatus()) {
            return new TitleQuestionResponse(RtnCode.STATUS_CANNOT_EDIT.getMessage());
        }
        titleQuestion.setTitle(editTitleQuestionRequest.getNewTitle());
        titleQuestion.setDirections(editTitleQuestionRequest.getDirections());
        titleQuestion.setStartTime(editTitleQuestionRequest.getStartTime());
        titleQuestion.setUpdateTime(LocalDateTime.now());
        titleQuestion.setEndTime(editTitleQuestionRequest.getEndTime());
        titleQuestionDao.save(titleQuestion);
        return new TitleQuestionResponse(RtnCode.EDIT_SUCCESS.getMessage());
    }

    @Override
    public TitleQuestionResponse deleteTitleQuestion(DeleteTitleQuestionRequest deleteTitleQuestionRequest) {


        Optional<TitleQuestion> titleQuestion = titleQuestionDao.findById(deleteTitleQuestionRequest.getTitleId());
        if (deleteTitleQuestionRequest.getTitleId() == 0) {
            return new TitleQuestionResponse(RtnCode.CANNOT_EMPTY.getMessage());
        }
        if (titleQuestion.isEmpty()) {
            return new TitleQuestionResponse(RtnCode.TITLE_NOT_FOUND.getMessage());
        }
        titleQuestionDao.delete(titleQuestion.get());
        return new TitleQuestionResponse(RtnCode.EDIT_SUCCESS.getMessage());
    }

    @Override
    public TitleQuestionResponse findAllQuestion() {
        List<TitleQuestion> allQuestion = titleQuestionDao.findAll();
        return new TitleQuestionResponse(RtnCode.FIND_SUCCESS.getMessage(), allQuestion);
    }
}
