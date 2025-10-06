class Solution {
    public int alternatingSum(int[] nums) {
        int count1=0;
        
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                count1+=nums[i];
            }
            else
            count1-=nums[i];
        }
      return count1;  
    }
}