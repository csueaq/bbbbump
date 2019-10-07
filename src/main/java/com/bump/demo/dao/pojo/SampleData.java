package com.bump.demo.dao.pojo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SampleData {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer numOfFollowers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumOfFollowers() {
        return numOfFollowers;
    }

    public void setNumOfFollowers(Integer numOfFollowers) {
        this.numOfFollowers = numOfFollowers;
    }
}
