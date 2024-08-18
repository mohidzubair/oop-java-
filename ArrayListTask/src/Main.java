import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        ArrayList<String> students=new ArrayList<>();
        students.add("Ali");
        students.add("Ahmed");
        students.add("Umar");
        students.add("Talha");

        display(students);
        students.add("Tooba");
        students.add("Waleed");
        display(students);

        System.out.println(students.size());
        display(students);

        students.add(0,"Hamza");
        display(students);

        students.add(1,"Rizwan");
        display(students);

        Collections.sort(students);
        display(students);

        students.remove("Tooba");
        display(students);

        students.remove(students.size()-1);
        display(students);

        System.out.println();

        System.out.println(students.get(students.size()-2));

        students.add(0,"Muhammad Waleed");
        display(students);
        System.out.println(students.size());

    }
    public static void display(ArrayList<String> students){
        System.out.println();
        for(String s:students){
            System.out.println(s);
        }

    }
}