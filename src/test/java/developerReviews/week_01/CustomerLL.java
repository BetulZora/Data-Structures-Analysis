package developerReviews.week_01;

public class CustomerLL {
    CNode head;
    CNode tail;
    int size;
    public boolean isEmpty(){
        return head == null;
    }
    void insertLast(CNode customer) {
        // case 1: list is empty
        if (isEmpty()) {
            head = tail = customer;

        } else {
            // case 2: list has element or elements
            tail.next=customer;
            tail = customer;
        }
        size++;
    }
    void printNames(){
        CNode current = head;
        while ( current != null){
            String name = "";
            if(current == head) name += "Head ";
            if(current == tail) name+= "Tail ";
            name += current.name + " "+ current.lastName;
            System.out.println(name);
            if(current.next==null) System.out.println("Null");
            current = current.next;
        }
    }
    void deleteByName(String name){
        CNode prev = head;
        CNode current = head;
        while(current != null){
            if (current.name.equals(name)) {

                if(current == head){// case 1 delete head
                    // case 1a head is also the tail
                    if(head==tail){
                        tail = head = null;
                    }else{ // case 1b head isn't tail
                        head = current.next;
                        current.next = null; // this line is not strictly required but helps garbage collector
                    }
                }else if ( current == tail) {// case 2 delete tail
                    prev.next = null;
                    tail = prev;
                } else {// case 3 delete in the middle
                    prev.next = current.next;
                    current.next = null;
                }
                size --;
            }

            // if did not succeed in finding the node, have to move to the next one
            prev= current;
            current = current.next;

        }
    }

}
