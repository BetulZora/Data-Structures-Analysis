package assignments.week5;

import java.util.Arrays;
import java.util.Stack;

public class QueueAssignment {

    // Given integer K and a queue of integers, write code to reverse the order of the first K elements of the queue
    // input : Q = [10, 20, 30, 40, 50], K = 4
    // output : Q = [40, 30, 20, 10, 50]
    // hint : use stack to reverse the order of first K elements

    static int[] reverseFirstK(int[] Q, int K){

        Stack<Integer> firstK = new Stack<>();
        for ( int i=1; i<= K; i++){
            firstK.push(Q[i-1]);
        }

        for (int i = 0; i<K; i++){
            Q[i]= firstK.pop();
        }

        return Q;

        /*
        This can be accomplished by using Queue instead. Deque the first K elements into a stack.
        Then enqueue the first K elements by popping from the stack.
        Deque the rest of the elements and enque them again.
         */
    }

    public static void main(String[] args) {

        int[] Q ={10, 20, 30, 40, 50};
        int K = 4;

        System.out.println(Arrays.toString(reverseFirstK(Q,K)));


    }
}
