class Solution {
    public int reverse(int x) {
        int i=(x>0)?1:-1;
        x=Math.abs(x);
        int a =x;
        long rev =0;
        while(x!=0){
            int last =x%10;
             rev=rev*10 + last;
            x/=10;
        }
        if (rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
            return 0;
        }
       
        return  (int)rev*i;
        }}
        
