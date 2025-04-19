package org.example.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return new int[0][0];

        List<int[]> result = new ArrayList<>();

        //Sort Intervals
        Arrays.sort(intervals, (a, b)->a[0]-b[0] == 0 ? a[1]-b[1]:a[0]-b[0]);

        int [] expInt = intervals[0];
        for(int i=1; i<intervals.length; i++){
            int [] currentInt = intervals[i];
            if(expInt[1]>=currentInt[0]){
                expInt[1] = Math.max(currentInt[1], expInt[1]);
            }else{
                result.add(expInt);
                expInt = currentInt;
            }
        }
        result.add(expInt);


        int [][] output = new int[result.size()][2];
        int i=0;
        for(int []  r: result){
            output[i] = r;
            i++;
        }
        return output;
    }
}
