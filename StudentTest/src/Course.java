public class Course {
  private  int courseCode;
    private String courseTitle;

    public Course(int courseCode,String courseTitle){
        this.courseCode=courseCode;
        this.courseTitle=courseTitle;
    }
    public void setCourseCode(int courseCode){
        this.courseCode=courseCode;
    }
    public int getCourseCode(){
        return courseCode;
    }
    public void setCourseTitle(String courseTite){
        this.courseTitle=courseTitle;
    }
    public String getCourseTitle(){
        return courseTitle;
    }
    /*public String toString() {
        return day + "/" + month + "/" + year;
    }*/
}
