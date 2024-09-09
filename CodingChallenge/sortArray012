Problem Statement -

You need to sort an array consisting of only 0s, 1s, and 2s in linear time 
𝑂(𝑛)
O(n) and in-place (without using extra space beyond a few variables). The Dutch National Flag algorithm is ideal for this task.

Approach - 
The Dutch National Flag algorithm, developed by Edsger Dijkstra, effectively sorts the array by maintaining three pointers:

low: Tracks the boundary for 0s.
mid: Used to traverse the array.
high: Tracks the boundary for 2s.

Algorithm - 

1. Initialization:
    Set low and mid to the beginning of the array.
    Set high to the end of the array.

2. Processing:
    Traverse the array with mid.
    If arr[mid] is 0, swap it with arr[low], increment both low and mid.
    If arr[mid] is 1, simply increment mid.
    If arr[mid] is 2, swap it with arr[high] and decrement high. Do not increment mid because the new arr[mid] needs to be processed.
    
3. Completion:
    Continue until mid exceeds high. At this point, the array is sorted.
    
* Code Explanation -
    sortArray012(int[] arr): Implements the Dutch National Flag algorithm to sort the array.
    swap(int[] arr, int i, int j): Helper method to swap two elements in the array.
    printArray(int[] arr): Helper method to print the array.

Test Cases - 
Test Case 1: [0, 1, 2, 1, 0, 2, 1, 0] → [0, 0, 0, 1, 1, 1, 2, 2]
Test Case 2: [2, 2, 2, 2] → [2, 2, 2, 2]
Test Case 3: [0, 0, 0, 0] → [0, 0, 0, 0]
Test Case 4: [1, 1, 1, 1] → [1, 1, 1, 1]
Test Case 5: [2, 0, 1] → [0, 1, 2]
Test Case 6: [] → [] (Empty array)

This approach ensures that the array is sorted in linear time 𝑂(𝑛) and in-place, meeting the problem's constraints.
