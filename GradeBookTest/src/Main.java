import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter teh course name:");
        String courseName=input.nextLine();
        System.out.println("Enter no of students:");
        int noOfStudents=input.nextInt();
        Student[] s=new Student[50];

       // GradeBook G=new GradeBook(courseName,noOfStudents);
        Random rand=new Random();
         noOfStudents= rand.nextInt(50);
        int[] marks = new int[10];
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("Enter no of tests:");

            Random random=new Random();
            int noOfTests= random.nextInt(10);
            for (int j = 0; j < noOfTests; j++) {
                Random ran = new Random();
                 marks[j] = ran.nextInt(50);

            }
        }

    }
}