package com.golosinaspitufos.security.repository;

import com.golosinaspitufos.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
