class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jset=new HashSet<>();
        for(char n :jewels.toCharArray()){
            jset.add(n);
        }
        int c=0;
        for(char m :stones.toCharArray()){
        if(jset.contains(m))
        c++;

        }
     return c;
}}