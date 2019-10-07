package com.bump.demo.service.impl;

import com.bump.demo.dao.pojo.SampleData;
import com.bump.demo.dao.repo.SampleDataRepository;
import java.util.List;

import com.bump.demo.service.ISampleDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleDataService implements ISampleDataService {

    @Autowired
    SampleDataRepository sampleDataRepository;

    public List<SampleData> list() {
        return sampleDataRepository.findAll();
    }

    public SampleData getById(int id) {
        return sampleDataRepository.getValueById(id);
    }

    @Override
    public SampleData save(SampleData sampleData) {
        return sampleDataRepository.save(sampleData);
    }

}
