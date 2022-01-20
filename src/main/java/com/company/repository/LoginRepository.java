package com.company.repository;

import com.company.entity.Login;
import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByLogin(String login);
}
