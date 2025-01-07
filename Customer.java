/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoop3;

/**
 *
 * @author DELL
 */
public class Customer {
   private int customerId;
   private String name;
   private String adress;

    public Customer() {
    }

    public Customer(int customerId, String name, String adress) {
       this.customerId=Math.abs(customerId);
        this.name = name;
        this.adress = adress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
         this.customerId=Math.abs(customerId);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
   
}
