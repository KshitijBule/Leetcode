class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] r = new int[k]; 
        HashMap<Integer,Integer> map = new HashMap<>();



        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int i=0;i<k;i++){
            int maxValue = Integer.MIN_VALUE;
            int maxKey = -1;
            for(Map.Entry<Integer,Integer> e : map.entrySet()){
                if(e.getValue()>maxValue){
                    maxValue = e.getValue();
                    maxKey = e.getKey();
                }
        }

        r[i] = maxKey;

        map.remove(maxKey);

        }

        return r;
    }
}