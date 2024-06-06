package com.unimagdalena.customerservice.controller;

import com.unimagdalena.customerservice.persistence.entity.CustomerEntity;
import com.unimagdalena.customerservice.service.ICustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("1.0/customer")
public class CustomerController {

    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    public ResponseEntity<List<CustomerEntity>> getAll(){
        return ResponseEntity.ok(this.customerService.getAll());
    }
}
