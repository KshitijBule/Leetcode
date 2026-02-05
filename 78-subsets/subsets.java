class Solution {
     private void helper(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Exclude current element
        helper(nums, index + 1, current, result);

        // Include current element
        current.add(nums[index]);
        helper(nums, index + 1, current, result);

        // Backtrack
        current.remove(current.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), result);
        return result;
    }
}