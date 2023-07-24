package live_class_notes.review5.leetcode706;

public class StrategyNotes {

    // need good Hash function design
    // need a strategy to handle collisions

    /* For Hash Function:
    We will use a modulus function on a int K
    Will prefer a prime number to minimize potential collisions
    ex. number like 2341
    there will be 0 to 2340 address slots

     */

    /*
    We will use an ArrayList to store the data. Every element is a LinkedList storing K/V pairs
    Use Linkedlist to resolve collisions and do chaining

    ArrayList of LinkedList of Maps

    Let's call each element in ArrayList a bucket
     */



}
