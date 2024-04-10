package org.example;

import java.io.Serializable;

public class User implements Serializable {
    String userId;
    String userName;
    transient String password;

    public User(String userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }
}
