package strings;

import java.util.HashMap;

public class LongestSubstringOfCommonString {
    static  int LongestSubstring(String s){
        int count=0;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i)) +1);
            }
            else {
                map.put(s.charAt(i) , 1);
            }
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)) > count){
                count = map.get(s.charAt(i));
            }
        }
        return count;
    }
    static int[] modifiedString(String s , String queryCharacter , int[] queryIndices){
        int[] ans = new int[queryIndices.length];
        for(int i=0; i< queryIndices.length; i++){
            s.replace(s.charAt(queryIndices[i]) , queryCharacter.charAt(i));
            ans[i] = LongestSubstring(s);
        }
        return ans;
    }
    public static void main(String[] args){
        String s="babacc";
        String queryCharacters = "bcb";
        int[] queryIndices = {1,3,3};
        int[] ans = new int[queryIndices.length];
        ans = modifiedString(s,queryCharacters , queryIndices);
    }
}
