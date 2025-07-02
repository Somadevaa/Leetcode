class Solution {
    public void sortColors(int[] nums) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            a++;
            else if(nums[i]==1)
            b++;
            else
            c++;
        }
        int id=0;
        for(int j=0;j<a;j++){
        nums[id]=0;
        id++;}
        for(int j=0;j<b;j++){
        nums[id]=1;
        id++;}
        for(int j=0;j<c;j++){
        nums[id]=2;
        id++;}

        
    }
}