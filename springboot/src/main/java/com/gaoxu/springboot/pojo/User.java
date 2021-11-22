package com.gaoxu.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * user表的实体类
 * @author HUAWEI
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userid;
    private String name;
    private String password;
    private String phone;
    private String sex;
    private int age;
    private Date registrationTime;
    private String email;
    private String signature;
    private char identity;
    private String qq;
}
