package com.fyc.ssm.mapper;

import com.fyc.ssm.pojo.User;

import java.util.List;


public interface UserMapper {


    List<User> selectAll();

    public String selectNow();

    User queryUserByName(String name);

    Long addUser(User user);

    Long updateSelect(User user);
    void deleteByUserId(Long id);

}
