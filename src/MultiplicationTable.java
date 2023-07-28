public class MultiplicationTable {

        public static void main(String[] args) {

        for (int i=1;i<=12;i++){
            for (int j=1;j<=12;j++){
                int a= i*j;

                System.out.print("\t"+i + " * " +j+" = "+a + "\t");

            }
            System.out.println();
        }
}}
