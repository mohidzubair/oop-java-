import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("If you have an existing account press 1 for accessing it:");
        System.out.println("To create a new account press 2:");
        int choice=input.nextInt();
        if(choice==1){
            System.out.println("Enter your ID:");
            int accountId=input.nextInt();
            Account a=new Account(accountId);

        }
        else if(choice==2){
            System.out.println("Enter your CNIC:");
            long cnic=input.nextLong();
            input.nextLine();
            System.out.println("Enter your name:");
            String name=input.nextLine();
            System.out.println("Enter your age:");
        int age=input.nextInt();
            if(age<20){
                System.out.println("You are under age");
                return ;
            }
            Account a2=new Account( cnic,name,age);
            System.out.println("To withdraw amount press 1:");
            System.out.println("To deposit amount press 2:");
            int option=input.nextInt();
            if(option==1){
                a2.withdraw();
            }
            else if(option==2){
                a2.deposit();
            }
        }
    }
}