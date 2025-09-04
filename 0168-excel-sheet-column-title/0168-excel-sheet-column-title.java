class Solution {
    public String convertToTitle(int cn) {
        
        String b="";
        while(cn>0){
            cn=cn-1;
            int div=cn%26;
            char a=(char)('A'+div);
            cn/=26;
            b=a+b;

        }
        return b;
        
    }
}