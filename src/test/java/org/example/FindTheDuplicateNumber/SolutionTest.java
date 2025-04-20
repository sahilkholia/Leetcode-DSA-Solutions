package org.example.FindTheDuplicateNumber;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void FindTheDuplicateNumberTest(){
        int[] nums = {1,3,4,2,2};
        int expected = 2;

        assertEquals(expected, solution.findDuplicate(nums));
    }
}