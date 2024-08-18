/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testproject;

/**
 *
 * @author Mohid
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std = new Student();
        std.Id=1;
        std.name="Mohid";
        std.marks1=75;
        std.marks2=85;
        double average=std.calculateAverage();
        System.out.println(average);
    }
    
}
