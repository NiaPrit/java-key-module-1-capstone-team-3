package com.techelevator;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

public class Slot {

    private int productNumber;
    private double price;
    private int quantity;
    private String name;
    private String type;

    public Slot(double price, int productNumber, int quantity, String name, String type){
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.type = type;
    }

    //Code to display items
    Map<Product, Integer> snacks = new HashMap<>();


    //
=======
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

>>>>>>> 70b9cc8497d610866e6c7f84557717184c05c8fd

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

<<<<<<< HEAD
    public double getPrice() {
=======
    public int getPrice() {
>>>>>>> 70b9cc8497d610866e6c7f84557717184c05c8fd
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
<<<<<<< HEAD

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
=======
}             // end of class
>>>>>>> 70b9cc8497d610866e6c7f84557717184c05c8fd
