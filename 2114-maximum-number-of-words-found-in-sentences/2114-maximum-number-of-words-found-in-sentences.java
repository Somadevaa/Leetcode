class Solution {
    public int mostWordsFound(String[] sentences) {
         int count =0;
        for(String i:sentences){
            String[] words=i.split(" ");
            if(count<words.length){
                count=words.length;
            }
        }
      return count;  
    }
}