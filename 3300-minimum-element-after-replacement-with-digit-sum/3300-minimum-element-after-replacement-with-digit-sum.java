class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=sum(nums[i]);
        }
        Arrays.sort(nums);
         return nums[0];
        

        
    }
    public int sum(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;

        }
        return sum;
    }
   
}