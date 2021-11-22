package com.gaoxu.springboot;

import com.gaoxu.springboot.pojo.User;
import com.gaoxu.springboot.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {

    }

}
