package assignments.week3;

import java.sql.SQLOutput;

public class AssignmentTest {

    public static void main(String[] args) {
        AssignmentList myList = new AssignmentList();
        System.out.println(myList.isEmpty());
        myList.printNodes();

        for(int i = 0; i<10; i++){
            AssignmentNode newNode = new AssignmentNode();
            newNode.ID = i;
            myList.addNodeToTail(newNode);
        }
        myList.printNodes();

        System.out.println(myList.indexOf(10));


    }
}
