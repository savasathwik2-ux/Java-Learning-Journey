package arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4, 4, 4};
        int target = 12;
        int[] ans = Solution(arr, target);
            System.out.println(ans[0]);
            System.out.println(ans[1]);
        }

  static int[] Solution(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                  return new int[] {i,j};
                }
            }
        }
     return new int[] {-1,-1};
    }
}
