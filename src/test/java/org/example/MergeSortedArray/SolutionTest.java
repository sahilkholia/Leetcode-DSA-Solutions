package org.example.MergeSortedArray;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void MergeSortedArrayTest(){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int[] expected = {1,2,2,3,5,6};

        assertArrayEquals(expected, solution.merge(nums1, m, nums2, n));
    }
}