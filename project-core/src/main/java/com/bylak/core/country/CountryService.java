package com.bylak.core.country;

import com.bylak.database.country.dao.spec.CountryDao;
import com.bylak.database.country.entity.CountryEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private final CountryDao countryDao;

    @Autowired
    public CountryService(final CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public List<CountryEntity> findAll() {
        final List<CountryEntity> allCountries = countryDao.findAll();

        return allCountries;
    }
}
