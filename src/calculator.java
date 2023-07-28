import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double x,y;
        System.out.println( "enter number 1");
        x= read.nextDouble();

        System.out.println( "enter number 2");
        y= read.nextDouble();

        String operator;
        System.out.println( "choose one of  operator(+ ,- ,* ,/)");
        operator= read.next();


       if(operator.equals("+")){
           System.out.println("= " +(x+y));
       } else if (operator.equals("-")) {
           System.out.println("= " + (x-y));


       }else if(operator.equals("*")){
            System.out.println("= " +(x*y));

        } else if(operator.equals("/")) {
           System.out.println("= " +(x/y));

       }else {
           System.out.println("the operator is incorrect,Try again");
       }

    }
}