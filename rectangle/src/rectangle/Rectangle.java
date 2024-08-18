/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

/**
 *
 * @author Mohid
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectangleThings1 rec=new RectangleThings1();
        rec.length=3;
        rec.width=4;
        
        System.out.println(rec.calculateArea());
        
    }
    
}
