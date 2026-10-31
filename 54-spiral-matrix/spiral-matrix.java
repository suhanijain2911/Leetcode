class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int m = matrix.length; 
        int n = matrix[0].length;

        int startingRow = 0;
        int endingRow = m-1;
        int startingCol = 0;
        int endingCol = n-1;

        while(startingRow<=endingRow && startingCol<=endingCol){
            //row wise left to right -> print startingRow , from startingCol to endingCol
            for(int col=startingCol; col<=endingCol; col++){
                result.add(matrix[startingRow][col]);
            }
            startingRow++;
        

            //column wise top to bottom -> print endingCol , from startingRow to endingRow
            for(int row = startingRow; row<=endingRow; row++){
               result.add(matrix[row][endingCol]);
            }
            endingCol--;

            //row wise right to left -> print endingRow , from endingCol to startingRow
            //valid endingRow -> startingRow <= endingRow
            if(startingRow <= endingRow && startingCol<=endingCol){
                for(int col = endingCol; col>=startingCol; col--){
                   result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            //column wise bottom to top -> print startingCol , from endingRow to startingRow
            //valid startingCol -> startingRow <= endingRow
            if(startingRow <= endingRow && startingCol<=endingCol){
                for(int row = endingRow; row>=startingRow; row--){ //we move from bigger index to smaller index = row--
                   result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }
        return result;

    }
}