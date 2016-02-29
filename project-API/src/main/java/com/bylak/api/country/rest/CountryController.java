package com.bylak.api.country.rest;

import com.bylak.core.country.CountryService;
import com.bylak.database.country.entity.CountryEntity;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/countries")
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(final CountryService countryService) {
        this.countryService = countryService;
    }

    @RequestMapping
    public List<CountryEntity> getAllCountries() {
        final List<CountryEntity> allCountries = countryService.findAll();

        return Collections.emptyList();
    }
}
