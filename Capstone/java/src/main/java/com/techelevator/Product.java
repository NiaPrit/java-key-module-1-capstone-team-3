package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Product {

    private String name;
    private String type;

    public Product(String name, String type) throws FileNotFoundException {
        this.name = name;
        this.type = type;
    }
    File inventory = new File("./vendingmachine.csv");                  //input from the text file
    Scanner items = new Scanner(inventory);                                     // create scanner to select inventory
    String aLine = "";



    //  while(items.hasNextLine()) {
   //     aLine = items.nextLine();
   // }
    String [] itemsToStock = aLine.split("\\|");                           //Display items separated by pipe |


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

