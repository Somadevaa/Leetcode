class Solution {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";}
        int a=num1.length();
        int b=num2.length();
        int [] arr = new int[a+b];
        for(int i=a-1;i>=0;i--){
            int d1= num1.charAt(i)-'0';
            for(int j=b-1;j>=0;j--){
            int d2 =num2.charAt(j)-'0';
            
            arr[i+j+1]+=d1*d2;

            
        }    }
        for(int i=arr.length-1;i>0;i--){
            arr[i-1]+=arr[i]/10;
            arr[i]%=10;
        }
       
        StringBuilder sb = new StringBuilder();
         int i=arr[0]==0?1:0;
        for(;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();

}}