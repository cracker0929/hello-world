package com.cracker.melody.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.cracker.melody.dao.UserMapper;
import com.cracker.melody.model.User;
import com.cracker.melody.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImplment implements UserService {
    @Resource
    private UserMapper userMapper;
    public List<User>  getUserList(Wrapper<User> wrapper) {
        return userMapper.selectList(wrapper);
    }

    public List<User>  getUserPage(RowBounds rowBounds, Wrapper<User> wrapper) {
        return userMapper.selectPage(rowBounds,wrapper);
    }
}
