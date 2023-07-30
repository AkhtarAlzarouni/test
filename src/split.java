import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter words: ");
        String input = s.nextLine();
        String[] word = input.split(" ");
        System.out.println(" reversed ");

        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i] + " ");
        }
    }

}