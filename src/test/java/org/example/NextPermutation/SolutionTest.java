package org.example.NextPermutation;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void NextPermutationTest(){
        Solution solution = new Solution();
        int[] nums = {1,2,3};
        int[] expected = {1,3,2};
        assertArrayEquals(expected, solution.nextPermutation(nums));
    }

}