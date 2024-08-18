public class Student {
   private String name;
   private String email;
   private long cnic;
   private Course course1;
   private Course course2;
   private Address postalAddress;
   private PhoneNumber contactNumber;

    public Student(long cnic, String name,Address postalAddress){
        this.cnic=cnic;
        this.name=name;
        this.postalAddress=postalAddress;

    }
    public void setCourse1(Course course1){
        this.course1=course1;
    }
    public Course getCourse1(){
        return course1;
    }
    public void setCourse2(Course course2){
        this.course2=course2;
    }
    public Course getCourse2(){
        return course2;
    }
    public long getCnic(){
        return cnic;
    }
    public String getName(){
        return name;
    }
    public Address getPostalAddress(){
        return postalAddress;
    }
    public void setPostalAddress(Address postalAddress){
        this.postalAddress=postalAddress;
    }
    public void setContactNumber(PhoneNumber contactNumber){
        this.contactNumber=contactNumber;
    }
    public PhoneNumber getContactNumber(){
        return contactNumber;
    }


}
