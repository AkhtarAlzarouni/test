import java.util.Scanner;

public class LoginUser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Login user <..>");
        String email = "e@gmail.com";
        String password = "e123456";

        System.out.println("Enter your email please to login :");
        String e = s.nextLine();
        System.out.println("Enter your password please : ");
        String p = s.nextLine();

        if (email == e && password == p) {
            System.out.println("Correct login ");
        } else {
            System.out.println("Sorry incorrect login, please check your email and password ");

        }
    }
}

