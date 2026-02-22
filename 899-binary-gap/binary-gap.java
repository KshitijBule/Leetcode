class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        
        int lastIndex = -1;  
        int maxDistance = 0;  
        
        
        for (int i = 0; i < binary.length(); i++) {
            
            
            if (binary.charAt(i) == '1') {
                
            
                if (lastIndex != -1) {
                    int distance = i - lastIndex;
                    maxDistance = Math.max(maxDistance, distance);
                }
                
            
                lastIndex = i;
            }
        }
        
        return maxDistance;
        }
        
       
}