package org.example.SearchA2DMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //find row
        int u = 0;
        int d = matrix.length-1;
        int mid;

        while(u<d){
            mid = (int)Math.ceil((double)(u+d)/2);
            if(target>matrix[mid][0]){
                //down inclusive
                u = mid;
            }else if(target<matrix[mid][0]){
                //up
                d = mid-1;
            }else{
                return true;
            }
        }

        //find col using u
        int l = 0;
        int r = matrix[0].length - 1;
        while(l<=r){
            if(l==r && matrix[u][l]==target){
                return true;
            }else if(l==r){
                return false;
            }

            mid = (int)Math.ceil((double)(l+r)/2);
            if(target>matrix[u][mid]){
                //right
                l = mid;
            }else if(target<matrix[u][mid]){
                //left
                r =mid-1;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
