package com.example.quest0618.controller;

import com.example.quest0618.service.ifs.UserDataService;
import com.example.quest0618.vo.AddUserDataRequest;
import com.example.quest0618.vo.UserDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserDataController {

    @Autowired
    UserDataService userDataService;

    @PostMapping
    public UserDataResponse addUserData(@RequestBody AddUserDataRequest addUserDataRequest){
        return userDataService.addUserData(addUserDataRequest);
    }
}
