class Solution {
    public int countOdds(int l, int h) {
        int count=0;
       count=(h-l)/2;
       if(l%2!=0||h%2!=0){
        count++;
       }
        return count;
        
    }
}