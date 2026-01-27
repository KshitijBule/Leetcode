import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] arr = score.clone();
        Arrays.sort(arr);

        HashMap<Integer, String> map = new HashMap<>();
        int rank = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (rank == 1) {
                map.put(arr[i], "Gold Medal");
            } else if (rank == 2) {
                map.put(arr[i], "Silver Medal");
            } else if (rank == 3) {
                map.put(arr[i], "Bronze Medal");
            } else {
                map.put(arr[i], String.valueOf(rank));
            }
            rank++;
        }

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = map.get(score[i]);
        }

        return result;
    }
}
