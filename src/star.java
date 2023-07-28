public class star {
    public static void main(String[] args) {
        int rows = 3;
        String stardrwo="*";

        for (int i = 1; i <= rows; i++) {

            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }


            for (int star1 = 1; star1 <= 2 * i - 1; star1++) {
                System.out.print(stardrwo);
            }

            System.out.println();
        }
    }
}
