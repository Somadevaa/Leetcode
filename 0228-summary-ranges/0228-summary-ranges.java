class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> a= new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int start =i;
            while(i+1<nums.length&&nums[i+1]==nums[i]+1){
                i++;
            }
            if(start==i){
                a.add(String.valueOf(nums[i]));
            
            }
            else{
                a.add(nums[start]+"->"+nums[i]);

            }
            i++;
        }
        return a;
        
        
    }
}