package live_class_notes.week9_Search;

public class SearchProblem {
    public static void main(String[] args) {

    }
    public int search(int[] array, int data) {
        /** This is a BINARY APPROACH. Repeat with ternary search
         *
         */

        int left = 0;
        int right = array.length-1;
        while(left<=right){

            int mid = (left+right)/2; // value will be calculated by integer so it will be ok
            if (array[mid]==data) return mid; // found the data, returning index of result
            else if (data<array[mid]) right = mid-1; // if less than continue to the left
            else left = mid+1; // if data os more than means continue right

            // Binary Search should only be applied to SORTED ARRAYS



        }
        return -1;
    }

}