class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1|| s.length()<numRows) return s;
        StringBuilder [] rows = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int in=0;
        int st=1;
        for(char c : s.toCharArray()){
            rows[in].append(c);
            if(in==0) st =1;
            else if(in==numRows-1) st= -1;
            in+=st;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder ss : rows){
            result.append(ss);
        }

       return result.toString();
        
    }
}