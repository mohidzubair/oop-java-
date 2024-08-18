import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of courses:");
        int n=input.nextInt();
        input.nextLine();
        Course[] c=new Course[n];
        for (int i = 0; i < n; i++) {

            System.out.println("Enter the course Title");
            String courseTitle=input.nextLine();

            System.out.println("Enter the course code:");
            String courseCode=input.nextLine();

            System.out.println("Enter the course credit hour:");
            int courseCreditHr = input.nextInt();
            input.nextLine();
            c[i]=new Course(courseCode,courseCreditHr,courseTitle);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("COurse Title: "+c[i].getCourseTitle());
            System.out.println("Course Code: "+c[i].getCourseCode());
            System.out.println("Course Credit Hour: "+c[i].getCourseCreditHr());
        }
    }
}