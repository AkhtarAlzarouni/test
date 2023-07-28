import java.util.Scanner;

public class average {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("entar frist number");
        num1 = read.nextInt();
        System.out.println("entar second number");
        num2 = read.nextInt();
        System.out.println("entar third  number");
        num3 = read.nextInt();

        int average = (num1 + num2 + num3) / 3;

        System.out.println("the average is" + average);
    }

}
