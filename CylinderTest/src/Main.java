import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius=input.nextDouble();
        System.out.println("Enter height:");
        double height=input.nextDouble();

        Cylinder c=new Cylinder(radius,height);
        c.displayInfo();
    }
}