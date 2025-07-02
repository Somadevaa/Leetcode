class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
           sum+=mat[i][i];
            }
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][mat.length-i-1];
        }
        int s =mat.length-1;
        if(s%2==0){
            sum-=mat[s/2][s/2];
        }

          return sum;
        }
        
    }
