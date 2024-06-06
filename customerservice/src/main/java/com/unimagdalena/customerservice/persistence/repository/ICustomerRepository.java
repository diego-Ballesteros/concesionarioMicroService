package com.unimagdalena.customerservice.persistence.repository;

import com.unimagdalena.customerservice.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ICustomerRepository extends JpaRepository<CustomerEntity, UUID> {
}
