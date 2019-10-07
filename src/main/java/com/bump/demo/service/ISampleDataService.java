package com.bump.demo.service;

import com.bump.demo.dao.pojo.SampleData;

import java.util.List;

public interface ISampleDataService {

    List<SampleData> list();

    SampleData getById(int id);

    SampleData save(SampleData sampleData);
}
