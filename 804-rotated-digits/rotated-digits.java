class Solution {
    public boolean isGood(int n){
        int r;
        boolean change = false;
        while(n>0){
            r = n%10;
            if(r==3||r==4||r==7){
                return false;
            }
            if(r==2||r==5||r==6||r==9){
                change = true;
            }
            n=n/10;
        }
        return change;
    }
    public int rotatedDigits(int n) {
         int count=0;
    
         for(int i=1;i<=n;i++){
            if(isGood(i)){
                count++;
            }
         }
         return count;
         
    }
}