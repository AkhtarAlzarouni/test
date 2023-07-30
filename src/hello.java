public class hello {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write your word : ");
        String word = s.nextLine();
        char[] arry = word.toCharArray();
        for (int i = arry.length - 1; i >= 0; i--) {

            System.out.println(arry[i]);
}
     
    
}

