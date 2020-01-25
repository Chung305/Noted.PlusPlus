package com.Noted.NoteddPlusPlus.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Note {
    @Id
    @GeneratedValue()
    private Long id;

    private String category;
    private String desciption;
    private Date date;

    public Note(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
