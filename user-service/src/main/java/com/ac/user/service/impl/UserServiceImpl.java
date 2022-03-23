package com.ac.user.service.impl;

import com.ac.user.dao.UserDao;
import com.ac.user.entity.User;
import com.ac.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserDao userDao;

    public User getUser(String id) {
        return userDao.get(id);
    }
}
