package algorithms;

public class MergeSort {
    public static void sort(int[] arr) {
        System.out.println("Initial: " + java.util.Arrays.toString(arr));
        partition(arr);
        System.out.println("Sorted: " + java.util.Arrays.toString(arr));
    }

    private static void partition(int[] arr) {
        int size = arr.length;
        // if the array has only one element, it is already sorted
        if (size == 1) {
            return;
        }
        // partition the array into two halves
        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i]; // left elements
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + i]; // right elements
        }

        // recursively partition the two halves until they have only one element
        partition(left);
        partition(right);

        // now sort and merge the two halves recursively
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int[] merged = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < merged.length; i++) {
            if (leftIndex == left.length) {
                merged[i] = right[rightIndex];
                rightIndex++;
                continue;
            }
            if (rightIndex == right.length) {
                merged[i] = left[leftIndex];
                leftIndex++;
                continue;
            }
            if (left[leftIndex] < right[rightIndex]) {
                merged[i] = left[leftIndex];
                leftIndex++;
            } else {
                merged[i] = right[rightIndex];
                rightIndex++;
            }
        }

        // copy the merged array back to the original array
        System.arraycopy(merged, 0, arr, 0, merged.length);
    }
}
