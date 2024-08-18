
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for(int i=1;i<=4;i++) {

            System.out.println("Enter the department name:");
            String depName=input.nextLine();
            System.out.println("Enter the consumed units:");
            double consumedUnits=input.nextDouble();
            input.nextLine();
            ElectricityBill depi = new ElectricityBill(depName,consumedUnits);

        }

        System.out.println("The total bill of all teh four departments is:"+ElectricityBill.getTotalBill());
    }
}