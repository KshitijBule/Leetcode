class Solution {
    public int minPartitions(String n) {
        int l = n.length();
        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<l;i++){
            int digit = n.charAt(i) - '0';
            maxi = Math.max(maxi,digit);
        }
        return maxi;
    }
}