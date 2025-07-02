class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        if(mat.length==r && mat[0].length==c){
            return mat;
        }
        int []table = new int[mat.length*mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                table[mat[0].length*i + j]=mat[i][j];
            }

        }
        int[][] result = new int[r][c];
        for(int k=0;k<table.length;k++){
            result[k/c][k%c]= table[k];
        } 
        return result;
        
    }
}