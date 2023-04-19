package com.learning.breweryservice.web.controller;

import com.learning.breweryservice.services.ICustomerService;
import com.learning.breweryservice.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId) {

        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handelPost(@RequestBody CustomerDto customerDto) {

        CustomerDto saveDto = customerService.saveDto(customerDto);

        HttpHeaders headers = new HttpHeaders();

        headers.add("Location", "/api/v1/customer" + saveDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity handleUpdate(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto) {

        customerService.updateCustomer(customerId, customerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId") UUID customerId) {

        customerService.deleteCustomer(customerId);
    }

}
