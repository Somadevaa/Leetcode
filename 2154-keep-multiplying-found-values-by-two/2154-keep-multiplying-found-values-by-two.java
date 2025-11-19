class Solution {
    public int findFinalValue(int[] nums, int orginal) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==orginal){
                orginal=orginal*2;
            }
        }
        return orginal;
        
    }
}