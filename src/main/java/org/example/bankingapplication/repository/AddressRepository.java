package org.example.bankingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.bankingapplication.entities.Address;

public interface AddressRepository  extends JpaRepository<Address, Long>{

}

