import java.lang.Math;
public class Cylinder {
   private double radius;
   private double height;

    public Cylinder(double radius,double height){
        setRadius(radius);
        setHeight(height);
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(double height){
        return height;
    }
    public double computeArea(){
        return 2 * Math.PI * radius *(radius+height);
    }
    public double computeVolume(){
        return Math.PI * radius * radius *height;
    }
    public void displayInfo(){
        System.out.println("The radius is: "+radius);
        System.out.println("The height is: "+height);
        System.out.println("The area is: "+computeArea());
        System.out.println("The volume is: "+computeVolume());
    }
}
