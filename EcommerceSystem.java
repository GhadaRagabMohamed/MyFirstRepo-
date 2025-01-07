/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoop3;

import java.util.Scanner;
import javax.swing.*;


/**
 *
 * @author DELL
 */
public class EcommerceSystem {
   public static void main(String []args) {
      /* Scanner in=new Scanner (System.in);
       ElectronicProduct electronicProduct=new ElectronicProduct(1,"smartPhone", (float) 599.99,"Samsung",1);
       ClothingProduct clothingProduct=new ClothingProduct(2,"T-shirt", (float) 19.99,"Medium","Cotton");
       BookProduct bookProduct=new BookProduct(3,"OOP", (float) 39.99,"O'Reilly","X Publications");
       System.out.println("Welcome to the E-commerse System!");
       System.out.println("Please enter your id ");
       int customerId=in.nextInt();
       in.nextLine();
       System.out.println("Please enter your name ");
       String name=in.nextLine();
       System.out.println("Please enter your adress ");
       String adress=in.nextLine();
       Customer customer=new Customer(customerId,name,adress);
       System.out.println("How many products You want to add to your cart?");
       int nProducts=in.nextInt();
       Cart cart=new Cart(customerId,nProducts);
       for(int i=0;i<nProducts;i++){
       System.out.println("Which product wouid you like to add? 1- SmartPhone 2- T-shirt 3- OOP");
       int productType=in.nextInt();
       in.nextLine();
       switch(productType){
       case 1:
       cart.addProduct(electronicProduct, i);
       break;
       case 2:
       cart.addProduct(clothingProduct, i);
       break;
       case 3:
       cart.addProduct(bookProduct, i);
       break;
       default:
       System.out.println("Invalid productType.Please try again.");
       break;
       }
       }
       
       System.out.println("Your total is $"+cart.calculatePrice()+". Would you like to place the order? 1-Yes 2-No");
       int orderChoice=in.nextInt();
       if(orderChoice==1){
       Order order=cart.placeOrder();
       order.printOrderInfo();
       }*/
      //GUI g=new GUI();
     SwingUtilities.invokeLater(new Runnable(){
       @Override
       public void run (){new GUI();}
   });

        
        

   }
}
       
   


