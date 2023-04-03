package com.learning.breweryservice.services;

import com.learning.breweryservice.web.model.BeerDto;

import java.util.UUID;

public interface IBeerService {
    BeerDto getBeerById(UUID beerId);
}
