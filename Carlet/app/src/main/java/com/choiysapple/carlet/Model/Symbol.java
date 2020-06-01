package com.choiysapple.carlet.Model;

// Symbol data format
public class Symbol {
    public int number;
    public String name;
    public String img;
    public String color;
    public String shape;
    public String description;


    // Constructor
    public void Symbol (int number, String name, String img, String color, String shape, String description){
        this.number = number;
        this.name = name;
        this.img = img;
        this.color = color;
        this.shape = shape;
        this.description = description;
    }
}
