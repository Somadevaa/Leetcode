class Solution {
    public int totalMoney(int n) {
        int total=0;
        int weeks=n/7;
        int days=n%7;
        for(int i=0;i<weeks;i++){
            int start=i+1;
            for(int j=0;j<7;j++){
                total=total+start+j;
            }
        }
        int start=weeks+1;
        for(int i=0;i<days;i++){
            total=total+start+i;
            
        }
        return total;
        

        
    }
}