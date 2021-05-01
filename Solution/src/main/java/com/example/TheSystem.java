package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public abstract class TheSystem {
    
    private HashMap<String, Item> itemCollection = new HashMap<String, Item>();
    
    
    TheSystem() {
        // Your code here
        if(getClass().getSimpleName().equals("AppSystem")){
            try {
                String path = ("../Solution/resources/sample.txt");
                File file = new File(path); 
                Scanner input = new Scanner(file);
                while(input.hasNextLine()){
                    String line = input.nextLine();
                    String[] itemInfo = line.split("\\s ");    
                    itemCollection.put(itemInfo[0], new Item(itemInfo[0], itemInfo[1], Double.parseDouble(itemInfo[2]), Integer.parseInt(itemInfo[3])));
                }
            
            } catch (FileNotFoundException e){
                System.out.print(e);    
            }
            
        };
    }
    
    public HashMap<String, Item> getItemCollection(){
        // Your code here 
        return this.itemCollection;   
    }
    
     public void setItemCollection(String itemName, Item item) {
        this.itemCollection.put(itemName, item);
    }
    
    
    public Boolean checkAvailability(Item item) {
        // Your code here
        try {
        if(item.getQuantity() >= item.getAvailableQuantity()){
            System.out.printf("System is unable to add %s to the card. System only has %d %s s", item.getItemName(), item.getAvailableQuantity(), item.getItemName() );
            return false; 
        } else {
            return true; 
        } 
        } catch (NullPointerException e){
            return false; 
        }
    }
    
    public Boolean add(Item item) {
        // Your code here
       try { 
        if(item.equals(null)){
            return false;
        } else if (itemCollection.containsValue(item) && (item.getAvailableQuantity() >= 1)){
            item.setQuantity(item.getQuantity()+1); 
            return true; 
        } else if (!itemCollection.containsValue(item)){
            itemCollection.put(item.getItemName(), item);
            return true; 
        } else {
            
            return false; 
        } 
        } catch (NullPointerException e) {
            return false;
        }
    }


    public Item remove(String itemName) {
        // Your code here
        
        if(itemCollection.containsKey(itemName)){
            itemCollection.remove(itemName);
            Item x = new Item (itemName, "Object Have been removed", 0.0, 0);
            return x;
        } else {
            return null;
        }
    }

    public abstract void display();

    
}
