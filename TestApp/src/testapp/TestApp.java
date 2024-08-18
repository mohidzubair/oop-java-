/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testapp;



public class Person{
     int Id;
    String name;
    int age;
     
    public static void main(String[] args) {
        Person p1=new Person();
        p1.Id=1;
        p1.name="Mohid";
        p1.age=19;
        printData(p1);
    }
    public static void printData(Person p)
    {
        System.out.println(p.Id);
        System.out.println(p.name);
        System.out.println(p.age);
    }
    
}
