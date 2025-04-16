package org.example.PascalsTriangle;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void PascalsTriangleTest(){
        int numRows = 5;
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>(List.of(1)));
        triangle.add(new ArrayList<>(Arrays.asList(1, 1)));
        triangle.add(new ArrayList<>(Arrays.asList(1, 2, 1)));
        triangle.add(new ArrayList<>(Arrays.asList(1, 3, 3, 1)));
        triangle.add(new ArrayList<>(Arrays.asList(1, 4, 6, 4, 1)));

        assert triangle.equals(solution.generate(numRows));
    }

}