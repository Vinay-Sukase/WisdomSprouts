import java.util.Scanner;

public class FindDuplicateWithInbuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the array size n+1
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        
        int[] arr = new int[n + 1];
        System.out.println("Enter " + (n + 1) + " elements:");
        for (int i = 0; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform binary search
        int low = 1, high = n, duplicate = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Count how many numbers are less than or equal to mid
            int count = 0;
            for (int num : arr) {
                if (num <= mid) {
                    count++;
                }
            }

            // If count > mid, the duplicate is in the left half
            if (count > mid) {
                duplicate = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Duplicate number: " + duplicate);
    }
}
