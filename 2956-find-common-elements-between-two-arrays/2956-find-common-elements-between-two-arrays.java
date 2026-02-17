class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int [] result=new int[2];
        check(nums1,nums2,result,0);
        check(nums2,nums1,result,1);
        return result;


        

        
    }
    public void check(int []num1, int []num2,int []result ,int k){
        int count=0;
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                 count++;
                 break;}
            }
        }
        result[k]=count;
    

    }
}