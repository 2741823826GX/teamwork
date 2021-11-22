package com.gaoxu.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 短信实体，用来发送短信
 * @author Gaoxu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sms {
    /**
     * 接收短信验证码的手机号
     */
    private String phoneNumber;

    /**
     * 短信验证码
     */
    private String code;


    /**
     * 短信验证码的时间
     */
    private int minute;
}
