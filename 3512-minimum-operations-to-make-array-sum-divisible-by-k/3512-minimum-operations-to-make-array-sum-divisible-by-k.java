class Solution {
    public int minOperations(int[] nums, int k) {
        int su=0;
        for(int i=0;i<nums.length;i++){
            su+=nums[i];

        }
        if(su%k==0)
        return 0;
        else if(su%k<k){
            return su%k;
        }
        else
        return su;
        
    }
}