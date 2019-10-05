package com.bump.demo.controller;


import com.bump.demo.dao.pojo.SampleData;
import com.bump.demo.service.SampleDataService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleDataController {

    @Autowired
    SampleDataService sampleDataService;

    @GetMapping(value = "/sampleData/list")
    public List<SampleData> list() {
        return sampleDataService.list();
    }

    @GetMapping(value = "/ping")
    public String ping() {
        return "OK";
    }
}
