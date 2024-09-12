# Find the Duplicate Number

## Problem Statement
You are given an array `arr` containing `n+1` integers, where each integer is in the range [1, n]. There is exactly one duplicate number in the array, but it may appear more than once. Your task is to find the duplicate number without modifying the array and using constant extra space.

### Example
`Input: [3, 1, 3, 4, 2]`
`Output: Duplicate number: 3`


## Approach

### Solution 1: Floyd's Tortoise and Hare Algorithm (Cycle Detection)

**Approach**:
1. We treat the array as a linked list where each element points to the value at the current index.
2. We use two pointers: the **Tortoise** moves one step at a time, and the **Hare** moves two steps at a time.
3. If a cycle exists (which indicates a duplicate), the two pointers will meet.
4. Once they meet, we reset one of the pointers to the start and move both pointers one step at a time until they meet again. The meeting point is the duplicate number.

### Solution 2: Binary Search

**Approach**:
1. We use binary search on the range `[1, n]`.
2. For each mid-point in the binary search, we count how many elements in the array are less than or equal to that mid-point.
3. If the count is greater than the mid-point, it means the duplicate number lies in the left half of the range.
4. We continue narrowing the search range until we find the duplicate number.

---

## Hand-run of the Program

### Solution 1: Floyd’s Tortoise and Hare Algorithm

Let’s take `arr = [3, 1, 3, 4, 2]` and `n = 4`.

1. **Initialization**:
   - Tortoise starts at `arr[0] = 3`
   - Hare starts at `arr[0] = 3`
  
2. **Phase 1: Detecting the Cycle**:
   - Move `Tortoise` one step and `Hare` two steps:
     - `Tortoise = arr[3] = 4`, `Hare = arr[arr[3]] = arr[2] = 3`
     - `Tortoise = arr[4] = 2`, `Hare = arr[arr[2]] = arr[3] = 4`
     - `Tortoise = arr[2] = 3`, `Hare = arr[arr[4]] = arr[2] = 3` (They meet)
  
3. **Phase 2: Finding the Start of the Cycle (Duplicate)**:
   - Reset Tortoise to start (`arr[0] = 3`), Hare stays at the meeting point (`3`).
   - Move both pointers one step at a time:
     - `Tortoise = arr[3] = 3`, `Hare = arr[3] = 3` (They meet again at 3)
   
4. **Duplicate Number**:
   - The duplicate number is `3`.

---

### Solution 2: Binary Search

Let’s take `arr = [3, 1, 3, 4, 2]` and `n = 4`.

1. **Initialization**:
   - Low = 1, High = 4.
  
2. **Step 1**:
   - Mid-point = `(1 + 4) / 2 = 2`
   - Count elements ≤ 2: `2` (1, 2).
   - Since the count (2) is not greater than Mid (2), move to the right half: `Low = 3`.

3. **Step 2**:
   - Mid-point = `(3 + 4) / 2 = 3`
   - Count elements ≤ 3: `4` (1, 2, 3, 3).
   - Since the count (4) is greater than Mid (3), move to the left half: `High = 2`.

4. **Duplicate Number**:
   - Low = 3, High = 2, so the duplicate number is `3`.

---

## Explanation of Code

### Solution 1: Floyd's Tortoise and Hare Algorithm

**Step 1**: We initialize two pointers, Tortoise and Hare, both starting at the first element of the array (`arr[0]`).  
**Step 2**: The Hare moves twice as fast as the Tortoise. If they meet, it indicates the presence of a cycle.  
**Step 3**: Once a cycle is detected, we reset one of the pointers (Tortoise) to the beginning of the array, and then move both pointers one step at a time.  
**Step 4**: When the pointers meet again, the meeting point is the duplicate number.

### Solution 2: Binary Search

**Step 1**: We perform binary search on the range of numbers from 1 to n.  
**Step 2**: For each mid-point, we count how many numbers in the array are less than or equal to the mid-point.  
**Step 3**: If the count is greater than the mid-point, the duplicate lies in the left half of the range; otherwise, it lies in the right half.  
**Step 4**: We continue narrowing down the search range until the duplicate is found.
