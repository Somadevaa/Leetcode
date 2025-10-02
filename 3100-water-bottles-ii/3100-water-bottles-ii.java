class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
       int empty=numBottles;
       int total=numBottles;
       while(numExchange<=empty){
        empty-=numExchange;
        numExchange+=1;
        total+=1;
        empty+=1;
} 
    return total;
    }
}