package com.gaoxu.springboot.controller;

import com.gaoxu.springboot.pojo.User;
import com.gaoxu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author GAOUX
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询user表中的所有user信息
     * @return User列表
     */
    @RequestMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    /**
     * 根据userId查询user信息
     * '@RequestParam' 配合 @RequestMapping使用可以获取到路径中的参数
     * @param userId user的id
     * @return User
     */
    @RequestMapping(value = "/findUserById", method = RequestMethod.POST)
    public User findUserById(@RequestParam int userId){
        return userService.findUserById(userId);
    }

    /**
     * 增加user
     * @param user user
     * @return 无
     * */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public int addUser(@RequestParam User user){
        return userService.addUser(user);
    }


    /**
     * 修改user信息
     * @param user user
     * @return 无
     */
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public int updateUser(@RequestParam User user){
        return userService.updateUser(user);
    }

    /**
     * 根据userId 删除user
     * @param userId userId
     * @return 无
     */
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public int deleteUser(@RequestParam int userId){
        return userService.deleteUser(userId);
    }

    /**
     * 根据提供的旧密码来修改密码
     * @param oldPassword 输入的旧密码
     * @param newPassword 输入的新密码
     * @return 返回User对象，更新数据库
     */
    @RequestMapping(value = "/changePassword", method = RequestMethod.POST)
    public String changePassword(@RequestParam String oldPassword, @RequestParam String newPassword){
        /*
        1. 获取目前登录user信息
        2. 填写旧密码，与当前登录的user的密码进行匹配，如果填写正确，进入下一步，否则报错
        3. 填写两遍新密码，判断两遍密码是否符合编写标准，是否两边相同，符合以上条件则会修改当前user密码，传如数据库
         */

        return "ok";
    }

}
