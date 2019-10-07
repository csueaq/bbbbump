package com.bump.demo.dao.repo;

import com.bump.demo.dao.pojo.SampleData;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SampleDataRepository extends CrudRepository<SampleData, Long>, SampleDataRepositoryCustom {

    List<SampleData> findAll();
    SampleData save(SampleData sampleData);
}
