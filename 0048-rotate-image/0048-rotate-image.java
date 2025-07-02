class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }}
             int m=matrix[0].length;
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<m/2;j++){
                    int temp=0;
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[i][m-j-1];
                    matrix[i][m-j-1]= temp;
                }
            }
           
        
        
    }
}