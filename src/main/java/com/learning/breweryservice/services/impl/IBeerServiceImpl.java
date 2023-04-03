package com.learning.breweryservice.services.impl;

import com.learning.breweryservice.services.IBeerService;
import com.learning.breweryservice.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IBeerServiceImpl implements IBeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
