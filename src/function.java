import java.util.Scanner;

public class function {
    public static void main(String[] args) {

        char[][] chars = {{'A', 'B', 'C'}, { 'F', 'C', 'S'}, { 'D', 'E', 'E'}};
        System.out.println("Enter word");
        Scanner s= new Scanner(System.in);
        String word=s.next();

        char[] cs=word.toCharArray();
        boolean isThisWord=true;

        for (char c:cs){
            System.out.println(c+ " : "+ isExist(c,chars));
             if (!isExist(c,chars)){
                 isThisWord=false;
                 break;

             }

        }

        System.out.println("this word is "+isThisWord);
        }
        static boolean isExist(char c,char[][] chars){
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars[0].length; j++) {
                    if (c==chars[i][j]){
                        return true;
                    }

                }

            }
            return false;
    }



}
