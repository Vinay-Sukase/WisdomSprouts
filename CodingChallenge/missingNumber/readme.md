# Find the Missing Number

## Problem Statement:
You are given an array `arr` containing `n-1` distinct integers. 
The array consists of integers taken from the range `1` to `n`, meaning one integer is missing from this sequence. 
Your task is to find the missing integer.

### Input:
- An integer array `arr` of size `n-1` where the elements are distinct and taken from the range 1 to n.
- Example: `arr = [1, 2, 4, 5]`

### Output:
- Return the missing integer from the array.
- Example: Missing number: 3

### Constraints:
- The array contains exactly `n-1` distinct integers, and all integers are in the range `[1, n]`.
- Time complexity must be `O(n)`.
- Space complexity should be `O(1)` (constant space).
- \( 1 \ leq n \ leq 10^6 \)

## Approach:

### Solution 1: Without In-built Functions
- The sum of numbers from `1` to `n` can be calculated using the formula:  
  \[ \ text{Sum}_n = \ frac{n \ times (n + 1)}{2} \]
- We calculate the sum of the array elements and subtract it from the total sum to find the missing number.

### Solution 2: Using In-built Functions
- We use the same logic but utilize Java's `Arrays.stream()` method to calculate the sum of the array elements more easily.

## Hand-run Example:
For input `arr = [1, 2, 4, 5]`, `n = 5`:

1. Total sum from `1` to `5`:  
   \[ 15 \]
   
2. Array sum:  
   \[ 1 + 2 + 4 + 5 = 12 \]

3. Missing number:  
   \[ 15 - 12 = 3 \]

## Code Explanation:
- We calculate the total sum using the arithmetic formula.
- The sum of the array elements is computed either manually (without in-built functions) or using `Arrays.stream()` (with in-built functions).
- The missing number is found by subtracting the array sum from the total sum.
