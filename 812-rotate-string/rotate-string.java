class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();

        if(s.length()!=goal.length()){
            return false;
        }

        String k = s + s;
        if(k.contains(goal)){
            return true;
        } 
        
        return false;
    }
}
// for(int i=0;i<n;i++){
        //     s = s.substring(1) + s.charAt(0);
        //     if(s.equals(goal)){
        //         return true;
        //     }
        //     }
        //     return false;
        // }