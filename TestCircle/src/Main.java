import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Circle c= new Circle();
    Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of radius of circle:");
        double radius=input.nextDouble();
        c.setRadius(radius);
        //System.out.println(c.getRadius());
        System.out.println("The area of the circle is:"+c.calculateArea(radius));
        System.out.println("The perimeter of the circle is:"+c.calculatePerimeter(radius));

    }
}