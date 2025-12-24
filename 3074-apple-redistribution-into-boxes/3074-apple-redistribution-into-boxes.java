class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int a=sum(apple);
        Arrays.sort(capacity);
        int used=0;
        int box=0;
        for(int i=capacity.length-1;i>=0;i--){
            box+=capacity[i];
            used++;
            if(box>=a){
                return used;
            }
        }
        
        return -1;
    }
    public  int sum(int[] apple){
        int count =0;
        for(int i=0;i<apple.length;i++){
            count+=apple[i];
        }
        return count;
    }
    
}