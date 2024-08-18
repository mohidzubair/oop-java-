/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Mohid
 */
public class BankAccount1 {
    double balance;
    String name;
    
    void Deposit(double amount)
    {
        balance=amount + balance;
        System.out.println("The total balance after deposit is: "+balance);
    }
    void Withdraw(double amount)
    {
        if(amount <balance){
            balance= balance-amount;
            System.out.println("The amount left after withdrawl is: "+balance);
            
        }
        else{
            System.out.println("Balancs is not enough");
        }
        
    }
}
