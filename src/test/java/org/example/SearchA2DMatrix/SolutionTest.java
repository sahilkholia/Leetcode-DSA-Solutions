package org.example.SearchA2DMatrix;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void SearchA2DMatrixTest(){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        assertFalse(solution.searchMatrix(matrix, target));
    }
}