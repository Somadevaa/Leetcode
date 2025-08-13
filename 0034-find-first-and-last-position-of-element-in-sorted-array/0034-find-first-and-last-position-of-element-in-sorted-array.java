class Solution {
    public int[] searchRange(int[] n, int target) {
        
        int min=0;
        int max=n.length-1;
        while(min<=max){
            if(n[min]==target&&n[max]==target){
                
                return new int []{min,max};}
           
            if(n[min]!= target)
               min++;
            if(n[max]!=target)
                max--;
             
            
                
                   
        }          
     return new int[]{-1,-1};          
 
       
    }
}