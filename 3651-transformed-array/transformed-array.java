class Solution {
    public int[] constructTransformedArray(int[] nums) {
        
        int res;
        int n = nums.length;
        int r[] = new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res = nums[i]%n;
                r[i] = nums[(i+res)%n];
            }
            else if(nums[i]<0){
                res = Math.abs(nums[i])%n;
                if(i-Math.abs(res) < 0)
                r[i] = nums[n - Math.abs(i-res)];
                else{
                    r[i] = nums[i-Math.abs(res)];
                }
            }
            else{
                r[i] = nums[i];
            }
        }
        return r;
    }
}