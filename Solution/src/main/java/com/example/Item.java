package com.example;

public class Item{
    private String itemName; 
    private String itemDesc;
    private double itemPrice;
    private Integer quantity = 1; 
    private Integer availableQuantity; 
    
    public Item() {
        // Your code here
        setQuantity(1); 
    }
    
    
    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
        // Your code here
        super();
        this.itemName = itemName; 
        this.itemDesc = itemDesc;
        this.itemPrice = itemPrice; 
        this.availableQuantity = availableQuantity; 
    }
    
    public String getItemName(){
        return this.itemName;
    }
    
    public void setItemName(String itemName){
         this.itemName = itemName;
    }
    
    public String getItemDesc(){
        return this.itemDesc;
    }
    
    public void setItemDesc(String itemDesc){
        this.itemDesc = itemDesc;
    }
    
    public Integer getQuantity(){
        return this.quantity;
    }
    
       
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }
    
    public Double getItemPrice(){
        return this.itemPrice;
    }
    
      public void setItemPrice(Double price){
         this.itemPrice = price;
    }
    
    
    public Integer getAvailableQuantity(){
        return this.availableQuantity;
    }
    
    public void setAvailableQuantity(Integer availableQuantity){
        this.availableQuantity = availableQuantity;
    }
    
}
