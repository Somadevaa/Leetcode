class Solution {
    public void duplicateZeros(int[] arr) {
        int j=0;
        int [] res = new int[arr.length];
        for(int i=0;i<arr.length&& j<arr.length;i++){
            res[j]=arr[i];
            if(arr[i]==0&&j+1<arr.length){
               j++;
               res[j]=0;}
            j++;
            }
            for(int k=0;k<arr.length;k++){
                arr[k]=res[k];
            }
        
        return;
    }
}