class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] a=s.split("\\s+");
        String b="";
        for(int i=a.length-1;i>=0;i--){
            if(i!=0)
            b+=a[i]+" ";
            else
            b+=a[i];
        }
        return b;
        
    }
}