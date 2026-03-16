class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] sol = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    sol[0] = i;
                    sol[1] = j;
                    return sol;  
                }
            }
        }
        return sol;  
    }
}

