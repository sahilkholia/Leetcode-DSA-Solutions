package org.example.MergeSortedArray;

public class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m-1;
        int r = n-1;
        int k = m+n-1;
        while(r>=0){
            if(l>=0 && nums1[l]>nums2[r]){
                nums1[k] = nums1[l];
                k--;
                l--;
            }else{
                nums1[k] = nums2[r];
                k--;
                r--;
            }
        }
        return nums1;
    }
}
