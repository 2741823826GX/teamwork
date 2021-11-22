package com.gaoxu.springboot.controller;

import com.gaoxu.springboot.pojo.UserFeedback;
import com.gaoxu.springboot.service.UserFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author GAOXU
 */
@RestController
public class UserFeedbackController {
    /*@Autowired
    private UserFeedbackService userFeedbackService;

    @GetMapping("/findAllUserFeedback")
    public List<UserFeedback> findAllUserFeedback(){
        
    }

    @GetMapping("/findUserFeedbackById")
    public UserFeedback findUserFeedbackById(int feedbackId){

    }

    @GetMapping("/addUserFeedback")
    public int addUserFeedback(UserFeedback userFeedback){

    }

    @GetMapping("/updateFeedback")
    public int updateFeedback(UserFeedback userFeedback){

    }

    @GetMapping("/deleteFeedback")
    public int deleteFeedback(int feedbackId){

    }*/
}
