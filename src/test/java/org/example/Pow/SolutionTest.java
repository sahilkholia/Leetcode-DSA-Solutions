package org.example.Pow;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void PowTest(){
        double x = 2.00000;
        int n = 10;
        double expected = 1024.00000;
        assertEquals(expected, solution.myPow(x, n));
    }

}