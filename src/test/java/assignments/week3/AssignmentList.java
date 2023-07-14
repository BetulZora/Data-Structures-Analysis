package assignments.week3;

public class AssignmentList {

    AssignmentNode current;
    AssignmentNode head;
    AssignmentNode tail;
    AssignmentNode prev;
    int size = 0;

    public boolean isEmpty(){
        if(head==tail) return true;
        return false;
    }
    public void addNodeToTail(AssignmentNode newNode){
        if (findNodeByID(newNode.ID)!= null){
            System.out.println("A node with this ID already exists. Repeated ID values are not allowed");

        }else {
            if (head == null) {
                this.head = newNode;
                this.tail = newNode;
                size++;
            } else {
                this.tail.next = newNode;
                this.tail = newNode;
                size++;
            }
        }
    }

    public void addNodeToHead(AssignmentNode newNode){
        if(findNodeByID(newNode.ID)!=null){
            System.out.println("A node with this ID already exists. Repeated ID values are not allowed");

        }else {
            if(isEmpty()){
                //case 1: if list is empty
                head = newNode;
            }else {
                //case 2: list is not empty
                newNode.next = head;
                head = newNode;
            }
            size++;
        }
    }
    public void addAfterNode(AssignmentNode theNode, AssignmentNode newNode) {
        if (findNodeByID(newNode.ID) != null) {
            System.out.println("A node with this ID already exists. Repeated ID values are not allowed");

        } else {
            current = head;
            while(current!=null) {
                if (current.ID == theNode.ID) {
                    newNode.next= current.next;
                    current.next= newNode;
                    size++;
                    break;

                }
                current = current.next;
            }

        }
    }

    public void removeNodeByID(int nodeIDTODelete){
        current = prev = head;
        while (current!=null) {
            if (current.ID == nodeIDTODelete) {
                prev.next = current.next;
                current.next = null;
                size--;
            }
            prev = current;
            current = current.next;
        }
    }
    public AssignmentNode findNodeByID(int ID){
        if(isEmpty()) System.out.println("This list is empty ****************** Add elements");
        current = head;
        while(current != null) {
            if (current.ID == ID) {
                return current;
            }
            current = current.next;
        }
        System.out.println("Node with ID: "+ ID + " is not in the list");
        return null;
    }

    public int indexOf(AssignmentNode desiredNode){
        if(isEmpty()) return -1;
        int index = 0;
        current = head;
        while(current!=null){
            if(current == desiredNode){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
    public int indexOf(int desiredID){
        // assignment1 write an indexOf method that uses an int param as ID to find an index and return index.
        if(isEmpty()) return -1;
        int index = 0;
        current = head;
        while(current!=null){
            if(current.ID == desiredID){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
    public void printNodes(){
        current = head;
        while(current!=null){
            System.out.print(current.ID+ " / ");
            current = current.next;
        }
        System.out.println("");
    }

    public void addFirst(int value){
        //Assignment 2: make an addFirst method with int param
        AssignmentNode newNode = new AssignmentNode();
        newNode.ID = value;
        addNodeToHead(newNode);
        // size is increased in addNodeToHeadMethod
    }

    public AssignmentNode getKItemFromTheEnd(int K) {
        // Assignment 3 get the Kth Item from the end
        AssignmentNode node1 = head;
        AssignmentNode node2 = head;

        for (int i = 0; i < K; i++) {
            node1 = node1.next;
        }

        while(node1!=null){
            node1 = node1.next;
            node2 = node2.next;
        }

        return node2;
    }

    public void removeKItemFromTheEnd(int K){
        // assignment 4 get the Kth Item from the end and delete it
        AssignmentNode node1 = head;
        AssignmentNode node2 = head;

        for (int i = 0; i < K; i++) {
            node1 = node1.next;
        }
        AssignmentNode previous = node2;
        while(node1!=null){
            node1 = node1.next;
            previous = node2;
            node2 = node2.next;
        }
        if (node2==head) head = node2.next;

        previous.next = node2.next;
        node2.next = null;
        size--;


    }


}
