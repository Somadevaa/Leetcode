class Solution {
    public int maxSubArray(int[] nums) {
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=c+nums[i];
            if(temp<nums[i])
            c = nums[i];
            else
            c =temp;
            if(max<c)
            max=c;

        }
        return max;
        
    }
}