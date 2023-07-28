import java.util.Scanner;

public class perimterAndarea {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.println("enter width");
        double width = read.nextDouble();
        System.out.println("enter height");
        double height = read.nextDouble();

        double perimter = 2 * (height + width);
        double area = width * height;
        ;
        System.out.println("perimter is =  " + perimter);
        System.out.println("Area is =  " + area);
    }
}