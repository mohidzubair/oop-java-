public class Main {
    public static void main(String[] args) {
        Date birthDate=new Date(12,3,15);
        Date hiringDate=new Date(3,12,15);

        Employee e1=new Employee("Muhammad","Ali",birthDate,hiringDate);

        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getBirthDate());
        System.out.println(e1.getHiringDate());
    }
}