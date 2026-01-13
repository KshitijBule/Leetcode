class Solution {
    public int repeatedNTimes(int[] nums) {
        // int n = nums.length/2;
        int i = 0;
        HashSet<Integer> set = new HashSet<>();

        while(i<nums.length){
            if(set.contains(nums[i]))
            return nums[i];

            set.add(nums[i]);
            i++;
        }
        return 0;
    }
}