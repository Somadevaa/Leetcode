class Solution {
    public int maxFrequencyElements(int[] nums) {
      Map<Integer,Integer> ele = new HashMap<>();
      int max=0;
       int tot=0;
       for(int i:nums){
        int fre=ele.getOrDefault(i,0)+1;
        ele.put(i,fre);
        if(fre>max){
            max=fre;
            tot=fre;}
        else if(fre==max){
            tot+=fre;
        }
        
       }  

      return tot ;  
    }
}