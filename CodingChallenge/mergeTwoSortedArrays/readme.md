# Merge Two Sorted Arrays In-Place

## Problem Statement
You are given two sorted arrays `arr1` of size `m` and `arr2` of size `n`. Your task is to merge these two arrays into a single sorted array without using any extra space. The result should be reflected in both `arr1` and `arr2`.

### Example
Input: `arr1 = [1, 3, 5]`,` arr2 = [2, 4, 6]`
Output: `arr1 = [1, 2, 3]`, `arr2 = [4, 5, 6]`


## Approach

### Solution 1: Gap Algorithm
1. Start with an initial gap equal to `(m + n) / 2`.
2. Compare elements separated by the gap and swap if necessary.
3. Reduce the gap after each pass until the gap becomes 1.

### Solution 2: Using In-Built Functions
1. Merge `arr1` and `arr2` into one array and sort it.
2. Copy back the sorted elements into `arr1` and `arr2`.

**Solution 1 (Gap Algorithm):**
1. Initial gap = 3.
2. Swap elements across `arr1` and `arr2`.
3. Final result: `arr1 = [1, 2, 3]`, `arr2 = [4, 5, 6]`.

## Hand-run of the Program
Solution 1 (Gap Algorithm):

`Gap = 3`:

Compare `arr1[0]` and `arr1[3]` (Out of bounds, skip).
Compare `arr1[0]` and `arr2[0]` (1 <= 2, no swap).
Compare `arr1[1] and arr2[1]` (3 > 2, swap to get `arr1 = [1, 2, 5]`, `arr2 = [3, 4, 6]`).
`Gap = 1`:

Compare adjacent elements within arr1 and arr2 and swap if needed.
`Final result: arr1 = [1, 2, 3], arr2 = [4, 5, 6]`.

**Solution 2 (In-Built Functions):**
1. Merge both arrays and sort.
2. Copy back into `arr1` and `arr2`.

## Hand-run of the Program
Solution 2 (Using In-Built Functions):

Merge Arrays:
`Combined array = [1, 3, 5, 2, 4, 6]`.

Sort Array:
`Sorted combined array = [1, 2, 3, 4, 5, 6]`.

Copy Back:
Copy the first half to arr1 = [1, 2, 3] and the second half to arr2 = [4, 5, 6].
