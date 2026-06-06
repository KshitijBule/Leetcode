class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        int total = 0;
        int count=0;

        if(n==1){
            return cost[0];
        }
        if(n==2){
            return cost[0]+cost[1];
        }

        Arrays.sort(cost);

        for(int i=n-1;i>=0;i--){
            
            if(count==2){
                count = 0;
                continue;
            }else{
                total += cost[i];
                count++;
            }
            
        }

        return total;
    }
}