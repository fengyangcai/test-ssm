package com.fyc.ssm.service.impl;

import com.fyc.ssm.mapper.UserMapper;
import com.fyc.ssm.pojo.User;
import com.fyc.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }

    @Override
    public Long addUser(User user) {
      return   userMapper.addUser(user);
    }

    @Override
    public List<User> getAll() {

        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    public Long updateSelect(User user) {
        return userMapper.updateSelect(user);
    }

    public String selectNow(){
       return userMapper.selectNow();
    }

    @Override
    public void deleteByUserId(Long id) {
        userMapper.deleteByUserId(id);
    }
}
