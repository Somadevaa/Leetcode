class Solution {
    public int[] getFinalState(int[] nums, int k, int mul) {
        for(int i=0;i<k;i++){
            minimum(nums,mul);
            }

    return nums;
        
    }
    private int[] minimum(int[]num,int mul){
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
                index=i;
            }
        }
        num[index]=min*mul;
        return num;
    }
}