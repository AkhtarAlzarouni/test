import java.util.Scanner;

public class registered {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Our System ");


        System.out.print("enter your Name ");
        String name = s.next();
        System.out.print("enter your Emil ");
        String emil = s.next();
        System.out.print("enter your phone number ");
        int phone = s.nextInt();
        System.out.print("enter password ");
        String pass = s.next();
        System.out.print("enter Confirm password ");
        String pass2 = s.next();

        if (pass.equals(pass2)) {
            System.out.println("Welcome" + name + "Successfully registered");

        } else {
            System.out.println("The password does not match");
        }
    }
}