class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
           if(sum(i)%2==0)
           count++;
        }
        return count;
        
    }
    public int sum(int n){
        int sum=0;
        int digit =0;
        while(n>0){
           digit= n%10;
           n/=10;
           sum+=digit;
        }
        return sum;
    }
}