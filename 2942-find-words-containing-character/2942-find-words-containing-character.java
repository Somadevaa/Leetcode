class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
            List<Integer> re = new ArrayList<>();
            for(int i=0;i<words.length;i++){
                if(words[i].indexOf(x)!=-1)
                re.add(i);
            }
            return re;
    }
}