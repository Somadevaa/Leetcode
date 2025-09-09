class Solution {
    public int[] pivotArray(int[] nums, int piviot) {
        int [] res =new int[nums.length];
        int l=0;
        int r=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<piviot){
                res[l++]=nums[i];
                }}
           
        for(int i=0;i<nums.length;i++){
            if(piviot==nums[i]){
                res[l++]=nums[i];
                }}
        for(int i=0;i<nums.length;i++){
            if(nums[i]>piviot){
                res[l++]=nums[i];
                
            }}

        
            return res;
        }

        
    }
