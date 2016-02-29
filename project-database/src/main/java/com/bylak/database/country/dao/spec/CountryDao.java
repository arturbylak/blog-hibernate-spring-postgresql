package com.bylak.database.country.dao.spec;

import com.bylak.database.country.entity.CountryEntity;
import java.util.List;

public interface CountryDao {
    List<CountryEntity> findAll();
}
