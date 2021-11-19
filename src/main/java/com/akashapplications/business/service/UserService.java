package com.akashapplications.business.service;

import com.akashapplications.data.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
