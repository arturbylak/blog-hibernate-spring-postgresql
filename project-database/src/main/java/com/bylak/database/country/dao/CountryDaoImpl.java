package com.bylak.database.country.dao;

import com.bylak.database.country.dao.spec.CountryDao;
import com.bylak.database.country.entity.CountryEntity;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CountryDaoImpl implements CountryDao {
    private SessionFactory sessionFactory;

    @Autowired
    public CountryDaoImpl(final SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<CountryEntity> findAll() {
        return sessionFactory.getCurrentSession()
                             .createCriteria(CountryEntity.class)
                             .list();
    }
}
