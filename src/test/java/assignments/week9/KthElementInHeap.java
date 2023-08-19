package assignments.week9;

import study_notes.MyHeap;

public class KthElementInHeap {

    public static void main(String[] args) {

        // Given these two Arrays
        int[] nums1 = new int[]{3,2,1,5,6,4};
        int[] nums2 = new int[]{3,2,3,1,2,4,5,5,6};
        // And given the two K's
        int k1 = 2, k2 = 4;

        // write an algorithm that will take the arrays and return the kth largest element.

        // my strategy: I need to form a max heap as in MyHeap and then loop K times removing the root K times

        int[] myFocusArr = nums2;
        int myFocusK = k2;
        MyHeap myHeap = new MyHeap(myFocusArr);

        int[] results = new int[myFocusK];
        for ( int i = 0; i < myFocusK; i++){
            results[i] = myHeap.remove();
        }
        System.out.println("My the Kth largest value is: "+results[myFocusK-1]);





    }
}
