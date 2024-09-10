public class MissingNumberNoBuiltIn {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = (n * (n + 1)) / 2; // Sum from 1 to n
        int arraySum = 0;

        // Calculate the sum of the elements in the array
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        // The missing number is the difference between the two sums
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        System.out.println("Missing number: " + findMissingNumber(arr, n));
    }
}
