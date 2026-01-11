class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            if(i==solve(nums[i])){
                return i;

            }
        }
        return -1;
    }
    public int solve(int a){
        int n=0;
        
        while(a>0){
            n=n+a%10;
            a/=10;
        }
        
        return n;
    }
}