class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] left=new int[nums.length];
         int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            left[i]=sum;
            sum+=nums[i];
        }
        int [] right=new int[nums.length];
        int su=0;
        for(int i=nums.length-1;i>=0;i--){
            right[i]=su;
            su+=nums[i];
        }
        int []res=new int[nums.length];
        for(int k=0;k<nums.length;k++){
           res[k]= Math.abs(left[k]-right[k]); 

        }
      return  res;
    }
}