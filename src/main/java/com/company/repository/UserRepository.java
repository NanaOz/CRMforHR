package com.company.repository;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository<User> extends JpaRepository<com.company.entity.User, Long> {
    com.company.entity.User findByLogin(String login);
}
