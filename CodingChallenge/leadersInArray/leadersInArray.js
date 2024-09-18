import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FindLeadersInArrayInBuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Find and print leaders using in-built functions
        ArrayList<Integer> leaders = findLeadersInBuilt(arr, n);
        System.out.println("Leaders: " + leaders);
    }
    
    public static ArrayList<Integer> findLeadersInBuilt(int[] arr, int n) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxRight = arr[n - 1];  // Initialize the last element as the leader
        leaders.add(maxRight);
        
        // Traverse the array from the second last element to the first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                leaders.add(arr[i]);
                maxRight = arr[i];  // Update the current leader
            }
        }
        
        // Reverse the list using Collections.reverse
        Collections.reverse(leaders);
        return leaders;
    }
}
