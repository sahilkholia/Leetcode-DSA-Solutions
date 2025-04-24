package org.example.MajorityElement;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void MajorityElementTest(){
        int[] nums = {2,2,1,1,1,2,2};
        int expected = 2;
        assertEquals(expected, solution.majorityElement(nums));
    }
}