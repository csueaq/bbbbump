package com.bump.demo.controller;


import com.bump.demo.dao.pojo.SampleData;
import com.bump.demo.service.IExternalApiService;
import com.bump.demo.service.ISampleDataService;
import java.util.List;

import com.bump.demo.service.pojo.response.ExternalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleDataController {

    @Autowired
    ISampleDataService sampleDataService;

    @Autowired
    IExternalApiService externalApiService;

    @GetMapping(value = "/sampleData/list")
    public List<SampleData> list() {
        return sampleDataService.list();
    }

    @GetMapping(value = "/sampleData/{id}")
    public SampleData getById(@PathVariable int id) {
        return sampleDataService.getById(id);
    }

    @GetMapping(value = "/ping")
    public String ping() {
        return "OK";
    }

    @GetMapping(value = "/externalDate/getData/{username}")
    public ExternalResponse listExternalApiData(@PathVariable String username) {
        return externalApiService.getResponse(username);
    }

    @PostMapping(value = "/sampleData")
    public SampleData update(@RequestBody SampleData sampleData) {
        return sampleDataService.save(sampleData);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping(value = "/sampleData")
    public SampleData create(@RequestBody SampleData sampleData) {
        return sampleDataService.save(sampleData);
    }




}
