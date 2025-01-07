/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoop3;

import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class GUI extends JFrame  {
    
    private JTextField customerId;
    private JTextField name;
    private JTextField adress;
    private JButton SmartPhone=new JButton("Add SmartPhone");
    private JButton T_Shirt=new JButton("Add T_Shirt");
    private JButton OOP=new JButton("Add OOP");
    private JTextField numProducts;
    private JButton placeOrder;
   Cart cart;
   Product product=new Product();
    ElectronicProduct electronicProduct=new ElectronicProduct(1,"smartPhone", (float) 599.99,"Samsung",1);
    ClothingProduct clothingProduct=new ClothingProduct(2,"T-shirt", (float) 19.99,"Medium","Cotton");
    BookProduct bookProduct=new BookProduct(3,"OOP", (float) 39.99,"O'Reilly","X Publications");
    private float total=0;
    String p=" ";
    
    public GUI()
    {
       this.setTitle("E-commerce System");
       this.setSize(560,350);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new GridLayout(8,2));
       this.setLocation(300, 200);
       customerId=new JTextField();
       name=new JTextField();
       adress=new JTextField();
       placeOrder=new JButton("place Order");
       add(new JLabel("ID: "));
       add(customerId);
       add(new JLabel ("Name: "));
       add(name);
       add(new JLabel("Adress: "));
       add(adress);
       numProducts=new JTextField();
       add(new JLabel("Enter number of products: "));
       add(numProducts);
       add(new JLabel("SelectProduct: "));
       add(SmartPhone);
       //SmartPhone.setBackground(Color.PINK);
       //SmartPhone.setForeground(Color.BLACK);
       add(T_Shirt);
      // T_Shirt.setBackground(Color.PINK);
      // T_Shirt.setForeground(Color.BLACK);
       add(OOP);
      // OOP.setBackground(Color.PINK);
      // OOP.setForeground(Color.BLACK);
       add(new JLabel("IF you want to place order press on PlaceOrder."));
       add(placeOrder);
      //  placeOrder.setBackground(Color.PINK);
      // placeOrder.setForeground(Color.BLACK);
      
             
        
       SmartPhone.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
        int nProducts=Integer.parseInt(numProducts.getText());
             int ID =Integer.parseInt(customerId.getText());
             cart =new Cart(ID,nProducts);       
            addProduct(electronicProduct);
            
           }
               });
 
        T_Shirt.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
           int nProducts=Integer.parseInt(numProducts.getText());
              int ID =Integer.parseInt(customerId.getText());
             cart =new Cart(ID,nProducts);       
            addProduct(clothingProduct); 
            
           }
               });
        OOP.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
           int nProducts=Integer.parseInt(numProducts.getText());
              int ID =Integer.parseInt(customerId.getText());
             cart =new Cart(ID,nProducts);       
            addProduct(bookProduct);
            
           }
               });
    
       placeOrder.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              int nProducts=Integer.parseInt(numProducts.getText());
              int ID =Integer.parseInt(customerId.getText());
               cart= new Cart(ID,nProducts);
        Order order=cart.placeOrder();
           JOptionPane.showMessageDialog(null,"Order ID: "+order.getOrderId()+"\n"+ "CutomerID:"+cart.getCustomerId()+ "\n"+ p+ "Total cost "+total+"$");
            
          } 
       }
       );
      this.setVisible(true);    
       
}
     //int nProducts=Integer.parseInt(numProducts.getText());
        
            private void addProduct(Product product) {
           cart.addProduct(product, 1);
            total+=product.getPrice();
            p+=product.getName()+" :"+product.getPrice()+"$" +"\n";
           
        } 
}   

        
 
    
    



    

