package com.Noted.NoteddPlusPlus.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Note {
    @Id
    @GeneratedValue()
    private Long id;

    private String category;
    private String title;
    private String description;
    private Date date;

    public Note(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
