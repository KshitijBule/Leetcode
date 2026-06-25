class Solution {
    public int f(int ind,int[] arr,int[] dp){
        if(ind==0) return arr[ind];
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];

       int pick = arr[ind] + f(ind-2,arr,dp);
       int not = 0 + f(ind-1,arr,dp);

        return dp[ind] = Math.max(pick,not);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        return f(n-1,nums,dp);


    }
}