class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return solve(word1).equals(solve(word2));

       

        
    }
    public static String solve(String[] arr){
         StringBuilder sb = new StringBuilder();
        for(String a:arr){
            sb.append(a);
        }
        return sb.toString();
    }
}