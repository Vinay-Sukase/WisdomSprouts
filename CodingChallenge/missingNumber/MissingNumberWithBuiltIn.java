import java.util.Arrays;

public class MissingNumberWithBuiltIn {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = (n * (n + 1)) / 2; // Sum from 1 to n
        int arraySum = Arrays.stream(arr).sum(); // Using stream to sum up the array

        // The missing number is the difference between the two sums
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        System.out.println("Missing number: " + findMissingNumber(arr, n));
    }
}
