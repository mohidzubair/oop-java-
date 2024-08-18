import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int noOfAddresses = 0;
        Scanner input =new Scanner(System.in);
        
        System.out.println("Entre the no of students:");
        int n=input.nextInt();
        Student[] s=new Student[n];
        for (int i = 0; i < n; i++) {
            
            System.out.println("Enter the number of adresses  of student "+(i+1)+ ":");
             noOfAddresses=input.nextInt();
            String[] address = new String[noOfAddresses];
            
            for (int j = 0; j < noOfAddresses; j++) {
                input.nextLine();
                System.out.println("Enter "+(i+1)+" address of the student "+(j+1)+":");
                 address[j] = input.nextLine();
            }
            
            System.out.println("Enter the id of student "+(i+1)+":");
            int id=input.nextInt();
            input.nextLine();
            
            System.out.println("Enter the name of student "+(i+1)+":");
            String name=input.nextLine();
            
            s[i]=new Student(address,id,name);


        }
        for (int i = 0; i < n; i++) {
            System.out.println("The name of the student "+(i+1)+"is:"+s[i].getName());
            System.out.println("The ID of the student "+(i+1)+"is:"+s[i].getId());
            for (int j = 0; j < noOfAddresses ; j++)
            {
                System.out.println("The address "+(j+1)+"of student "+(j+1)+" is :"+s[j].getAddress(j));
            }
        }
    }
}