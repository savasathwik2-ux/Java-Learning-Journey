package strings;

import java.util.HashMap;

public class RomanToInteger {
    static int romanToInt(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);
        int current , previous;
        int ans = 0;
        for(int i=1; i<=s.length()-1; i++){
            current = map.get(s.charAt(i));
            previous = map.get(s.charAt(i-1));

            if(current <= previous){
                ans+=previous;
            }
            else {
                ans-=previous;
            }
        }
        return ans+map.get(s.charAt(s.length()-1));
    }
    public static void main(String[] args){
        String s ="LCX";
        System.out.println(romanToInt(s));
    }
}
