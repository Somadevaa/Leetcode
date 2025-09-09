class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int i=0;
        while(t>i){
            num+=1;
            i++;
        }
        int x=num+t;
     return x;   
    }
}