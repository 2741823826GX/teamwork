package com.gaoxu.springboot.mapper;


import com.gaoxu.springboot.pojo.User;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 对用户表的操作
 * （管理员）查找用户表，删除用户
 * （用户）添加用户（注册），修改（密码，个人信息）
 * @author GAOXU
 */
@Repository
public interface UserMapper {

    /**
     * 查看user表的所有user
     * @return User列表
     */
    List<User> findAllUser();

    /**
     * 根据id查询对应的user信息
     * @param userId 用户id
     * @return User对象
     */
    User findUserById(int userId);

    /**
     * 根据name，password查询user数据
     * @param name 用户名, password 密码
     * @return User对象
     */
    User findUserByNamePassword(String name, String password);

    /**
     * 向user表中添加user信息
     * @param user User对象
     * @return 无
     */
    int addUser(User user);

    /**
     * 更新user信息
     * @param user User对象
     * @return 无
     */
    int updateUser(User user);

    /**
     * 根据id删除User
     * @param userId 用户id
     * @return 无
     */
    int deleteUser(int userId);

    /**
     * 用户注册功能
     * @param phoneNmuber
     * @return
     */
}
