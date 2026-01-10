class Solution {
    public int findNumbers(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
          if(coun(nums[i])){
            num++;
          }
        }
        return num;
        
    }
    public boolean coun(int a){
        int count=0;
        while(a>0){
            a/=10;
            count++;

        }
        return (count%2==0)?true:false;
    }
    
}