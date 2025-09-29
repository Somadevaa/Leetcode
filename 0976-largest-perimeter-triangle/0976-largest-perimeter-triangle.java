class Solution {
    public int largestPerimeter(int[] nums) {
        int len =nums.length-1;
         Arrays.sort(nums);
         int max=0;
         for(int i=len;i>=2;i--){
            int sum=0;
            if(nums[i-1]+nums[i-2]>nums[i]){
                 sum=nums[i]+nums[i-1]+nums[i-2];
            }
            if(max<sum){
                max=sum;
            }
         }

     return max;
        
    }
}