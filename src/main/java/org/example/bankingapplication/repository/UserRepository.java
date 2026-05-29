package org.example.bankingapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.bankingapplication.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByUserName(String userName);
    boolean existsByUserName(String userName);
}

