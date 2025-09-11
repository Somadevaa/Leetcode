class Solution {
    public int countDigits(int num) {
        int s=num;
        int c=0;
        while(num>0){
            int digit=num%10;
            num/=10;
            if(s%digit==0){
                c++;

            }
        }
        return c;
    }
}