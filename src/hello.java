public class hello {
    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int x = 0;
        int y = charArray.length - 1;

        while (x < y) {
            char temp = charArray[x];
            charArray[x] = charArray[y];
            charArray[y] = temp;

            x++;
            y--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);
    }
}

