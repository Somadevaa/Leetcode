class Solution {
    public boolean isPalindrome(int x) {
        int old =x;
         int result =0;
        while(x>0){
        int a= x%10;
        result=result*10+a;
        x/=10;}
        if(result==old)
         return true;
        else
        return false;        
    }
}