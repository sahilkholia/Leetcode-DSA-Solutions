package org.example.SetMatrixZeroes;

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

public class Solution {
    public int[][] setZeroes(int[][] matrix) {
        int[] i = new int[matrix.length];
        int[] j = new int[matrix[0].length];

        for(int x=0; x<matrix.length;x++){
            for(int y=0;y<matrix[0].length;y++){
                if(matrix[x][y]==0){
                    i[x] = -1;
                    j[y] = -1;
                }
            }
        }
        for(int x=0; x<matrix.length;x++){
            for(int y=0;y<matrix[0].length;y++){
                if(i[x]==-1 || j[y]==-1){
                    matrix[x][y] = 0;
                }
            }
        }
        return matrix;
    }
}
