class Solution {
    public String truncateSentence(String s, int k) {
        String output="";
        String [] arr=s.split(" ");
        for(int i=0;i<k;i++){
            if(i==0)
            output+=arr[i];
            else
            output=output+" "+arr[i];

        }
        return output;
    }
}