import java.util.Scanner;

public class gread {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        double m, u, z, r, t;
        System.out.println("enter grade course 1");
        m = read.nextDouble();

        System.out.println("enter grade course 2");
        u = read.nextDouble();

        System.out.println("enter grade course 3");
        z = read.nextDouble();

        System.out.println("enter grade course 4");
        r = read.nextDouble();

        System.out.println("enter grade course 5");
        t = read.nextDouble();

        double grade = (m + u + z + r + t) / 5;

        System.out.println(" the grade=  " + grade);


        if ((grade >= 90.0) && (grade < 100.0)) {
            System.out.println(" grade is A");

        } else if ((grade >= 80.0) && (grade < 90.0)) {
            System.out.println(" grade is B");

        } else if ((grade >= 70.0) && (grade < 80.0)) {
            System.out.println("grade is C");

        } else {
            System.out.println("grade is F");
        }

    }
}