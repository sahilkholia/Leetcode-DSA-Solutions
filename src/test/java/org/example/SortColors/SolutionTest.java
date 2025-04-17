package org.example.SortColors;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void sortColorsTest(){
        Solution solution = new Solution();

        int[] nums = {2,0,2,1,1,0};
        int[] expected = {0,0,1,1,2,2};

        assertArrayEquals(expected, solution.sortColors(nums));
    }

}