package org.example.BestTimeToBuyAndSellStock;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void BestTimeToBuyAndSellStockTest(){
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        int expected = 5;

        assertEquals(expected, solution.maxProfit(prices));
    }
}