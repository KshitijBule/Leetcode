class Solution {
    int n;
    int[] suffixSum;
    Integer[][] dp;

    public int stoneGameII(int[] piles) {
        n = piles.length;

        // suffixSum[i] = total stones from i to end
        suffixSum = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }

        dp = new Integer[n][n + 1];
        return solve(0, 1);
    }

    private int solve(int i, int m) {
        // if all piles taken
        if (i >= n) return 0;

        // if can take all remaining piles
        if (2 * m >= n - i) {
            return suffixSum[i];
        }

        if (dp[i][m] != null) return dp[i][m];

        int max = 0;

        // try all X from 1 to 2M
        for (int x = 1; x <= 2 * m; x++) {
            int opponent = solve(i + x, Math.max(m, x));
            int curr = suffixSum[i] - opponent;
            max = Math.max(max, curr);
        }

        return dp[i][m] = max;
    }
}
