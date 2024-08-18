package testproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohid
 */
public class Student {
    int Id;
    String name;
    double marks1;
    double marks2;
    
    double calculateAverage(){
        double sum=marks1+marks2;
        return sum/2.0;
    
}
}
