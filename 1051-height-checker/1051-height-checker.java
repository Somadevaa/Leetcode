class Solution {
    public int heightChecker(int[] heights) {
        int[] exe = Arrays.copyOf(heights, heights.length);
        int count=0;
        Arrays.sort(exe);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=exe[i])
            count++;
        }
        return count;
        
    }
}