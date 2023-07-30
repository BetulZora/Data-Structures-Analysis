package live_class_notes.week6TreeIntro.ReviewTrees;

public class TreeClass {

    TreeNode root;

    public TreeClass() {

        // by default, values are null
        this.root = null;
        // begin with an empty tree where root is null. The nodes will be added later.
    }

    /**
     * Insert a new node to my tree
     */

    public void insert (TreeNode newNode){
        // case 1: Tree is empty ==> root will be newNode

        if(root == null) {
            root = newNode;
            return; // need to break out if this happens
        }

        // case 2: Tree is not empty and we need to iterate it
        TreeNode current = root;
        while (true){
            if(newNode.ID<= current.ID){ // if we need to go left
                if (current.leftChild==null){ // if null insert it
                    current.leftChild = newNode;
                    break; // because mission accomplished and prevent the rest of code.
                } // if not null, move to next node
                current = current.leftChild;
            }else{ // if we need to go right
                // current.ID is greater than current.ID
                if (current.rightChild==null){ // if null insert it
                    current.rightChild = newNode;
                    break; // because mission accomplished and prevent the rest of code.
                } // if not null, move to next node
                current = current.rightChild;
            }

        }


    }
}
