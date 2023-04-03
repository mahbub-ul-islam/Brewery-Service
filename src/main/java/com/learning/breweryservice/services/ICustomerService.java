package com.learning.breweryservice.services;

import com.learning.breweryservice.web.model.CustomerDto;

import java.util.UUID;

public interface ICustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
