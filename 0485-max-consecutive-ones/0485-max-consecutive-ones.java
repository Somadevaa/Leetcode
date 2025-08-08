class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int maxi=0,count =0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
                maxi=Math.max(maxi,count);
            }
            else if(a[i]==0){
                count=0;
                maxi=Math.max(maxi,count);
            }

        }
        return maxi;


        
    }
}