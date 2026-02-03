class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        
        // Step 1: Increasing part
        int p = 0;
        while (p + 1 < n && nums[p] < nums[p + 1]) {
            p++;
        }
        if (p == 0 || p == n - 1) return false;
        
        // Step 2: Decreasing part
        int q = p;
        while (q + 1 < n && nums[q] > nums[q + 1]) {
            q++;
        }
        if (q == p || q == n - 1) return false;
        
        // Step 3: Final increasing part
        while (q + 1 < n && nums[q] < nums[q + 1]) {
            q++;
        }
        
        return q == n - 1;
    }
}