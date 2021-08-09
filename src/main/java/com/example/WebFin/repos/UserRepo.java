package com.example.WebFin.repos;

import com.example.WebFin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsernameIgnoreCase(String username);

    User findByActivationCode(String code);
}
