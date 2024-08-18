public class Student {
    private String name;
    private String id;
    private double CGPA;

    public Student(String name,String id){
        this.setName(name);
        this.setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public static void display(Student student){
        System.out.println();
        System.out.println("The name of the student is: " + student.getName());
        System.out.println( "The id of the student is: "+ student.getId());
        System.out.println("The CGPA of the student is: " +student.getCGPA());

    }
}
