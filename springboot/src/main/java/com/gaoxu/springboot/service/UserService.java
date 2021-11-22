package com.gaoxu.springboot.service;

import com.gaoxu.springboot.mapper.UserMapper;
import com.gaoxu.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService层，用于实现UserMapper接口，被UserController，LoginController调用
 * @author Gaoxu
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查看user表的所有user
     * @return User列表
     */
    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

    /**
     * 根据id查询对应的user信息
     * @param userId userId
     * @return User对象
     */
    public User findUserById(int userId){
        return userMapper.findUserById(userId);
    }

    /**
     * 根据name，password查询user
     * @param username 用户名
     * @param password 密码
     * @return User对象
     */
    public User findUserByUsername(String username, String password){
        User user = userMapper.findUserByNamePassword(username, password);
        return user;
    }

    /**
     * 向user表中添加user信息
     * @param user user
     * @return 无
     */
    public int addUser(User user){
        return userMapper.addUser(user);
    }

    /**
     * 更新user信息
     * @param user user
     * @return 无
     */
    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    public int updateUserByPassword(String oldPassword){
        return 1;
    }
    /**
     * 根据id删除User
     * @param userId userID
     * @return 无
     */
    public int deleteUser(int userId){
        return userMapper.deleteUser(userId);
    }


}
