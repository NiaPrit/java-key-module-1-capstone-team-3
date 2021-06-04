package com.techelevator;

public class Product {    // start of the product class


// Attibutes
private String name;
private String type;


// Constructors
public Product(String name, String type){
    this.name = name;
    this.type = type;
}


//Getters/Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
} // end of the product class
