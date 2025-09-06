class Solution {
    public int[] plusOne(int[] digits) {
        int d=digits.length-1;
        if(digits[d]<9){
            digits[d]+=1;
            return digits;
        }
        for(int i=d;i>=0;i--){
            if(digits[i]==9){
            digits[i]=0;}
            else {
                digits[i]+=1;
                return digits;
            }}
            int[] result=new int[digits.length+1];
            result[0]=1;
        return result;
        
        

        
    }
}