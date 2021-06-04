package com.techelevator;

public class Slot {    // start of class

// Attributes
private int productNumber;
private int price;
private int quantity;



// Constructor

   public Slot(int price, int productNumber,int quantity){
       this.productNumber = productNumber;
       this.price = price;
       this.quantity = 5;
   }
    String productInfo(){
       getName()
               return name;
    }
    
//

//Getters/Setters


    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}             // end of class
