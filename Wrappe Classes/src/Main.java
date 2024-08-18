public class Main {
    public static void main(String[] args) {
        Integer num=new Integer(10);
        System.out.println(num);
        //To convert a string into integer:
        String number="1000";
        int num1=Integer.parseInt(number);
        System.out.println(num1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //To convert a primitive type integer to reference:
        int no=23124;
        System.out.println(Integer.valueOf(no));

    }
}