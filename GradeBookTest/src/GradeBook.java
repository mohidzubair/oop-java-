public class GradeBook {
    private String courseName;
    private Student[] students;

    public GradeBook(String courseName, Student[] students){
        setCourseName(courseName);
        setStudents(students);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
