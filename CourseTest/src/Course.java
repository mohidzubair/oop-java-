public class Course {
    private String courseCode;
    private int  courseCreditHr;
    private String courseTitle;

    public Course(String courseCode,int courseCreditHr,String courseTitle){
        setCourseCode(courseCode);

        setCourseCreditHr(courseCreditHr);

        setCourseTitle(courseTitle);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCourseCreditHr() {
        return courseCreditHr;
    }

    public void setCourseCreditHr(int courseCreditHr) {
        this.courseCreditHr = courseCreditHr;
    }
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public String getCourseTitle() {
        return courseTitle;
    }

}
