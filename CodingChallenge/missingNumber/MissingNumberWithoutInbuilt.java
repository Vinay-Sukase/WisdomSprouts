import java.util.Scanner;

public class MissingNumberWithoutInbuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the array size n
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        // Input the array elements
        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the total sum from 1 to n
        int totalSum = (n * (n + 1)) / 2;

        // Calculate the sum of the array elements
        int arraySum = 0;
        for (int i = 0; i < n - 1; i++) {
            arraySum += arr[i];
        }

        // The missing number is the difference between totalSum and arraySum
        int missingNumber = totalSum - arraySum;

        System.out.println("Missing number: " + missingNumber);
    }
}
