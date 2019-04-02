package com.cracker.melody.dao;

import com.cracker.melody.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> getAll();
    public User getOne(long userId);
}
