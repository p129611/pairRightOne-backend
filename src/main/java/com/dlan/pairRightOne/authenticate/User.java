package com.dlan.pairRightOne.authenticate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class User {

    @Id
    private UUID uuid;
    private String username;
    private UserStatus userStatus;
    private UUID chatSessionId;

    public static enum UserStatus {
        SEEKING,
        CHATTING
    }
}
