package com.learning.breweryservice.services.impl;

import com.learning.breweryservice.services.ICustomerService;
import com.learning.breweryservice.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Sam")
                .build();
    }
}
