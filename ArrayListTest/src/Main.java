import java.util.ArrayList;
import java.util.Arrays;

public class Main {
   // static String[] names;
    //static int lastUsedIndex = -1;

    public static void main(String[] args) {
       /* int initialCapacity=2;
        names=new String[initialCapacity];
        add("Ali");
        add("Shahzad");
        add("Abid");
        add("Abid");

        for (String name: Arrays.copyOf(names,lastUsedIndex +1)) {
            System.out.println(name);
        }
        System.out.println(names.length);

    }
    static void add(String name){
        if(lastUsedIndex == names.length-1){
            String[] temp= new String[names.length * 2];
            for (int i = 0; i < names.length; i++) {
                temp[i]= names[i];

            }
            names=temp;
        }
        names[++lastUsedIndex]=name;*/
        //We can avoid aal above code by using arraylist
        ArrayList<String> names=new ArrayList<>();
        names.add("Abid");
        names.add("Zahid");
        names.add("Sajid");
        names.add("Rehan");

        names.add(1,"Rehman");
        System.out.println(names.size());
        /*for(String name:names){
            System.out.println(name);
        }*/
        names.add("Asif");
        names.remove("Abid");
        for(String name:names){
            System.out.println(name);
        }

        names.ensureCapacity(100);
        System.out.println(names.size());
    }
}




