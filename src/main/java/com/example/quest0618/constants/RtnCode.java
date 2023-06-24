package com.example.quest0618.constants;

public enum RtnCode {


    //成功訊息
    ADD_TITLE_SUCCESS("200","新增問卷主題成功"),
    EDIT_SUCCESS("200","更新成功"),
    FIND_SUCCESS("200","查詢成功"),
    ADD_SUBTITLE_SUCCESS("200","新增題目成功"),



    //失敗訊息
    TITLE_ERROR_CANNOT_EMPTY("400","輸入主題為空或超出字數"),
    STARTTIME_IS_ERROR("400", "開始時間不得小於當下時間"),
    STATUS_CANNOT_EDIT("400", "開放狀態無法編輯"),
    CANNOT_EMPTY("400","輸入值不得為空"),
    TITLE_NOT_FOUND("400","找不到該筆問券"),
    SORT_CANNOT_REPEAT("400","排序不得重複")
    ;


    private String code;

    private String message;

    RtnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}