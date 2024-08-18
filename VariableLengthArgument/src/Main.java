public class Main {
    public static void main(String[] args) {
        int[] numbers={1,23,5};
        System.out.println(calculator(numbers));
        System.out.println(calculator(30,35,33,55));
    }
    public static int calculator(int...num){
        int sum=0;
        System.out.println("Length: "+num.length);
        for(int n: num){
            sum+=n;
        }
        return sum;
    }

}