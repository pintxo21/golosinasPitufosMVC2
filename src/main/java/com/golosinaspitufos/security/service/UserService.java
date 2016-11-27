package com.golosinaspitufos.security.service;

import com.golosinaspitufos.security.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
