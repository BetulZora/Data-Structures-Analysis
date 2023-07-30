package study_notes.implementingTree;

public class MyTree {
    TNode root;

    public MyTree() {
    }

    void insert (int value){
        TNode newNode = new TNode(value);

        if(root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true){
            // choose left but can do the reverse if we so wish


            // case 1: value is less than currents value
            // branch left. If no left, create new Tnode, otherwise shift current to left
            if (value <= current.value){
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            }
            else{ // case 2: value is greater than currents value
                if( current.rightChild==null){
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }

            // case 3: value is equal to currents value

        }
    }

}
