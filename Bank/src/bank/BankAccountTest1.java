package bank;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohid
 */
import java.util.Scanner;
public class BankAccountTest1 {
    public static void main(String[] args){
        BankAccountTest1 b=new BankAccountTest1();
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name:");
        String b.name=input.nextLine();
        
        System.out.println("Enter your balance");
        int b.balance=input.nextInt();
    }
}
