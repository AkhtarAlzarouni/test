import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("entar number1");
        int a= read.nextInt();

        System.out.println("entar number2");
        int b= read.nextInt();
        int temp =a;
        a=b;
        b=temp;
        System.out.println(" number1 =  "+a);
        System.out.println(" number2 = "+b);

    }
}