class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(s==null||s.length()<1)return "";
        String result ="";
        for(int i=0;i<s.length();i++){
            String oddp=expandarouncentere(s,i,i,len);
            if(oddp.length()>result.length()){
                result=oddp;
}
            String evenp=expandarouncentere(s,i,i+1,len);
            if(evenp.length()>result.length()){
                result=evenp;
            }
        }

      return result;  
    }
    public String expandarouncentere(String s,int left,int right,int len){
        while( left>=0 && right<len && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}