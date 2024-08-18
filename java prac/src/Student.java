public class Student {
    String name;
    int age;

    public Student(String name){
        this.name=name;
    }
    public Student(int age){
        this.age=age;
    }

    public Student() {

    }

    public static void printInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
    
}
