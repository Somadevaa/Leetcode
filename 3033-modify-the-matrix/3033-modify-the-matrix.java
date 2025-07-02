class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        
        int [] col= new int[matrix[0].length];
        
        for(int j=0;j<matrix[0].length;j++){
            int max=0;
            for(int i=0;i<matrix.length;i++){
                
                max=Math.max(max,matrix[i][j]);
            }
              col[j]=max;  
            
            
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                matrix[i][j]=col[j];
                }
            }}
            return matrix;

        
    }
}