public class FindMissingNum {
    public static void main(String[] args) {
        int n = 10;
        int[] num = {1,2,4,5,3,7,8,10,9}; // Replace this with your array

        int z = n * (n + 1) / 2;
        int Sum = 0;

        for (int i : num) {
            Sum += i;
        }

        int missing = z - Sum;
        System.out.println("The missing number is: " + missing);
    }
}
