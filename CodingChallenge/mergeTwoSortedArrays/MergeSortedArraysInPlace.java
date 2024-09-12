import java.util.Scanner;

public class MergeSortedArraysInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of arr1 and arr2
        System.out.println("Enter the size of arr1:");
        int m = sc.nextInt();
        System.out.println("Enter the size of arr2:");
        int n = sc.nextInt();

        // Input the elements of arr1
        int[] arr1 = new int[m + n]; // arr1 has enough space to accommodate arr2's elements
        System.out.println("Enter " + m + " sorted elements for arr1:");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input the elements of arr2
        int[] arr2 = new int[n];
        System.out.println("Enter " + n + " sorted elements for arr2:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge arrays in-place
        merge(arr1, arr2, m, n);

        // Print merged array
        System.out.println("Merged array:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(arr1[i] + " ");
        }
        sc.close();
    }

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        // Pointers for arr1, arr2, and the merged array
        int i = m - 1;   // Last index of actual elements in arr1
        int j = n - 1;   // Last index of arr2
        int k = m + n - 1; // Last index of the merged array (arr1)

        // Start merging from the end
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // Copy remaining elements of arr2, if any
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }
}
