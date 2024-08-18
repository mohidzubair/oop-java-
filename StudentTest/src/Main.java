public class Main {
    public static void main(String[] args) {

        Course course1=new Course(823,"Computer Science");
        Course course2=new Course(562,"BS English");

        PhoneNumber contactNumber=new PhoneNumber(9469,34953,25455);

        Address postalAddress=new Address("s# 10","Johar Town","Lahore","pakistan",contactNumber);

        Student student1=new Student(93266342,"Mohid",postalAddress);
        //innitializing all student attributes
        student1.setCourse1(course1);
        student1.setCourse2(course2);
        student1.setPostalAddress(postalAddress);
        student1.setContactNumber(contactNumber);
        //student1.setContactNumber(contactNumber);

        System.out.println("The course code of student 1 is: "+student1.getCourse1().getCourseCode());
        System.out.println("The course Title of student 1 is: "+student1.getCourse1().getCourseTitle());
        System.out.println("The Postal Address of student 1 is: "+student1.getPostalAddress().getStreetAddress());
        System.out.println("The town of student 1 is: "+student1.getPostalAddress().getTown());
        System.out.println("The city od student 1 is: "+student1.getPostalAddress().getCity());
        System.out.println("The country of student 1 is: "+student1.getPostalAddress().getCountry());
        System.out.println("The country code of student 1 is: "+student1.getContactNumber().getCountryCode());
        
    }
}