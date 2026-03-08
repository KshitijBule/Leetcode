class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        String r = "";

        for(int i=0;i<n;i++){
            if(nums[i].charAt(i)=='0'){
                r += '1';
            }else{
                r += '0';
            }
        }
        return r;

    }
}