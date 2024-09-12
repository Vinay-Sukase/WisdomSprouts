# Merge Two Sorted Arrays In-Place

## Problem Statement
You are given two sorted arrays `arr1` of size `m` and `arr2` of size `n`. Your task is to merge these two arrays into a single sorted array without using any extra space. The final merged array should be sorted and reflect the combined elements from both `arr1` and `arr2`.

### Example
Input: `arr1 = [1, 3, 5]`, `arr2 = [2, 4, 6]`
Output: `[1, 2, 3, 4, 5, 6]`

## Approach

We will solve this problem by merging the arrays **in-place**. This means:
- Start from the end of both arrays.
- Compare the largest elements from both `arr1` and `arr2`.
- Insert the larger one at the end of the merged array.
- Repeat the process until all elements are merged.

### Time Complexity
- **O(m + n)**: We traverse both arrays once.

### Space Complexity
- **O(1)**: The merging is done in-place without any extra space.

## Hand-run of the Program
Consider `arr1 = [1, 3, 5, _, _, _]` and `arr2 = [2, 4, 6]`.

- Compare `5` and `6`: Place `6` at the end.
- Compare `5` and `4`: Place `5` in the second-last position.
- Compare `3` and `4`: Place `4` in the third-last position.
- Continue this process until all elements are merged.

Final result: `[1, 2, 3, 4, 5, 6]`.
