import java.util.Scanner;

public class computerSpace {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        int x, n, y;

        System.out.println("enter computer space ");
        x = read.nextInt();

        System.out.println("enter number of files");
        n = read.nextInt();

        System.out.println("enter file size for one ");
        y = read.nextInt();

        int z = n * y;

        System.out.println("the files size to gather is:" + z);

        if (z < x) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}