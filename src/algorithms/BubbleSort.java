package algorithms;

public class BubbleSort {
    public static void sort(int[] arr) {
        System.out.println("Initial: " + java.util.Arrays.toString(arr));

        boolean swapped; // stops the loop if no swaps are made (array is sorted)

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("Sorted: " + java.util.Arrays.toString(arr));
    }
}
