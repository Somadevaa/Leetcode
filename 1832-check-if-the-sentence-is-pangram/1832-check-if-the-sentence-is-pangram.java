class Solution {
    public boolean checkIfPangram(String s) {
        char [] arr=s.toCharArray();
        boolean[] res=new boolean[26];
        for(int i=0;i<s.length();i++){
            if(arr[i]!=' '){
                res[arr[i]-97]=true;
            }
        }
        for(int i=0;i<res.length;i++){
            if(res[i]==false)
            return false;
        }
        return true;

        
    }
}