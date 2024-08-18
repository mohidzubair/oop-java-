public class Date {
    private int day;
    private int month;
    private int year;


    public Date(int day,int month,int year){
        if(day<1 || day>30){
            System.out.println("Day is out of range");
        }
        else{
        this.day=day;}
        this.month=month;
        this.year=year;
    }


    public int getDate(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }
    public String toString() {
        return day + "/" + month + "/" + year;
    }

}
