
// Given an array of integers nums, sort the array in ascending order.

public class AscendingNumbers {
    public static void main(String[] args) {
        int[] arrayX={5,7,3,6,1};

        Ascending(arrayX);
        System.out.println("\nArray after sorting:");
        printArray(arrayX);

    }

    public static void Ascending(int[] arr) {
        int n = arr.length;
        boolean sw;

        for (int i = 0; i < n - 1; i++) {
            sw = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sw = true;
                }
            }


            if (!sw) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    }

