class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int [] larr = new int[n];
        int [] rarr = new int[n];
        int [] r = new int[n];
        int lsum = 0;
        for(int i=0;i<n;i++){
            larr[i] = lsum;
            lsum += nums[i];
        }

        int rsum = 0;
        for(int j=n-1;j>=0;j--){
            rarr[j] = rsum;
            rsum += nums[j];
        }

        for(int k=0;k<n;k++){
            r[k] = Math.abs(larr[k]-rarr[k]);
        }

        return r;

    }
}