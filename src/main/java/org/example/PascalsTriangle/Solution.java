package org.example.PascalsTriangle;

//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> entry = new ArrayList<>();
            for(int j=0;j<=i;j++){
                entry.add(findNum(pascalTriangle, i, j));
            }
            pascalTriangle.add(entry);
        }
        return pascalTriangle;
    }
    int findNum(List<List<Integer>> pascalTriangle, int i, int j){
        if(i==0){
            return 1;
        }
        if(j==0){
            return 1;
        }
        if(j==i){
            return 1;
        }
        return pascalTriangle.get(i-1).get(j-1) + pascalTriangle.get(i-1).get(j);
    }
}
