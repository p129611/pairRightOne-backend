package com.dlan.pairRightOne.authenticate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserDao extends JpaRepository<User, UUID> {

    List<User> findByUserStatus(User.UserStatus userStatus);
}
