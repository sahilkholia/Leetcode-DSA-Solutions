package org.example.SortColors;


public class Solution {
    public int[] sortColors(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0 && mid>low){
                //swap with low
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
            }else if(nums[mid]==2 && mid<high){
                //swap with high
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }else{
                //continue
                mid++;
            }
        }
        return nums;
    }
}
