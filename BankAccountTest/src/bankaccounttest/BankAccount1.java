package bankaccounttest;

//import *;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohid
 */
public class BankAccount1 {
     private double balance;
    String name;
    
    public void setBalance(double balance){
        this.balance=balance;
        
    }
    
    void deposit(double amount){
        balance=amount+balance;
        System.out.println("The balance after deposit is: "+balance);
        if(balance<50000){
            double tax=amount* 0.02;
            balance-=tax;
            System.out.println("The total balance after tax deduction is: "+balance);
        }
        if(balance>=100000){
                  double bonus = amount * 0.01;
                    balance = balance + bonus;
                  System.out.println("The total balance after the addition of 1 percent is: "+balance);
             }
    }
    void withdraw(double amount){
        if(amount<=balance)
        {
            balance-=amount;
            System.out.println("The amount left after withdrawl is: " +balance);
           
        }
        else {
            System.out.println("Not enough balance");
        }
    }
}
