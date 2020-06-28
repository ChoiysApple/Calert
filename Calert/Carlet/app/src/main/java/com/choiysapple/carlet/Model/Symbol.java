package com.choiysapple.carlet.Model;

import java.io.Serializable;

// Symbol data format
public class Symbol implements Serializable {
    public String name;
    public String img;
    public String color;
    public String shape;
    public String description;


    // Constructor
    public Symbol (String name, String img, String color, String shape, String description){
        this.name = name;
        this.img = img;
        this.color = color;
        this.shape = shape;
        this.description = description;
    }
}
