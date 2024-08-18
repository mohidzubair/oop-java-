import java.util.Scanner;

public class Course {
    private String courseTitle;
    private int[][] marks;

    public Course(String courseTitle, int noOfStudents){
        this.courseTitle=courseTitle;
        this.marks=new int[noOfStudents][];

    }


    public void inputMarksData(){
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter no of tests of student "+(i+1)+":");
            int noOfTests=input.nextInt();
            marks[i]=new int[noOfTests];
            for (int j = 0; j < noOfTests; j++) {
                System.out.println("Enter the marks of student "+(i+1)+" in subject "+(j+1)+":");
                marks[i][j]=input.nextInt();
            }
        }
    }
    public void displayMarksData(){
        System.out.println("Course Title: "+courseTitle);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student "+(i+1)+" marks :");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println(marks[i][j] +" ");
            }
        }
    }
}
