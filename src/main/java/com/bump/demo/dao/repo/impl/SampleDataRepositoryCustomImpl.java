package com.bump.demo.dao.repo.impl;

import com.bump.demo.dao.pojo.SampleData;
import com.bump.demo.dao.repo.SampleDataRepositoryCustom;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.EntityManager;

public class SampleDataRepositoryCustomImpl implements SampleDataRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    private static String TEST_QUERY = "select id, data from sample_data where id = ?";
    @Override
    public SampleData getValueById(int id) {
        Query query = entityManager.createNativeQuery(TEST_QUERY, SampleData.class);
        query.setParameter(1, id);

        return (SampleData) query.getSingleResult();
    }
}
