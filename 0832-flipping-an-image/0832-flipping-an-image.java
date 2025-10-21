class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int s=image.length,k=image[0].length;
        int [][] op=new int[s][k];
        for( int i=0;i<s;i++){
            for(int j=0;j<k;j++){
                op[i][k-1-j]=image[i][j];

            }
        }
        return inverse(op);

        
    }private int[][] inverse(int[][] op) {
    for (int i = 0; i < op.length; i++) {
        for (int j = 0; j < op[i].length; j++) {
            if (op[i][j] == 0) {
                op[i][j] = 1;
            } else {
                op[i][j] = 0;
            }
        }
    }
    return op;
}
   
    }
