class Solution {
    public List<Integer> stableMountains(int[] height, int t) {
        List<Integer> hi=new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>t){
                hi.add(i);
            }
        }
        return hi;
        
    }
}