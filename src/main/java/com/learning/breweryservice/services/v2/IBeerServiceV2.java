package com.learning.breweryservice.services.v2;

import com.learning.breweryservice.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface IBeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveDto(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteBeer(UUID beerId);
}
