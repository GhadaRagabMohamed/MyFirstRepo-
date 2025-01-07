/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoop3;

/**
 *
 * @author DELL
 */
public class Order {
    private int customerId;
    private int orderId;
    private static int count=0;
    private Product []products;
    private float totalPrice;

    public Order() {
    }

    public Order( int customerId, Product[] products,float totalPrice) {
        this.orderId = count;
        this.customerId =Math.abs(customerId);
        this.products = products;
        this.totalPrice=Math.abs(totalPrice);
        count++;
    }

    public int getOrderId() {
        return count;
    }
    
    public void printOrderInfo(){
        System.out.println("Here's your order's summary:");
        System.out.println("Order ID:"+ count);
        System.out.println("Customer ID:"+ customerId);
        System.out.println("Products:");
        for(Product product:products){
            if(product!=null)
            System.out.println(product.getName()+"- $"+product.getPrice());   
        }
        System.out.println("Total Price: $"+totalPrice);
    }
    
}
