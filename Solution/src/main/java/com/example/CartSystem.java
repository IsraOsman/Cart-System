package com.example;

public class CartSystem extends TheSystem {
    CartSystem() {
    }

    @Override
    public void display() {
        
        double subtotal = 0;
         System.out.print("Cart:");
        System.out.printf("%n%-20s %-20s %-10s %-10s %-10s", "Name", "Description", "Price", "Quantity", "Sub Total");
        for (Item item : this.getItemCollection().values())
        {
            subtotal = item.getQuantity() * item.getItemPrice();
            System.out.printf("%n%-20s %-20s %-10.2f %-10d", item.getItemName(), item.getItemDesc(),item.getItemPrice(), item.getQuantity(), subtotal);
        }
        System.out.println();
            double tax = subtotal * 0.05;
            double total = subtotal + tax;
            System.out.printf("%-20s %-20.2f\n", "Pre-tax Total", subtotal);
            System.out.printf("%-20s %-20.2f\n", "Tax", tax);
            System.out.printf("%-20s %-20.2f\n", "Total", total);
             
        }

    
}
