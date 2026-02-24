class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int minSum = 0;
        int i=0;
        int j=1;

        while(j<=n-1){
            minSum += Math.min(nums[i],nums[j]);
            i+=2;
            j+=2;
        }
        return minSum;
    }
}