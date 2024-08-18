import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the course title:");
        String courseTitle = input.nextLine();
        System.out.println("Enter the no of students:");
        int noOfStudents = input.nextInt();
        Course course = new Course(courseTitle, noOfStudents);
        course.inputMarksData();
        course.displayMarksData();
    }
}