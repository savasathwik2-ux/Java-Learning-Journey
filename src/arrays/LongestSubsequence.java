package arrays;

import java.util.ArrayList;

public class LongestSubsequence {
    static int longestSequence(int[] nums){
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans^=nums[i];
        }
        if(ans != 0){
            return nums.length;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int value = 0;
        for(int i = 0; i<nums.length; i++){
            if((value^nums[i]) != 0){
                value^=nums[i];
                System.out.println(value^nums[i]);
                list.add(nums[i]);
            }
        }
        return list.size();
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,3,1,7,98,6,1};
        System.out.println(longestSequence(nums));
    }
}
