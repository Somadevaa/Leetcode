class Solution {
    public int mySqrt(int x) {
        int start=1,end=x,ans=0;
        while(start<=end){
            int mid=start + (end - start) / 2;
            long sq=(long)mid*mid;
            if(x==sq){
                return mid;
            }
            if(sq<x){
                start=mid+1;
                ans=mid;

            }
            else
             {
                end=mid-1;
                
             }}

       return ans; 
    
}}