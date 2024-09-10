import java.util.Scanner;

public class SortArray012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initializing the array
        int[] arr = new int[n];

        // Reading the elements of the array
        System.out.println("Enter the elements of the array (0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array
        sortArray012(arr);

        // Printing the sorted array
        System.out.println("Sorted array:");
        printArray(arr);
        
        // Closing the scanner
        scanner.close();
    }

    // Method to sort the array using Dutch National Flag algorithm
    public static void sortArray012(int[] arr) {
        int low = 0;   // Pointer for the next position of 0
        int mid = 0;   // Pointer to traverse the array
        int high = arr.length - 1; // Pointer for the next position of 2

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    // Method to swap elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
