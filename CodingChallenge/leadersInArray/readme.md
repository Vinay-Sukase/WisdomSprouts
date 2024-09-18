# Find Leaders in an Array

## Problem Statement
You are given an integer array `arr` of size `n`. An element is considered a leader if it is greater than all elements to its right. Your task is to find all such leader elements and return them in the order they appear.

### Example
Input: arr = [16, 17, 4, 3, 5, 2]  
Output: [17, 5, 2]

### Approach

To solve this problem efficiently:
1. Traverse the array from **right to left**.
2. Track the maximum element found so far (starting with the last element).
3. If the current element is greater than the maximum, it is a leader.
4. Reverse the result at the end to maintain the original order.

### Time Complexity
- **O(n)**: We traverse the array once from right to left.

### Space Complexity
- **O(1)**: No extra space is used, except for the result.

### Hand-run Example
For `arr = [16, 17, 4, 3, 5, 2]`:
- Leaders: `17`, `5`, `2`
- Final output: `[17, 5, 2]`

Hand-run of the Program:
Consider the input:
arr = [16, 17, 4, 3, 5, 2]

Initialize the current leader as 2, since it's the last element.
Leaders so far: [2]
Move to the next element 5, which is greater than 2.
Update the leader to 5.
Leaders so far: [2, 5]
Move to the next element 3, which is less than 5.
No change in the leader.
Leaders so far: [2, 5]
Move to the next element 4, which is less than 5.
No change in the leader.
Leaders so far: [2, 5]
Move to the next element 17, which is greater than 5.
Update the leader to 17.
Leaders so far: [2, 5, 17]
Move to the last element 16, which is less than 17.
No change in the leader.
Final leaders: [2, 5, 17]
After reversing the result, the final output is [17, 5, 2].
