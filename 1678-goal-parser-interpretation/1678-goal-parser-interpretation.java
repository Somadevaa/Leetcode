class Solution {
    public String interpret(String c) {
        char[] arr=c.toCharArray();
        String str="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('&&arr[i+1]==')')
            str+="o";
            else if(arr[i]=='('&&arr[i+1]=='a')
            str+="al";
            else if(arr[i]=='G')
            str+="G";
        }
        return str;
        
    }
}