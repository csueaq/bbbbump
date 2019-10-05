package com.bump.demo.service;

import com.bump.demo.dao.pojo.SampleData;
import com.bump.demo.dao.repo.SampleDataRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleDataService {

    @Autowired
    SampleDataRepository sampleDataRepository;

    public List<SampleData> list() {
        return sampleDataRepository.findAll();
    }
}
