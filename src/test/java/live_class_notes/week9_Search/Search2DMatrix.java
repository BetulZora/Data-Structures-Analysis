package live_class_notes.week9_Search;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 7));

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
        // perform the search with complexity log(m*n)

        // divide index by columns, the int return is row, the remainder is columns of that element

        /**
         * TODO:
         * Do this by myself after class. need to modify the other search algorithm to accommodate single array approach
         * Get it from Review8_Search
         */

        return false;
    }

}
