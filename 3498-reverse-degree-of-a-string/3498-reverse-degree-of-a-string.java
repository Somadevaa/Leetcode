class Solution {
    public int reverseDegree(String s) {
        char [] n=s.toCharArray();
        int sum=0;
        for(int i=0;i<n.length;i++){
            int rv=26-(n[i]-'a');
            sum+=rv*(i+1);


        }
        return sum;
        
    }
}