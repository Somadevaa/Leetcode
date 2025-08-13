class Solution {
    public boolean validMountainArray(int[] arr) {
       int n= arr.length;
       if(n<=2)
         return false; 
        int x=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1])
            return false;
         if(arr[i]>arr[i+1]){
               x=i;
               break;}
         
            }
            if(x==0)
                return false;  
            for(int i=x+1;i<n-1;i++){
                if(arr[i]==arr[i+1])
                return false;
                if(arr[i]<arr[i+1])
                 return false;

            }  
            return true;  
            }
    
}