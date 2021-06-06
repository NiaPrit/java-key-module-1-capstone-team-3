package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Product {
//Attributes
    private String name;
    private String type;

    public Product(String name, String type) throws FileNotFoundException {
        this.name = name;
        this.type = type;
    }
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

}


        // end of the product class

