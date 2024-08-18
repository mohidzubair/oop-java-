import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Ali","SP19-BSE-010");
        Student s2=new Student("Ahmed","SP19-BSE-001");
        Student s3=new Student("Talha","SP19-BSE-002");

        s1.setCGPA(3.6);
        s2.setCGPA(3.9);
        s3.setCGPA(3.2);

        Student.display(s1);
        Student.display(s2);
        Student.display(s3);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        displayList(studentList);

        // Add a new student at the start of the ArrayList
        Student s4 = new Student("SP19-BSE-020", "Waleed");
        s4.setCGPA(3.7);
        studentList.add(0, s4);
        displayList(studentList);

        // Add another student at the end of the ArrayList
        Student s5 = new Student("SP19-BSE-002", "Maha");
        s5.setCGPA(3.9);
        studentList.add(s5);
        displayList(studentList);

        // Remove second student from list using index
        studentList.remove(1);
        displayList(studentList);

        // Remove first student from list using object reference
        studentList.remove(s4);
        displayList(studentList);

        // Print total number of students
        System.out.println("Total number of students: " + studentList.size());
        System.out.println();

        // Replace the student at index 0 with new student
        Student s6 = new Student("SP19-BSE-030", "Zara");
        s6.setCGPA(4.0);
        studentList.set(0, s6);
        displayList(studentList);

        // Display information of first student in list
        Student.display(studentList.get(0));
    }
    public static void displayList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            Student.display(student);
        }
    }

}









