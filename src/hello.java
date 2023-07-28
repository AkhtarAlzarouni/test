public class hello {
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Write your word : ");
    String word = s.nextLine();
    String rese=re(word);
    System.out.println("This reverse word : "+rese);

    }
     public static String re (String word){
        StringBuilder res=new StringBuilder(word);
            return res.reverse().toString();
        }
     
    
}

