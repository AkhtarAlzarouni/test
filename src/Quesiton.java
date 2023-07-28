import java.util.Scanner;

public class Quesiton {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Quesiton 1 : 3 + 8 = ");
        int q1=s.nextInt();
        if (q1==11){
            System.out.println("Correct Answer!");
            System.out.println("Go to next question");

        }else{
            System.out.println("Wrong answer! The correct answe is: "+ "11");
            System.out.println("Go to next question");

        }

        System.out.print("Quesiton 2 : 9 x 4 = ");
        int q2=s.nextInt();
        if (q2==36){
            System.out.println("Correct Answer!");
            System.out.println("Go to next question");

        }else{
            System.out.println("Wrong answer! The correct answe is: "+ "36");
            System.out.println("Go to next question");

        }

        System.out.print("Quesiton 3 : 36 - 12 = ");
        int q3=s.nextInt();
        if (q3==24){
            System.out.println("Correct Answer!");
            System.out.println("Go to next question");

        }else{
            System.out.println("Wrong answer! The correct answe is: "+ "24");
            System.out.println("Go to next question");

        }

        System.out.print("Quesiton 4 : 16 / 4 = ");
        int q4=s.nextInt();
        if (q4==4){
            System.out.println("Correct Answer!");
            System.out.println("Go to next question");

        }else{
            System.out.println("Wrong answer! The correct answe is: "+ "4");
            System.out.println("Go to next question");

        }

        System.out.print("Quesiton 5 : 33 + 56 = ");
        int q5=s.nextInt();
        if (q5==89){
            System.out.println("Correct Answer!");
            System.out.println("Go to next question");

        }else{
            System.out.println("Wrong answer! The correct answe is: "+ "89");

        }




    }
}