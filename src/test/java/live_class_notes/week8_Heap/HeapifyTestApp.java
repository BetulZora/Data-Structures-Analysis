package live_class_notes.week8_Heap;


public class HeapifyTestApp {
    public static void main(String[] args) {

        // {1, 2, 5, 6, 8, 21, 0}
        // 1, 2, 5, 6, 8, 21, 0, -1, -20, 87
        int[] numbers={1,2,5,6,8,21,0, -1, -20 , 87};
        MyHeap heap=new MyHeap(numbers);
        heap.printHeap();

    }

}