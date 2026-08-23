package arrays;

public class Solution {
    int[] Solution(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[n - (n / 2) + i] = nums[i];
        }
        return ans;
    }
}
