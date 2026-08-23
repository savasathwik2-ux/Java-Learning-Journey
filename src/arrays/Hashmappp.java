package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmappp {
    public static void main(String[] args){
        int[] nums = {1,2,5,6,5,5};
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
           if(map.containsKey(num)){
               map.put(num, map.get(num) + 1);
           }
           else{
               map.put(num,1);
           }
        }
        for(int i=1; i<=nums.length; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
