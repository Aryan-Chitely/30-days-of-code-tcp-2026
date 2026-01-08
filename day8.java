package com.aryan.Day3;

import java.util.Arrays;

class Solution {
    static void main(String[] args) {
        int[] arr={100,4,200,1,3,2};
        int[] arr2={1,2,6,7,8};
        int[] arr3={};
        System.out.println(longestConsecutive(arr));
        System.out.println(longestConsecutive(arr2));
        System.out.println(longestConsecutive(arr3));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int ct=1,mx=1;
        for(int i=1;i<nums.length;i++){
            if (nums[i] != nums[i - 1]) {
                if(nums[i]==nums[i-1]+1)
                    ct++;
                else {
                    mx=Math.max(mx,ct);
                    ct=1;
                }
            }
        }
        return Math.max(mx,ct);
    }
}