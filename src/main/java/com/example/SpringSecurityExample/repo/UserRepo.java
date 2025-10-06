package com.example.SpringSecurityExample.repo;

import com.example.SpringSecurityExample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
