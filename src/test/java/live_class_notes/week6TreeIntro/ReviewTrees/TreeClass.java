package live_class_notes.week6TreeIntro.ReviewTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    void preOrderTraversal(TreeNode root){
        /**
         * traverse in PreOrder Style
         * visit Root, then left, then right
         */
        // need base condition due to recursion
        if (root == null) return;
        // visit root node or perform operation at node
        System.out.println(root.name);

        // recursively visit left subtree
        preOrderTraversal(root.leftChild);
        // recursively visit right subtree
        preOrderTraversal(root.rightChild);
    }

    void inOrderTraversal(TreeNode root){
        if(root == null) return; // base case
        inOrderTraversal(root.leftChild);
        System.out.println(root.name);
        inOrderTraversal(root.rightChild);
    }

    void postOrderTraversal(TreeNode root){

        /**
         * Post Order: Left, right, root
         */
        if(root==null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.name);
    }

    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TreeNode> cue = new LinkedList<>();
        cue.add(root);
        while(!cue.isEmpty()){
            TreeNode toVisit = cue.poll();
            System.out.println((toVisit.name));
            if(toVisit.leftChild!=null) cue.add(toVisit.leftChild);
            if(toVisit.rightChild!=null) cue.add(toVisit.rightChild);
        }
    }
    void preOrderTraversalIterative(TreeNode root) {
        // check if root is null
        if (root == null) return;
        // create a stack
        Stack<TreeNode> stack = new Stack<>(); // using framework stack
        // push the root to the stack
        stack.push(root);
        // while loop until stack is empty

        while (!stack.isEmpty()) {
            // pop Stack
            TreeNode poppedNode = stack.pop();
            // perform visit on popped node
            System.out.print(poppedNode.name + " , ");
            // push its children in Right child then Left Child order
            if(poppedNode.rightChild!=null)stack.push(poppedNode.rightChild);
            if(poppedNode.leftChild!=null) stack.push(poppedNode.leftChild); // will be visiting left next so it must be the last to be added


        }
    }
}
