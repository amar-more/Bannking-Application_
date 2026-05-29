package org.example.bankingapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.bankingapplication.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(String roleName);

}
