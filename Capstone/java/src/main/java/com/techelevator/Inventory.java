package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory {            //this class holds set of slots
    private Map<String, Slot> inventoryList;


    public Inventory() throws FileNotFoundException {
        this.inventoryList = new TreeMap<>();
        firstStock(); // this is going to call the method to load the file into our map
    }

    // this method will load the file into our map
    public void firstStock() throws FileNotFoundException {
        File items = new File("./vendingmachine.csv");
        Scanner inventoryItems = new Scanner("items");
        String aLine = "";
        while (inventoryItems.hasNextLine()) {          // loop while there is next line
            aLine = inventoryItems.nextLine();        // get a line from the file
            String[] itemDetails = aLine.split("\\|"); //splitting the input line into parts based on the vertical bar
            //[0] has the slot number [1] has the item name [2] has the price [3] the type of item
            Slot itemSlot = new Slot( Double.parseDouble(itemDetails[2]),Integer.parseInt(itemDetails[0]),5); // make a new slot using the slot number and price
            Product newProduct = new Product(itemDetails[1],itemDetails[3]);

        // add 5 products to my slot
            for ( int i=0; i < 5; i++) {  // for loop to add 5 items to each slot
                itemSlot.addProduct(newProduct);
            }
            inventoryList.put(itemDetails[0],itemSlot);  // this adds entries to the map using slot # and slot
        }
    }
    // display the items in the inventory
    public void displayProducts(){
        // see collections part 2 lecture final for how to display the items in a map
        // think about how do we get to a product using a slot because the map has slots
    }
} /// end of class
