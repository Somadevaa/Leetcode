class Solution {
    public int differenceOfSum(int[] nums) {
        return sum(nums)-sepsum(nums);
        
    }
    private int sum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            }
            return sum;
    }
    private int sepsum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                sum=sum+nums[i]%10;
                nums[i]=nums[i]/10;
            }
            
        }
        return sum;
    }
}