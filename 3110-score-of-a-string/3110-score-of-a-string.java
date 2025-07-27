class Solution {
    public int scoreOfString(String s) {
        int sc=0;
        for(int i=0;i<s.length()-1;i++){
            int data=Math.abs(s.charAt(i)-s.charAt(i+1));
            sc+=data;
        }
        return sc;
        
    }
}