package live_class_notes.week9_Search;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrixLogNM(matrix, 7));
        /**
         * TODO: value supposed to give true, is giving false.
         * Review after class
         */
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        // performs O(m+logn)

        // number of rows and cols
        int numberOfCol = matrix[0].length;
        int numberOfRows = matrix.length;
        // calculate right block
        int currentRow=0;
        while(currentRow<numberOfRows-1){
            // if last element of row is less than, have to move to next block
            if(target > matrix[currentRow][numberOfCol-1]) currentRow++;
            else break;
        }

        // make a binary search in the block
        int right= numberOfCol-1;
        int left = 0;
        while(left<=right){

            int mid = (left+right)/2;
            if(target == matrix[currentRow][mid]) return true;
            else if(target < matrix[currentRow][mid]) right = mid-1;
            else left = mid+1;
        }
        return false;
    }
    public static boolean searchMatrixLogNM(int[][] matrix, int target) {
        return false;
    }

}
