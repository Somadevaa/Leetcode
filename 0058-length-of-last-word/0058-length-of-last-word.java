class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim(); // Remove trailing spaces
        int k=0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            
            if (s.charAt(i) == ' ') {
                break; 
            }
            length++;
        }
        
        return length;
    }
}
