class Solution {
    public int maxProduct(int[] nums) {
        int big=nums.length-1;
        int small=nums.length-2;
        Arrays.sort(nums);
        return ((nums[big]-1)*(nums[small]-1));

        
    }
}