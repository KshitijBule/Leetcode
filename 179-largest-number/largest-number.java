class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        String ans="";

        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i] + "";
        }

        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));

        for(String s : arr){
            ans += s;
        }
        if(ans.charAt(0) == '0') return "0";
        return ans;
    }
}