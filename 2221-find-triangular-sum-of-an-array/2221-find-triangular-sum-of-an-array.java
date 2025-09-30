class Solution {
    public int triangularSum(int[] nums) {
        int sum=0;
        int s=nums.length;
        while(s>0){
            for(int i=0;i<s-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
               
            }
             s--;

        }
        return nums[0];
        
    }
}