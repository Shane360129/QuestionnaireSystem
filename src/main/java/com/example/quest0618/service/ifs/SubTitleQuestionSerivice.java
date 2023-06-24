package com.example.quest0618.service.ifs;

import com.example.quest0618.vo.*;

public interface SubTitleQuestionSerivice {

    public SubTitleQuestionResponse addSubTitleQuestion
            (AddSubTitleQuestionRequest addSubTitleQuestionRequest);

    public SubTitleQuestionResponse deleteSubTitleQuestion
            (DeleteSubTitleQuestionRequest deleteSubTitleQuestionRequest);

    public SubTitleQuestionResponse editSubTitleQuestion
            (EditSubTitleQuestionRequest editSubTitleQuestionRequest);

    public SubTitleQuestionResponse findSubTitleQuestion
            (FindSubTitleQuestionRequest findSubTitleQuestionRequest);

}
