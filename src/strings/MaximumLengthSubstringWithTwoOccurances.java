package strings;

import java.util.HashMap;

public class MaximumLengthSubstringWithTwoOccurances {

    static int maximumOccurance(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (map.containsKey(ch)) {

                    if (map.get(ch) == 2) {
                        break;
                    }

                    map.put(ch, map.get(ch) + 1);

                } else {
                    map.put(ch, 1);
                }

                int currentLength = j - i + 1;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "aaaaa";

        System.out.println(maximumOccurance(s));
    }
}