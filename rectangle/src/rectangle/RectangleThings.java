/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

/**
 *
 * @author Mohid
 */
public class RectangleThings {
    double length;
    double width;
    
    double calculateArea(){
        double area=length * width;
        return area;
    }
    double calculatePerimeter(){
        double perimeter = 2*(length+ width);
        return perimeter;
    }
}
