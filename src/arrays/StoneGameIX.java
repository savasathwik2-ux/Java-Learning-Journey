package arrays;

import java.util.HashMap;

public class StoneGameIX {
    static boolean winner(int[] stones){
        int reminder = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < stones.length; i++){
            switch (stones[i] % 3){
                case 0 ->{
                    if(map.containsKey(0)){
                        map.put(0 , map.get(0) + 1);
                    }
                    else {
                        map.put(0 , 1);
                    }
                }
                case 1 ->{
                    if(map.containsKey(1)){
                        map.put(1 , map.get(1) + 1);
                    }
                    else {
                        map.put(1 , 1);
                    }
                }
                case 2 ->{
                    if(map.containsKey(2)){
                        map.put(2 , map.get(2) + 1);
                    }
                    else {
                        map.put(2 , 1);
                    }
                }
            }
        }
        for(int i = 0; i < stones.length; i++){
            if(count == 0){
                count ++;
                switch(reminder){
                    case 0 ->{
                        if(map.containsKey(1)){
                            reminder+=1;
                            map.put(1 , map.get(1)-1);
                            break;
                        }
                        else if(map.containsKey(2)){
                            reminder+=2;
                            map.put(2 , map.get(2)-1);
                        }
                        else{
                            return false;
                        }
                    }
                    case 1 ->{
                        if(map.containsKey(0)){
                            reminder+=0;
                            map.put(0 , map.get(0)-1);
                        }
                        else {
                            return false;
                        }
                    }
                    case 2 -> {
                        if(map.containsKey(0)){
                            reminder+=0;
                            map.put(0 , map.get(0)-1);
                        }
                    }
                }
            }
            else{
                count--;
                switch(reminder){
                    case 0 ->{
                        if(map.containsKey(1)){
                            reminder+=1;
                            map.put(1 , map.get(1)-1);
                        }
                        else if(map.containsKey(2)){
                            reminder+=2;
                            map.put(2 , map.get(2)-1);
                        }
                        else{
                            return true;
                        }
                    }
                    case 1 ->{
                        if(map.containsKey(0)){
                            reminder+=0;
                            map.put(0 , map.get(0)-1);
                        }
                        else {
                            return true;
                        }
                    }
                    case 2 -> {
                        if(map.containsKey(0)){
                            reminder+=0;
                            map.put(0 , map.get(0)-1);
                        }
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] stones = {3,3};
        System.out.println(winner(stones));
    }
}
