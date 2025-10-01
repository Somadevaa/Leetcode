class Solution {
    public int numWaterBottles(int Bottles, int Exchange) {
        int result=Bottles;
        while(Bottles>=Exchange){
            int num=Bottles % Exchange;
            int newc=(int)Bottles/Exchange;
            result+=newc;
            Bottles=num+newc;

            
        }
        return result;
        
    }
}