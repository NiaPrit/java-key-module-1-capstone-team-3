package com.techelevator;


import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class VendingMachine {


    private Product inventory;
    private Map<String, String[]> snackStock = new TreeMap<>();     //
    private double remainingFunds;                                  //Balance of funds left to purchase
    ArrayList<String> itemList = new ArrayList<>();


    public Product getInventory() {
        return inventory;
    }

    public void setInventory(Product inventory) {
        this.inventory = inventory;
    }

    public Map<String, String[]> getSnackStock() {
        return snackStock;
    }

    public void setSnackStock(Map<String, String[]> snackStock) {
        this.snackStock = snackStock;
    }

    public double getRemainingFunds() {
        return remainingFunds;
    }

    public void setRemainingFunds(double remainingFunds) {
        this.remainingFunds = remainingFunds;
    }

    public ArrayList<String> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<String> itemList) {
        this.itemList = itemList;
    }

}

