import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        AutomaticCar[] cars= new AutomaticCar[5];
         cars[0]= new AutomaticCar("Car1",2024);
         cars[1]= new AutomaticCar("Car2",2023);
         cars[3]= new AutomaticCar("Car3",2022);
         cars[4]= new AutomaticCar("Car4",2021);
        Random random= new Random();
        int[] wins=new int[5];
        for(int i=0;i<10;i++){
               double  maxSpeed=0;
                int winner=-1;
            for(int j=0;j<cars.length;j++){
                 int newSpeed= random.nextInt(501);
                cars[j].setSpeed(newSpeed);
                if(newSpeed>maxSpeed){
                    maxSpeed=newSpeed;
                    winner=j;
                }

            }
            if(winner!=-1){
                wins[winner]++;
            }
        }
        int overallWinner = 0;
        for (int i = 1; i < wins.length; i++) {
            if (wins[i] > wins[overallWinner]) {
                overallWinner = i;
            }
        }

        System.out.println("The winner of the race is " + cars[overallWinner].getModel());
    }
}