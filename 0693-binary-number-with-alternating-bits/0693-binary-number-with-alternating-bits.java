class Solution {
    public boolean hasAlternatingBits(int n) {
        String a=Integer.toBinaryString(n);
        char [] b=a.toCharArray();
        boolean flag =true;
        for(int i=0;i<a.length()-1;i++){
            if(b[i]=='1'&&b[i+1]=='1'|| b[i]=='0'&& b[i+1]=='0'){
                flag=false;
                break;

            }

        }
        return flag;
        
    }
}