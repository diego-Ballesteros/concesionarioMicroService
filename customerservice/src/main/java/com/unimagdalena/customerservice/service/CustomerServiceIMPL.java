package com.unimagdalena.customerservice.service;

import com.unimagdalena.customerservice.persistence.entity.CustomerEntity;
import com.unimagdalena.customerservice.persistence.repository.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceIMPL implements ICustomerService{

    private final ICustomerRepository customerRepository;

    public CustomerServiceIMPL(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerEntity> getAll() {
        return this.customerRepository.findAll();
    }
}
