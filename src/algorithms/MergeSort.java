package algorithms;

public class MergeSort {
    public static void sort(int[] arr) {
        System.out.println("Initial: " + java.util.Arrays.toString(arr));
        partition(arr);
        System.out.println("Sorted: " + java.util.Arrays.toString(arr));
    }

    private static void partition(int[] arr) {
        // partition the array into two halves
        int n = arr.length;
        if (n < 2) {
            // if the array has less than 2 elements, it is already sorted
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        partition(left);
        partition(right);
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;

        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < nR) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
