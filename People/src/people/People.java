/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package people;

/**
 *
 * @author Mohid
 */
public class People {
    int Id;
    String name;
    int age;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        People p1=new People();
        p1.Id=1;
        p1.name="Mohid";
        p1.age=19;
        printData(p1);
    }
    public static void printData(People p)
    {
        System.out.println(p.Id);
        System.out.println(p.name);
        System.out.println(p.age);
    }
    
}
