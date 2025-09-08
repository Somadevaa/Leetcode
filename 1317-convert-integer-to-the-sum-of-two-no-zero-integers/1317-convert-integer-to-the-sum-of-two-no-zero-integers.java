class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int b=n-i;
            if(zero(i)&&zero(b))
            return new int[]{i,b};
        }
    return new int[]{-1,-1};
}
 public boolean zero(int num){
        while(num>0){
            if(num%10==0) return false;
            num/=10;

        }
        return true;
        }}