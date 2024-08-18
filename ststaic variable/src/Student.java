public class Student{
   private int id;
   private String name;
    static String university;
    static int counter=0;


    public Student( String name) {
        this.id=++counter;
        this.name=name;

    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String setName(){
        return name;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(university);
        printCounter();
    }
    static void testStatic(){
        System.out.println(university);
    }
    static void printCounter(){
        System.out.println("Counter = "+counter);
    }
}

