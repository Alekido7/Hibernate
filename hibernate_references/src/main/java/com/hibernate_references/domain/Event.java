/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate_references.domain;

/**
 *
 * @author Ale
 */
import java.util.Date;

public class Event {

    private Long id;
    private String title;
    private Date date;

    public Event() {
    }
    
    public Long getId() {
        return id;
    }

    // setId privado
    private void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
