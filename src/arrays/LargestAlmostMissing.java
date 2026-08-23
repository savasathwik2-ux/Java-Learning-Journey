package arrays;

import java.util.Arrays;

public class LargestAlmostMissing {
    static int missing(int[] nums , int k){
        int num;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int count = 0;
            int j=k-1;
            int h=0;
            num = nums[i];
            while(j < nums.length){
                for(int m=h ; m<=j; m++){
                    if(nums[m] == num){
                        count++;
                    }
                }
                j++;
                h++;
            }
            if(count == 1 && nums[i] > ans){
                ans = nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums={3,9,7,2,1,7};
        System.out.println(missing(nums , 5));
    }
}
