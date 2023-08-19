package live_class_notes.week9_Search;

public class SearchPractice {

    // given a sorted array and a target, find index of target, or -1
    public static int mysearch(int[] array, int data){

        // initialize left and right
        int left = 0;
        int right = array.length-1;
        // left<= right by design, while loop it
        while (left<=right) {

            // calculate midindex
            int mid = (left+right)/2;
            // compare midindex value. If match, return index mid
            if(data == array[mid]) return mid;
            // if midindex is too big, set right to mid-1 and move on
            else if (data<= array[mid]) right = mid-1;
            // else set left to mid+1 and move one
            else left = mid+1;
        }
        return -1; // return -1 if we didn't find it

    }

    public static void main(String[] args) {

        int[] numbers = {-1,0,2,4,5,6,7,8};
        int result = mysearch(numbers, 9);
        System.out.println("result = " + result);


    }



}
