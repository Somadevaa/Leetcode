class Solution {
    public int maxProfit(int[] nums) {
        int profit =0,maximum=0,n=nums.length,cp=nums[0];
        for(int i=1;i<n;i++){
            int sp=nums[i];
            profit=(sp-cp);
            maximum =Math.max(profit,maximum);
            if(sp<cp)
            cp=sp;

        }
        return maximum;

        
        
    }
}