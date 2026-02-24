class Solution {
    public int arrayPairSum(int[] nums) {

        int[] freq = new int[20001]; // range from -10000 to 10000

        // Count frequencies
        for (int num : nums) {
            freq[num + 10000]++;
        }

        int sum = 0;
        boolean add = true;

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                if (add) {
                    sum += i - 10000;
                }
                add = !add;
                freq[i]--;
            }
        }

        return sum;
    }
}