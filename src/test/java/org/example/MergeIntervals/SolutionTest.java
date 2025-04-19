package org.example.MergeIntervals;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void mergeIntervalsTest(){

        Solution solution = new Solution();

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] expected = {{1,6},{8,10},{15,18}};

        assertArrayEquals(expected, solution.merge(intervals));
    }
}