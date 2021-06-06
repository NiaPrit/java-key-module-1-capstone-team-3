package com.techelevator;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Slot {

    private int productNumber;
    private double price;
    private int quantity;
    private Stack<Product>productList;


    public void addProduct(Product theProduct){
    }
//constructor
    public Slot(double price, int productNumber, int quantity){
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
    }

    //Code to display items


//

//Getters/Setters

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public double getPrice() { return price;}

    public void setPrice(int price) {this.price = price;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}
    
}// end of class

