class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        int count=0;
        int let=0;
        int rit=0;
        for(int i: nums)total+=i;
        for(int i=0;i<nums.length-1;i++){
             rit+=nums[i];
            let=total-rit;
            if((let-rit)%2==0)
            count++;

        }
        return count;
        
    }
}