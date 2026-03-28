class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max = 0;
        int count=0;

        if(s.length()==1 || s.length()==0){
            return 0;
        }

        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                 count=0;
            }
            
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                count++;
                max = Math.max(count,max);
            }
            else if(s.charAt(i)==')'){
                st.pop();
                count--;
            }
            else{
                continue;
            }
        }
        return max;
       
    }
}