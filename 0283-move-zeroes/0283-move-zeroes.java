class Solution {
    public void moveZeroes(int[] nums) {
        int b=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[b++]=nums[i];

            }
           
        }
        for(int i=b;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(a));
        
    }
}