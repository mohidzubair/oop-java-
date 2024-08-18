import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //fill method
        System.out.println("Array fill method:");
        int[] nums=new int[5];
        Arrays.fill(nums,10);
        for (int n:nums) {
            System.out.println(n);
        }
        //sorting method of array
        System.out.println("Sorted array:");
        int[] arr = new int[]{2,1,6,5,0,98,23};
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
        String names[]=new String[]{"Mohid","Abid","Zahid","Bilal"};
        Arrays.sort(names);
        for( String n:names){
            System.out.println(n);
        }
        //equal array method
        System.out.println("Equal array method");
        int[] array1=new int[]{1,2,3};
        int[] array2=new int[]{1,3,2,3};

    }
    public static boolean equals(int[] a,int b){}
}