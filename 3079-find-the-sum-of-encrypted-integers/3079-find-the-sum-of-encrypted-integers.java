class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sim=0;
        for(int i=0;i<nums.length;i++){
            sim+=encrypt(nums[i]);
        }
        return sim;
        
    }
    public int encrypt(int a){
        int temp=0;
        int max=0;
        int count=0;
        while(a>0){
         int res=a%10;
            if(max<res)
            max=res;
            a/=10;
            count++;
            }

        for(int i=0;i<count;i++){
            temp=max+(temp*10);

        }
        return temp;

    }
}