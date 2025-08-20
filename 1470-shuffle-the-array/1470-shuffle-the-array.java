class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []res = new int[nums.length];
        int in=0;
        for(int i=0;i<n;i++){
            
            res[in++]=nums[i];
            res[in++]=nums[i+n];

        }
        return res;
        
    }
}