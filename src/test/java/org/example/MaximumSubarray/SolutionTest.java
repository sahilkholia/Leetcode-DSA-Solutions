package org.example.MaximumSubarray;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void MaximumSubarrayTest(){
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;

        assertEquals(expected, solution.maxSubArray(nums));
    }
}