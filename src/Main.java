import algorithms.BubbleSort;
import algorithms.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 6, 4};
        BubbleSort.sort(arr);

        int[] arr2 = {5, 2, 1, 3, 6, 4, 5, 9, 244, 592, 1000, 0};
        MergeSort.sort(arr2);
    }
}