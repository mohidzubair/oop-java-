public class Main {
    public static void main(String[] args) {

        Person p=new Person(10);
        System.out.println(p.getId());
       // System.out.println(p.getName());
        p.setName("Mohid");
        p.setId(20);
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.sum(4,8));

        Person p3=new Person();
        System.out.println(p3.luckyNumber);


    }
}