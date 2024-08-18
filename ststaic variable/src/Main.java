public class Main {
    public static void main(String[] args) {
        Student std1=new Student("Mohid");
        Student std2=new Student("Talha");

        Student.university="Comsats";

        std1.display();
        std2.display();
        Student.printCounter();

    }
}