package com.lucius.user.service.impl;

import com.lucius.user.dao.IUserDao;
import com.lucius.user.entity.User;
import com.lucius.user.service.IUserService;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    public void add(User user) {
        userDao.add(user);
    }
}
