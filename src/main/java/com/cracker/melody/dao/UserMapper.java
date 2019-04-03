package com.cracker.melody.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cracker.melody.model.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
