class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int l) {
        int count=0;
        for(int n:nums1){
            for(int k:nums2){
                if(n%(k*l)==0)
                count++;
            }
        }
        return count;
        
    }
}