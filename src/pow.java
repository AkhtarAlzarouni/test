import java.util.Scanner;
//Problem: Implement pow(x, n), which calculates x raised to the power n (x^n).
public class pow {
    public static void main(String[] args) {
        double result=1;
        Scanner input = new Scanner (System.in);
        System.out.println("pow(x, n)");
        System.out.println(" Enter x");
        double x= input.nextDouble();
        System.out.println("Enter n");
        double n= input.nextDouble();
        while (n !=0){
            result =x*result;
            --n;
        }
        System.out.println(result);
    }
}
