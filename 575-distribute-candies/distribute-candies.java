

class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();

        for (int candy : candyType) {
            set.add(candy);
        }

        int n = candyType.length;
        return Math.min(set.size(), n / 2);
    }
}


// int n = arr.length/2;
//         int count = 0;
//        HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<arr.length; i++){
//             if(!set.contains(arr[i])){
//                 set.add(arr[i]);
//             }
//         }

//         for(int x : set){
//             if(count<n){
//                 count++;
//             }
//         }
//         return count;

//  int count = 1;
//         int i = 0;
//         int j = 1;
//         int n = arr.length/2;

//         while(count!=n && j<arr.length){
//             if(arr[i] == arr[j]){
//                 i++;
//                 j++;
//             }
//             else{
//                 count++;
//                 i++;
//                 j++;
//             }
//         }
//         return count;