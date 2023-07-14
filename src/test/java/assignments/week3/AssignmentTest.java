package assignments.week3;

import java.sql.SQLOutput;

public class AssignmentTest {

    public static void main(String[] args) {
        AssignmentList myList = new AssignmentList();
        System.out.println(myList.isEmpty());
        myList.printNodes();

        for(int i = 1; i<=4; i++){
            AssignmentNode newNode = new AssignmentNode();
            newNode.ID = i;
            myList.addNodeToTail(newNode);
        }
        myList.printNodes();

        // These printouts show successful completion of assignment 1
        System.out.println(myList.indexOf(10));
        System.out.println(myList.indexOf(1));

        // This test shows successful completion of assignment 2
        myList.addFirst(60);
        myList.printNodes();

        // this test shows successful completion of assignment 3
        System.out.println(myList.getKItemFromTheEnd(3).ID);

        // this test shows successful completion of assignment 4
        myList.removeKItemFromTheEnd(3);
        myList.printNodes();


    }
}
