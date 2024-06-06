package com.unimagdalena.customerservice.service;

import com.unimagdalena.customerservice.persistence.entity.CustomerEntity;

import java.util.List;

public interface ICustomerService {
    List<CustomerEntity> getAll();
}
