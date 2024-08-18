/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.test;

/**
 *
 * @author Mohid
 */
public class Student {
    private int Id;
    
    public void setId(int num){
        if(num>0){
            Id=num;
            
        }
        else{
            System.out.println("Invalid Id");
        }
    }
    public int getId(){
        return Id;
    }
}
