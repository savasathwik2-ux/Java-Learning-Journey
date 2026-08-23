package arrays;

public class MaxWaterStoring {
    static int Sol(int[] heights) {
        int newArea = 0;
        int area = 0;
        int breadth = 0, length = 0;
        int l = 0;
        int r = heights.length - 1;
       while(l<r){
            breadth = Math.min(heights[l], heights[r]);
            length = r - l;
            newArea = breadth * length;
            if (newArea > area) {
                area = newArea;
            }
            if(heights[l] < heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
    }
    public static void main(String[] args){
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(Sol(heights));
    }
}
