package com.example.quest0618.service.ifs;

import com.example.quest0618.vo.AddUserDataRequest;
import com.example.quest0618.vo.UserDataResponse;

public interface UserDataService {

    public UserDataResponse addUserData(AddUserDataRequest addUserDataRequest);
}
