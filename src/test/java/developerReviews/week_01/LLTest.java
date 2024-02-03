package developerReviews.week_01;

public class LLTest {

    public static void main(String[] args) {

        LLNode node1 = new LLNode(1);
        LLNode node2 = new LLNode(2);
        LLNode node3 = new LLNode(3);
        LLNode node4 = new LLNode(4);
        LLNode node5 = new LLNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        LLNode current = node1;

        while (current!=null){
            System.out.println(current.id);
            current = current.next;
        }




    }

}
