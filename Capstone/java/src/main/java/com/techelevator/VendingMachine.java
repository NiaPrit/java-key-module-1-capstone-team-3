package com.techelevator;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class VendingMachine {

    //Attributes
    private Inventory vendInventory;
    private double remainingFunds;//Balance of funds left to purchase

    public VendingMachine() throws FileNotFoundException {
        this.vendInventory = new Inventory();
        this.remainingFunds = 0;
    }
    // tell inventory to display its products
    public void displayProducts(){
        vendInventory.displayProducts(); //telling inventory to display the products
    }

//Getters/Setter

    public Inventory getVendInventory() {
        return vendInventory;
    }

    public void setVendInventory(Inventory vendInventory) {
        this.vendInventory = vendInventory;
    }

    public double getRemainingFunds() {
        return remainingFunds;
    }

    public void setRemainingFunds(double remainingFunds) {
        this.remainingFunds = remainingFunds;
    }

}

