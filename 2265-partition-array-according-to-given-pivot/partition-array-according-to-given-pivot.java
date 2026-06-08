class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        for(int num  : nums){
            if(num<pivot){
                a.add(num);
            }
            else if(num==pivot){
                b.add(num);
            }
            else{
                c.add(num);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        result.addAll(c);

         return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();

    }
}