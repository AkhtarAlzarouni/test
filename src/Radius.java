import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);


        System.out.println("welcom to our system");


        System.out.println("enter Radius");
        double radius = read.nextDouble();
        double perimter = 2 * radius * 3.14;
        double area = 3.14 * radius * radius;

        System.out.println("perimter is =  " + perimter);
        System.out.println("Area is =  " + area);

    }
}
