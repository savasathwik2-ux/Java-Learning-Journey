package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static List<List<Integer>> pascal(int n){
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        list.add(0 , row);
        for(int i = 1; i<=n; i++){
            ArrayList < Integer > rows = new ArrayList<>();
            rows.add(1);
           for(int j =1; j<i; j++){
               ArrayList<Integer> previous = (ArrayList<Integer>) list.get(i-1);
               int value = previous.get(j-1) + previous.get(j);
               rows.add(value);
           }
           rows.add(1);
           list.add(rows);
        }
        return list;
    }
    public static void main(String[] args){
        System.out.println(pascal(5));
    }
}
