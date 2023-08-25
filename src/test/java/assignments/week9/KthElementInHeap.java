package assignments.week9;

public class KthElementInHeap {

    public static void main(String[] args) {

        // Given these two Arrays
        int[] nums1 = new int[]{3,2,1,5,6,4};
        int[] nums2 = new int[]{3,2,3,1,2,4,5,5,6};
        // And given the two K's
        int k1 = 2, k2 = 4;
/**TODO: I need to fix this stuff after class
        // write an algorithm that will take the arrays and return the kth largest element.

        // my strategy: I need to form a max heap as in MyHeap (heapify) and then loop K times removing the root K times

        int[] myFocusArr = nums1;
        int myFocusK = k1;
        MyHeap myHeap = new MyHeap(myFocusArr);

        int[] results = new int[myFocusK];
        for ( int i = 0; i < myFocusK; i++){
            results[i] = myHeap.remove();
        }
        System.out.println("My the Kth largest value is: "+results[myFocusK-1]);

        System.out.println("Fatih's solution is: " + getKthLargest(nums1, 2));


*/


    }

    /**This is Fatih's solution
     */

    public static int getKthLargest(int[] array, int k){

        // create a heap
        MyHeap heap = new MyHeap(array.length);
        for (int i=0; i<array.length; i++){
            heap.insert(array[i]);
        }
        for (int i=0; i<k-1; i++){
            heap.remove();
        }
        return heap.peek();

    }

/** TODO: check my heapify, I think I might have changed my regular heap implementation after heapify
 *
 */



}
