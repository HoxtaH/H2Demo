package com.example;

import javax.persistence.*;

/**
 * Created by tyrellhoxter on 6/13/16.
 */

@Entity
public class HairStyle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "HAIRSTYLE_NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
