package org.example.RotateImage;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void RotateImageTest(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};

        assertArrayEquals(expected, new Solution().rotate(matrix));
    }
}