public class Circle {
    private double radius;


    public void setRadius(double radius){
        if(radius>0){
            this.radius=radius;
        }
        else {
            System.out.println("Invalid radius");
        }
    }
    public double getRadius(){
        return radius;
    }

    public double calculateArea(double radius){
        return 3.14 * radius *radius;

    }
    public double calculatePerimeter(double radius){
        return 2 * 3.14 * radius;

    }

}
