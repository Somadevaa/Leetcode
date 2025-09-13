class Solution {
    public int maxFreqSum(String s) {
        int []arr=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'a']++;
        }
        int[] vow={0,4,8,14,20};
        int maxvow=0;
        for(int i:vow){
            maxvow=Math.max(arr[i],maxvow);
 }
 int[]con={1,2,3,5,6,7,9,10,11,12,13,15,16,17,18,19,21,22,23,24,25};
 int maxcon=0;
 for(int j:con){
    maxcon=Math.max(arr[j],maxcon);
 }
       
     return maxvow+maxcon;   
    }
}