class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int c1=i*i+j*j;
                int c=(int)Math.sqrt(c1);
                if(c<=n && c*c==c1 ){
                    count++;
                }
            }

        }
        return count;

        
    }
}