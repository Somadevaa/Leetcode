class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        int m=grid.length;
        int n=grid[0].length;
        for(int k=0;k<m*n;k++){
            int i=k/n;
            int j=k%n;
            if(grid[i][j]<0){
                count++;
            }
        }
        return count;
        
    }
}