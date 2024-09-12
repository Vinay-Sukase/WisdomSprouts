import java.util.Scanner;

public class MergeWithoutInbuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the sizes of the two arrays
        System.out.println("Enter the size of arr1:");
        int m = sc.nextInt();
        System.out.println("Enter the size of arr2:");
        int n = sc.nextInt();

        // Input the elements of arr1
        int[] arr1 = new int[m];
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

        // Merge arrays using the gap algorithm
        mergeWithGapAlgorithm(arr1, arr2, m, n);

        // Print merged arrays
        System.out.println("Merged arr1:");
        for (int i = 0; i < m; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Merged arr2:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static void mergeWithGapAlgorithm(int[] arr1, int[] arr2, int m, int n) {
        int gap = (m + n + 1) / 2;

        while (gap > 0) {
            int i = 0, j = gap;

            // Compare elements within arr1
            while (j < m) {
                if (arr1[i] > arr1[j]) {
                    // Swap
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
                i++;
                j++;
            }

            // Compare elements between arr1 and arr2
            j = (gap > m) ? gap - m : 0;
            i = gap > m ? 0 : gap;
            while (i < m && j < n) {
                if (arr1[i] > arr2[j]) {
                    // Swap
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
                i++;
                j++;
            }

            // Compare elements within arr2
            j = gap - m > 0 ? gap - m : 0;
            i = 0;
            while (j < n) {
                if (arr2[i] > arr2[j]) {
                    // Swap
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
                i++;
                j++;
            }

            // Reduce gap
            if (gap == 1) {
                break;
            }
            gap = (gap + 1) / 2;
        }
    }
}
