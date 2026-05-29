package org.example.bankingapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.bankingapplication.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByEmailid(String username);

}
