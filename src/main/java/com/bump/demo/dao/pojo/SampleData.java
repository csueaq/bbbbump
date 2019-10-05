package com.bump.demo.dao.pojo;



import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="sampleData")
public class SampleData {

    @Id
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
