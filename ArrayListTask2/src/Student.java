public class Student {
    private String name;
    private String id;
    private double CGPA;

    public Student(String name ,String id){
        setName(name);
        setId(id);

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
        System.out.println("ID: "+student.getId());
        System.out.println("Name: "+student.getName());
        System.out.println("CGPA: "+student.getCGPA());

    }

}
