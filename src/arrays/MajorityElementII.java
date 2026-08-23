package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        if (nums.length < 3) {
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
                return list;
            }
        } else {
            for (int num : nums) {
                if (map.get(num) > nums.length / 3) {
                    if(!list.contains(num)) {
                        list.add(num);
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1,2,3,1,2,3};
        System.out.println(majorityElement(nums));
    }
}
