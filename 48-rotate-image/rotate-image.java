class Solution {
    public void rotate(int[][] matrix) {
        //Step 1: transpose of matrix
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                //swap matrix[i][j], matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Step 2: reverse of matrix through rows using 2 ptr approach
        for(int row=0; row<n; row++){
            int startCols = 0;
            int endCols = n-1;
            while(startCols <= endCols){
                //swap matrix[row][startCols] to matrix[row][endCols]
                int temp = matrix[row][startCols];
                matrix[row][startCols] = matrix[row][endCols];
                matrix[row][endCols] = temp;
                startCols++;
                endCols--;
            }
        }

    }
}