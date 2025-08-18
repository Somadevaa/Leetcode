class Solution {
    public boolean isPalindrome(String s1) {
        s1=s1.toLowerCase();
        char [] c=s1.toCharArray();
        int s=0,e=c.length-1;
        while(s<e){
            if(!Character.isLetterOrDigit(c[s])){
                s++;

            }
            else if(!Character.isLetterOrDigit(c[e]))
            e--;
            else if(c[s]==c[e])
            {
                s++;
                e--;
            }
            else
             return false;
        }
        return true;
        
    }
}