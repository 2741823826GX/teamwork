package com.gaoxu.springboot.service;

import com.gaoxu.springboot.mapper.UserFeedbackMapper;
import com.gaoxu.springboot.pojo.UserFeedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GAOXU
 */
@Service
public class UserFeedbackService {
    @Autowired
    private UserFeedbackMapper userFeedbackMapper;

    public List<UserFeedback> findAllUserFeedback(){
        return userFeedbackMapper.findAllUserFeedback();
    }

    public UserFeedback findUserFeedbackById(int feedbackId){
        return userFeedbackMapper.findUserFeedbackById(feedbackId);
    }

    public int addUserFeedback(UserFeedback userFeedback){
        return userFeedbackMapper.addUserFeedback(userFeedback);
    }

    public int updateFeedback(UserFeedback userFeedback){
        return userFeedbackMapper.updateFeedback(userFeedback);
    }

    public int deleteFeedback(int feedbackId){
        return userFeedbackMapper.deleteFeedback(feedbackId);
    }
}
