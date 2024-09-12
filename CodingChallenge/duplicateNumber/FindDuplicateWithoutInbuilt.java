import java.util.Scanner;

public class FindDuplicateWithoutInbuilt {
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

        // Initialize tortoise and hare pointers
        int tortoise = arr[0];
        int hare = arr[0];

        // Move tortoise by one step and hare by two steps to detect cycle
        do {
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
        } while (tortoise != hare);

        // Find the entry point of the cycle (duplicate number)
        tortoise = arr[0];
        while (tortoise != hare) {
            tortoise = arr[tortoise];
            hare = arr[hare];
        }

        // The duplicate number
        System.out.println("Duplicate number: " + hare);
    }
}
