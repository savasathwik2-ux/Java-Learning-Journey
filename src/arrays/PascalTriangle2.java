package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    static ArrayList<Integer> pascal(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < rowIndex + 1; i++) {
            int value = list.get(i-1) + list.get(i);
            list.add(value);
        }
        list.add(1);
        return list;
    }
    public static void main(String[] args){
        System.out.println(pascal(3));
    }
}
