import java.util.Random;

public class Person {
    private int id;
    private String name;
    int luckyNumber;
    public Person(){
        Random r= new Random();
        luckyNumber = r.nextInt(10);
    }

    public Person(int id){
        setId(id);
    }
    public Person(int id,String name)
    {
        setId(id);
        setName(name);
    }
    public Person (String name){
        setName(name);
    }

    public void setId(int id){
        if(id>0){
            this.id=id;
        }
    }
    public int  getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public double sum(int num1 ,int num2){
        return num1+num2;
    }
    public double sum(double num1 ,double  num2){
        return num1+num2;
    }
}
