package com.gaoxu.springboot.controller;

import com.gaoxu.springboot.pojo.Sms;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Random;

/**
 * 用来发送短信验证码的控制器
 * @author GAOXU
 */

@Controller
@RequestMapping("/sms")
public class SmsConteoller {

    /**
     * 本函数将用于发送短信验证码
     * 使用@RequestBody目的是不让内容再链接里显示出来
     * @param phoneNumber
     */
    @RequestMapping( "/sendCode/{phoneNumber}/{code}")
    public String sms(@PathVariable("phoneNumber") String phoneNumber, @PathVariable("code") String codeText){
        Sms sms = new Sms();
        sms.setPhoneNumber(phoneNumber);
        sms.setMinute(5);

        //随机生成6位数
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++)
        {
            code += random.nextInt(10);
        }
        sms.setCode(code);
        //对应腾讯云的SDK ID
        int appId = 1400578548;
        //对应腾讯云的appKey
        String appKey = "a9f19e2b6e8d74b42542349696eb16e7";
        //发送短信需要的模板id
        int templateId = 1146916;
        //发送短信需要的签名, 在签名管理中查看
        String smsSign = "kyoshiki";

        //发送短信具体的操作
        try {
            //短信里具体用到的参数
            String[] params = {sms.getCode(), Integer.toString(sms.getMinute())};
            //发送一条短信
            SmsSingleSender smsSingleSender = new SmsSingleSender(appId, appKey);
            //返回结果
            SmsSingleSenderResult smsSingleSenderResult = smsSingleSender.sendWithParam("86", sms.getPhoneNumber(), templateId, params, smsSign, "", "");
            System.out.println(smsSingleSenderResult);
        }catch (HTTPException e){
            e.printStackTrace();
        }catch (JSONException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        if (codeText == code){
            return "regist";
        }
        return "false";
    }



}
