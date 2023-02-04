package com.company.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] test = {1,3,5,6};
        int target = 7;

        searchInsert(test, target);

    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {return mid;}
            else if (target < nums[mid]) { high = mid - 1;}
            else {low = mid + 1;}
        }
        return low;
    }
}
