import java.util.Scanner;

public class arrayQuestions {
    public static void main(String[] args) {


        Scanner s= new Scanner(System.in);

        System.out.println(" answer the questions");
        System.out.println(" enter your name");
        String name = s.next();
        System.out.println(" number of questions from 1-5");
        int number = s.nextInt();


        String[] q = {"1+1= ", "2+2= ", "3+3= ", "4+4 =", " 5+5= "};
        int[] x = {2, 4, 6, 8, 10};

        int total = 0;

        for (int i = 0; i < number; i++) {


            System.out.println(q[i]);
            int answer = s.nextInt();

            if (answer == x[i]) {
                System.out.println("T");
                total++;
            } else {
                System.out.println("F");
            }

        }
    }
}