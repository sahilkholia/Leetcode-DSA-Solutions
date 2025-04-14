package org.example.CountGoodTriplets;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void countGoodTripletsTest(){
        int[] arr = {3,0,1,1,9,7};
        int a = 7;
        int b = 2;
        int c = 3;

        int sol = solution.countGoodTriplets(arr,a,b,c);
        assertEquals(4,sol);
    }

}