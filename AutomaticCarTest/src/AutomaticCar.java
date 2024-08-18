public class AutomaticCar {
    private String model;
    private int year;
    private int speed;
    private int gear;

    public AutomaticCar(String model,int year){
        this.model=model;
        this.year=year;
        this.speed=0;
        this.gear=0;
    }

    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void setSpeed(int speed){
        if(speed<0){
            System.out.println("Speed cannot be negative");
        }
        this.speed=speed;
        updateGear();
    }
    public int getSpeed(){
        return speed;
    }
    public void updateGear(){
        if(speed==0){
            gear=0;
        }
        else if(speed>=1 && speed<=100){
            gear=1;
        }
        else if(speed>=101 && speed<=200){
            gear=2;
        }
        else if(speed>=201 && speed<=300){
            gear=3;
        }
        else if(speed>=301 && speed<=400){
            gear=4;
        }
        else if(speed>=401 && speed <=500){
            gear=5;
        }
    }
}
