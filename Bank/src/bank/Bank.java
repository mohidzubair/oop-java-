/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author Mohid
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount1 b1= new BankAccount1();
        
        double amount=200;
        b1.Deposit(amount);
        b1.Withdraw(amount);
    }
    
}
