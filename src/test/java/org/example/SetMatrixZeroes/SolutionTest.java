package org.example.SetMatrixZeroes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void SetMatrixZeroesTest(){
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] expected = {{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        int[][] sol = solution.setZeroes(matrix);
        assertArrayEquals(expected, sol);
    }
}