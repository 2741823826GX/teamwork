package com.gaoxu.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

/**
 * userfeedback（用户反馈表）对应的实体
 * @author GAOXU
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFeedback {
    private int feedbackId;
    private int userId;
    private DateTime feedbackTime;
    private String feedbackContent;
    private char feedbackStatus;
}
