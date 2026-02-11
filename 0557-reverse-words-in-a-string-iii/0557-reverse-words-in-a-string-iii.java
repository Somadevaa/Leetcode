class Solution {
    public String reverseWords(String s) {
        String [] b=s.split(" ");
        StringBuilder a= new StringBuilder();
        for(int i=0;i<b.length;i++){
            StringBuilder c=new StringBuilder(b[i]);
            a.append(c.reverse());
            if(i<b.length-1)
            a.append(" ");
        }
        return a.toString();
        
    }
}