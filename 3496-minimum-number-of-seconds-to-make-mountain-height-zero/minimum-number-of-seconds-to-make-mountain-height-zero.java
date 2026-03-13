class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 1;
        long right = (long)1e18;
        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (canReduce(mid, mountainHeight, workerTimes)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean canReduce(long time, int mountainHeight, int[] workerTimes) {
        long total = 0;

        for (int w : workerTimes) {
            long left = 0, right = (long)1e6;
            long best = 0;

            while (left <= right) {
                long mid = (left + right) / 2;
                long needed = (long)w * mid * (mid + 1) / 2;

                if (needed <= time) {
                    best = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            total += best;
            if (total >= mountainHeight) return true;
        }

        return false;
    }
}