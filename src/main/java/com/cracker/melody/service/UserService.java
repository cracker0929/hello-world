package com.cracker.melody.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.cracker.melody.model.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserService {
    public List<User>  getUserList(Wrapper<User> wrapper);
    public List<User>  getUserPage(RowBounds rowBounds, Wrapper<User> wrapper);
}
