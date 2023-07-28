import java.util.Scanner;

public class calculator_switch {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);




        for (int i=0;i<100;i++) {



            System.out.println("enter the first number");

            double x = s.nextDouble();

            System.out.println("enter the Second  number");
            double y = s.nextDouble();
            System.out.println("enter operator(+ or - or / or *)");
            String op = s.next();


            if(op.equals("exit")){
                System.out.println("end");
                break;
            }
            else {
                switch (op) {
                    case "+":
                        System.out.println("= " + (x + y));
                        break;
                    case "-":
                        System.out.println("= " + (x - y));
                        break;
                    case "*":
                        System.out.println("= " + (x * y));
                        break;
                    case "/":
                        System.out.println("= " + (x / y));
                        break;


                    default:
                        System.out.println("Invalid operator!");
                }

            }
        }}}

