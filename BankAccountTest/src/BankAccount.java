/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohid
 */
public class BankAccount {
    double balance;
    String name;
    
    void deposit(double amount){
        balance=amount+balance;
        System.out.println("The bakance after deposit is: "+balance);
    }
    void withdraw(double amount){
        if(amount<balance)
        {
            balance = balance-amount;
            System.out.println("The amount left after withdrawl is: "+balance);
        }
    }
}
