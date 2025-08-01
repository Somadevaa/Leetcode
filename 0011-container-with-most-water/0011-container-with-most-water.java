class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxarea=0;
        while(l<r){
            int cw=r-l;
            int ch=Math.min(height[l],height[r]);
            int ca=ch*cw;
            maxarea = Math.max(maxarea,ca);
            if(height[l]<height[r])
            l++;
            else
            r--;
        }
        return maxarea;
        
    }
}