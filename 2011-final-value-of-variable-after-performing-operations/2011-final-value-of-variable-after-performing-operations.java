class Solution {
    public int finalValueAfterOperations(String[] o) {
        int x=0;
        for(int i=0;i<o.length;i++){
            if(o[i].equals("X++")||o[i].equals("++X"))
            x+=1;
            else
            x-=1;
        }
        return x;
        
    }
}