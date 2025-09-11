class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int []res= new int[2];
        int []ne=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            ne[i]=count;
        }int h=0;
        for(int i=0;i<ne.length;i++){
            if(ne[i]==2){
                res[h++]=nums[i];
            }
        }
        return res;
    }
}