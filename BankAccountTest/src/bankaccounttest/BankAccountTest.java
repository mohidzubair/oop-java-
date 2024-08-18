 
package bankaccounttest;
import java.util.Scanner;

public class BankAccountTest {

    
    public static void main(String[] args) {
       BankAccount1 b1=new BankAccount1();
       Scanner input=new Scanner(System.in);
       //input.nextLine();
       System.out.println("Enter the name of the account holder:");
        b1.name=input.nextLine();
       
       System.out.println("Enter the balance in your account:");
       double balance=input.nextDouble();
         b1.setBalance(balance);
         int depCount=0,withdrawCount=0;
         while(true)
         {
         int  n;
         System.out.println("Enter 1 to deposit amount:");
         System.out.println("Enter 2 to withdraw amount:");
         System.out.println("Enter 3 to view the current balance:");
         System.out.println("Enter 4 to close this program:");
         n=input.nextInt();
         
         if(n==1){
             
             double amount;
             
             System.out.println("Enter the amount you want to deposit:");
             amount=input.nextInt();
             b1.deposit(amount);
             
             depCount++;
             
         }
         else if(n==2){
             System.out.println("The balance before your withdrawl is: "+balance);
             double amount;
             System.out.println("Enter the amount you want to withdraw:");
             amount=input.nextInt();
             if(balance-amount<50000){
                 int choice;
                 System.out.println("Are you sure you want to withdraw?");
                 System.out.println("Press 1 to continue:");
                 System.out.println("press 2 to abort:");
                 choice=input.nextInt();
                 if(choice==1){
                     b1.withdraw(amount);
                     withdrawCount++;
                     
                 }
                 
             }
             else {
                 b1.withdraw(amount);
             }
         }
         else if(n==3){
            System.out.println(balance);
         }
         else if(n==4){
             System.out.println("Account Title: "+b1.name);
             System.out.println("Toeal deposits: "+depCount);
             System.out.println("Total Withdraws: "+withdrawCount);
             System.out.println("Balance: "+balance);
             return ;
         }
    }
    }
}
