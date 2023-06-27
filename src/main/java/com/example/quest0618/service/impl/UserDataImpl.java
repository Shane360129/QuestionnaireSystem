package com.example.quest0618.service.impl;


import com.example.quest0618.constants.RtnCode;
import com.example.quest0618.entity.UserData;
import com.example.quest0618.repository.UserDataDao;
import com.example.quest0618.service.ifs.UserDataService;
import com.example.quest0618.vo.AddUserDataRequest;
import com.example.quest0618.vo.UserDataResponse;
import org.springframework.stereotype.Service;

@Service
public class UserDataImpl implements UserDataService {

    private UserDataDao userDataDao;

    @Override
    public UserDataResponse addUserData(AddUserDataRequest addUserDataRequest) {

        UserData userData = new UserData();
        userData.setUserName(addUserDataRequest.getUserName());
        userData.setUserAge(addUserDataRequest.getUserAge());
        userData.setUserEmail(addUserDataRequest.getUserEmail());
        userData.setUserPhone(addUserDataRequest.getUserPhone());
        userDataDao.save(userData);
        return new UserDataResponse(RtnCode.EDIT_SUCCESS.getMessage());
    }
}
