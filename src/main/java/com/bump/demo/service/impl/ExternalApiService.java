package com.bump.demo.service.impl;

import com.bump.demo.service.IExternalApiService;
import com.bump.demo.service.pojo.response.ExternalResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiService implements IExternalApiService {


    @Value("${external.api.uri}")
    private String uri;

    @Override
    public List<ExternalResponse> getResponses() {
        RestTemplate restTemplate = new RestTemplate();
        List<ExternalResponse> response = restTemplate.getForObject(uri, List.class);

        return response;

    }
}
