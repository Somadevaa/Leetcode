class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int [] pre = new int[l];
        int [] suf = new int[l];
        int [] res = new int[l];
        pre[0] =1;
        suf[l-1]=1;
        for(int i=1;i<l;i++){
            pre[i]=pre[i-1]*nums[i-1];
}
          for(int i=l-2;i>=0;i--){
            suf[i]=suf[i+1]*nums[i+1];
          }
          for(int i=0;i<l;i++){
            res[i]=pre[i]*suf[i];
          }

     return res;   
    }
}