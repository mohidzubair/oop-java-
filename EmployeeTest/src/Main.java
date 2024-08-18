import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Address employeeAddress1= new Address(21,"Lahore","Pakistan");
        Employee e1=new Employee(1,employeeAddress1);

        System.out.println("Employee 1 ID: "+e1.getEmployeeAddress());
        System.out.println("Enter name of employee 1: ");
        String name=input.nextLine();
        e1.setName(name);
        System.out.println("Employee 1 name: "+e1.getName());
        System.out.println("Employee 1 Address:"+e1.getEmployeeAddress().getStreetNumber());
        System.out.println(e1.getEmployeeAddress().getCity());
        System.out.println(e1.getEmployeeAddress().getCountry());
    }
}