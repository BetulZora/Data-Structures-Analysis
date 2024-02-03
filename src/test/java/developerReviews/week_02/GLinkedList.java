package developerReviews.week_02;

public class GLinkedList<T> {
    SNode<T> head;
    SNode<T> tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }

    void addFirst(T t){
        // create a new node using t
        SNode<T> node = new SNode<>(t);
        // check if it is an empty list first
        if(isEmpty()){
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        // increase the size
        size++;
    }

    T removeFirst(){
        // check if empty
        if(isEmpty()) return null;

        // create a temporary variable
        T result = null;
        // check if there is only one element
        if(head==tail){
            result = head.value;
            head = tail = null;
        }else {
            result = head.value;
            head = head.next;
        }
        //decrease the size
        size--;
        return result;
    }

    void printNodes(){
        SNode<T> current=head;
        while(current!=null){
            System.out.println(current.value);
            current = current.next;
        }
    }


}