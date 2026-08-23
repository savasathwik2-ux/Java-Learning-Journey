package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class MaxFrequencySubArray {
    static int maxSubarray(int[] nums , int k){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        int count = k;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num) +1);
            }
            else{
                map.put(num , 1);
            }
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[0]){
                if(map.get(nums[i]) >= k){
                    count+=k;
                    map.put(nums[i], map.get(nums[i])-k);
                }
                else{
                    break;
                }
            }
            else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {1,10};
        System.out.println(maxSubarray(nums , 2));
    }
}
