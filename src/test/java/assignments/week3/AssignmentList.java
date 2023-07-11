package assignments.week3;

public class AssignmentList {

    AssignmentNode current;
    AssignmentNode head;
    AssignmentNode tail;
    AssignmentNode prev;

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
            } else {
                this.tail.next = newNode;
                this.tail = newNode;
            }
        }
    }

    public void addNodeToHead(AssignmentNode newNode){
        if(findNodeByID(newNode.ID)!=null){
            System.out.println("A node with this ID already exists. Repeated ID values are not allowed");

        }else {
            newNode.next = head;
            head = newNode;
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

    /**
     * This is for Assignment1: Find the indexOf an elemet and returnIt
     * @param desiredNode
     * @return
     */
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








}
