package com.example.quest0618.service.impl;

import com.example.quest0618.constants.RtnCode;
import com.example.quest0618.entity.AnswerType;
import com.example.quest0618.entity.SubTitleQuestion;
import com.example.quest0618.entity.TitleQuestion;
import com.example.quest0618.repository.AnswerTypeDao;
import com.example.quest0618.repository.SubTitleQuestionDao;
import com.example.quest0618.repository.TitleQuestionDao;
import com.example.quest0618.service.ifs.AnswerTypeService;
import com.example.quest0618.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnswerTypeImpl implements AnswerTypeService {

    @Autowired
    AnswerTypeDao answerTypeDao;
    @Autowired
    TitleQuestionDao titleQuestionDao;
    @Autowired
    SubTitleQuestionDao subTitleQuestionDao;

    @Override
    public AnswerTypeResponse addAnswerType(AddAnswerTypeResquest addAnswerTypeResquest) {
        AnswerType answerType = new AnswerType();
        answerType.setAnswerOption(addAnswerTypeResquest.getAnswerOption());
        answerType.setOptionContent(addAnswerTypeResquest.getOptionContent());
        answerType.setSubtitleId(addAnswerTypeResquest.getSubtitleId());
        answerTypeDao.save(answerType);

        return new AnswerTypeResponse(RtnCode.ADD_SUBTITLE_SUCCESS.getMessage());
    }

    @Override
    public AnswerTypeResponse deleteAnswerType(DeleteAnswerTypeRequest deleteAnswerTypeRequest) {

        Optional<AnswerType> answerType = answerTypeDao.findById(deleteAnswerTypeRequest.getAnswerTypeId());
        answerTypeDao.deleteById(deleteAnswerTypeRequest.getAnswerTypeId());

        return new AnswerTypeResponse(RtnCode.EDIT_SUCCESS.getMessage());
    }

    @Override
    public AnswerTypeResponse editAnswerType(EditAnswerTypeRequest editAnswerTypeRequest) {
        Optional<AnswerType> answerType = answerTypeDao.findById(editAnswerTypeRequest.getAnswerTypeId());
        answerType.get().setAnswerOption(editAnswerTypeRequest.getAnswerOption());
        answerType.get().setOptionContent(editAnswerTypeRequest.getOptionContent());
        answerType.get().setSubtitleId(editAnswerTypeRequest.getSubtitleId());
        answerTypeDao.save(answerType.get());
        return new AnswerTypeResponse(RtnCode.EDIT_SUCCESS.getMessage() );
    }

    @Override
    public AnswerTypeResponse findAnswerType(FindAnswerTypeRequest findAnswerTypeRequest) {

        List<AnswerType> answerType = answerTypeDao.findAllBySubtitleId(findAnswerTypeRequest.getSubTitleId());
        return new AnswerTypeResponse(answerType);
    }

    @Override
    public AnswerTypeResponse getAllQuestions(GetAllQuestionsRequest getAllQuestionsRequest) {

        List<SubTitleQuestion> allQuestions = subTitleQuestionDao.findAllByTitleId(getAllQuestionsRequest.getTitleId());
        List<Integer> subTitleIdList = new ArrayList<>();
        SubTitleQuestion subTitleQuestion = new SubTitleQuestion();
        for(SubTitleQuestion item : allQuestions){
            subTitleIdList.add(item.getSubtitleId());
        }
            List<AnswerType> allAnswerTypeList = answerTypeDao.findBySubtitleIdIn(subTitleIdList);
        return new AnswerTypeResponse(RtnCode.FIND_SUCCESS.getMessage(), allAnswerTypeList);
    }


}
