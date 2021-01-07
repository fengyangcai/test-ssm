package com.fyc.ssm.service;

import com.fyc.ssm.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();
    public String selectNow();
    User queryUserByName(String name);
    Long addUser(User user);
    Long updateSelect(User user);
    void deleteByUserId(Long id);
}
