import java.util.Scanner;
public class Account {

    private int accountId;
    private long cnic;
    private String name;
    private int age;
     private double balance;

    public Account(int accountId){
        setAccountId(accountId);

    }
    public Account(long cnic,String name,int age){
        setCNIC(cnic);
        setName(name);
        setAge(age);
    }

    public void setAccountId(int accountId)
    {
        this.accountId=accountId;
    }
    public int getAccountId()
    {
        return accountId;
    }

    public void setCNIC(long cnic){
        this.cnic=cnic;}
    public long getCNIC(){
        return cnic;}

    public void setName(String name){
        this.name=name;}

    public String getName()
    {
        return name;}
    public void setAge(int age){
        this.age=age;
        setBalance(age);
    }
    public int getAge(){
        return age;
    }
    public void setBalance(int age){
        if(age>35){
            this.balance=0;
        }
        else if(age>=20 && age<=25){
            this.balance=50000;
            System.out.println(age);
        }
        else if(age>=25 && age<=30){
            this.balance=25000;
        }
        else if(age>=30 && age<=35){
            this.balance=10000;
        }
    }

    public void withdraw(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw:");
        double amount=input.nextDouble();

        if(amount>this.balance){
            System.out.println("Not enough balance");
        }
        else {
            this.balance -= amount;
            System.out.println("Amount successfully withdrawn");
            System.out.println("Amount left after withdraw is: " + this.balance);
        }
    }
    public void deposit(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit:");
        double amount=input.nextDouble();
        this.balance+=amount;
        System.out.println("The amount has been successfully deposited");
        System.out.println("The amount left after deposit is: "+this.balance);
    }


}

