class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=(word.indexOf(ch)+1);
        StringBuilder sb = new StringBuilder(word.substring(0,idx));
        sb.reverse();
        return sb.toString()+word.substring(idx);
        
        
    }
}