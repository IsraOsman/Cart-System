package com.example;

public class AppSystem extends TheSystem {
    AppSystem() {
    }

    @Override
    
    public void display() {
        // Your code here
        

    
    System.out.print("AppSystem Inventory:");
        System.out.printf("%n%-20s %-20s %-10s %-10s", "Name", "Description", "Price", "Available Quantity");
        for (Item items : this.getItemCollection().values())
        {
            System.out.printf("%n%-20s %-20s %-10.2f %-10d", items.getItemName(), items.getItemDesc(),
                    items.getItemPrice(), items.getAvailableQuantity());
        }
        System.out.println();
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        // Your code here
        
        if(item == null){
            return false; 
        } else if (getItemCollection().containsValue(item)){
            System.out.printf("%s is already in the app system", item.getItemName());
            return false;
        } else if (!getItemCollection().containsValue(item)){
            setItemCollection(item.getItemName(), item);
            return true; 
        }
        
        return false; 
    }

  public Item reduceAvailableQuantity(String item_name)
    {
        if(getItemCollection().containsKey(item_name)==true)
        {
            Item item = getItemCollection().get(item_name);
            int s = item.getAvailableQuantity();
            s = s-1;
           
            item.setAvailableQuantity(s);
            if (item.getAvailableQuantity() == 0) {getItemCollection().remove(item_name,item);}
            return item;
        }
        else
        {
            return null;
        }
    }
}
