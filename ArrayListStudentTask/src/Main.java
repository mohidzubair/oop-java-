import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Ali","SP19-BSE-010");
        Student s2=new Student("Ahmed","SP19-BSE-001");
        Student s3=new Student("Talha","SP19-BSE-002");

        s1.setCGPA(3.6);
        s2.setCGPA(3.2);
        s3.setCGPA(3.7);
        Student.display(s1);
        Student.display(s2);
        Student.display(s3);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        displayList(studentList);

        Student s4=new Student("Waleed","SP19-BSE-020");
        studentList.add(0,s4);
        displayList(studentList);

        Student s5=new Student("Maha","SP19-BSE-002");
        studentList.add(4,s5);
        displayList(studentList);

        studentList.remove(1);
        displayList(studentList);

        studentList.remove(0);
        displayList(studentList);

        System.out.println(studentList.size());

        Student s6=new Student("Hamza","FA23-BSE-085");
        studentList.add(0,s6);
        studentList.remove(1);
        displayList(studentList);

        Student.display(studentList.get(0));

    }
    public static void displayList(ArrayList<Student> studentList){
        for(Student student: studentList){
            Student.display(student);
        }
    }
}