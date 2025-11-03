class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] achar=new boolean[26];
        for(char s:allowed.toCharArray()){
            achar[s-'a']=true;
        }
        int count=0;
        for(String w:words){
            boolean con=true;
            for(char c:w.toCharArray()){
                if(!achar[c-'a']){
                    con=false;
                    break;
                }

            }
            if(con){
                count++;
            }
        }
        return count;
        
    }
}