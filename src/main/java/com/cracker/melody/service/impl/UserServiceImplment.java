package com.cracker.melody.service.impl;

import com.cracker.melody.dao.UserMapper;
import com.cracker.melody.model.User;
import com.cracker.melody.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImplment implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
