package com.dlan.pairRightOne.authenticate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUserByStatus(User.UserStatus userStatus) {
        return userDao.findByUserStatus(userStatus);
    }
}
