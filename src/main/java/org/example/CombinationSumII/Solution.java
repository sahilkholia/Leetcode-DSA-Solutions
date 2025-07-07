package org.example.CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] candidates = {3,1,3,5,1,1};
        int target = 8;
        Solution solution = new Solution();
        List<List<Integer>> sol = solution.combinationSum2(candidates, target);
        for (List<Integer> integers : sol) {
            System.out.println(integers);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        pnp(0,candidates, target, sol,curr);
        return sol;
    }
    void pnp(int i, int[] candidates, int target, List<List<Integer>> sol, List<Integer> curr){
        if(target == 0){
            sol.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        if(i==candidates.length){
            return;
        }

        for(int j = i; j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1]){
                continue;
            }
            if(candidates[j]>target) break;
            curr.add(candidates[j]);
            pnp(j+1, candidates, target-candidates[j], sol, curr);
            curr.remove(curr.size()-1);
        }


    }
}
