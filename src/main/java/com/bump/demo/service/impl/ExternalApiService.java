package com.bump.demo.service.impl;

import com.bump.demo.dao.pojo.SampleData;
import com.bump.demo.service.IExternalApiService;
import com.bump.demo.service.ISampleDataService;
import com.bump.demo.service.pojo.response.ExternalResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiService implements IExternalApiService {


    @Value("${external.api.uri}")
    private String uri;

    @Autowired
    ISampleDataService sampleDataService;

    @Override
    public ExternalResponse getResponse(String username) {
        RestTemplate restTemplate = new RestTemplate();
        ExternalResponse response = restTemplate.getForObject(uri + username, ExternalResponse.class);

        SampleData data = new SampleData();

        data.setName(response.getName());
        data.setNumOfFollowers(response.getNumOfFollowers());
        sampleDataService.save(data);
        return response;

    }
}
