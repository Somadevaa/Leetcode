class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m-1,q=n-1,s=m+n-1;
        while(q>=0){
            if(p>=0 && nums1[p]>nums2[q]){
            nums1[s--]=nums1[p--];}
            else{
            nums1[s--]=nums2[q--];}

        }
    }
}