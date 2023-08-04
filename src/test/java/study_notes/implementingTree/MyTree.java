package study_notes.implementingTree;

import java.util.LinkedList;
import java.util.Queue;

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
                // case 3: value is equal to currents value
                // notice that if value == current.value our algorithm puts it on the left
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


        }
    }

    // PreOrder Traversal of the tree
    // Root-Left-Right
    void preOrderTraversal(TNode root){
        if(root==null) return;// termination, base condition
        System.out.print(root.value +", "); // visit root
        // this is a recursive algorithm that calls itself
        preOrderTraversal(root.leftChild);  // visit left subtree
        preOrderTraversal(root.rightChild); // visit right subtree
    }

    // InOrder Traversal of the tree
    // Left-Root-Right
    void inOrderTraversal(TNode root){
        if (root==null) return; // termination, base condition
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }

    // PostOrder Traversal of the tree
    // Left-Right-Root
    void postOrderTraversal(TNode root){
        if (root==null) return;// termination
        postOrderTraversal(root.leftChild); // branch and finish left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.print(root.value+", ");  // visit root
    }
    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TNode toVisit=queue.poll(); // poll is like dequeue
            System.out.print(toVisit.value+", ");
            if (toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }
    }
    public boolean isLeaf(TNode node) {
        return node.leftChild==null && node.rightChild==null;
    }
    public void printLeaves(TNode root){
        if (root==null) return;
        // perform visit on Root

        // Recursively Branch Left Subtree
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
        if (isLeaf(root)) System.out.print(root.value + ", ");

        // Recursively Branch Right Subtree
    }
    int countLeaves(TNode root){
        if (root==null) return 0;
        if (isLeaf(root)) return 1;
        // recursively traverse left
        // recursively traverse right
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }
    int findSumOfLeaves(TNode root){
        if (root==null) return 0;
        if (isLeaf(root)) return root.value;
        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);
    }
    int height(TNode root){
        if (root==null) return -1;
        // so if using this method and get -1, know that it is an empty tree.
        if (isLeaf(root)) return 0; // this is the base condition of the recursive function
        return 1+ Math.max(height(root.leftChild), height(root.rightChild)); // recursively calculate height of each subtree and return the max.
    }
    public int calculateNodeDepthSums(){
        return nodeDepthSums(root, 0);
    }
    // Assignment  Sum of Node Depths
    public int nodeDepthSums(TNode node, int A){
        if(node==null) return 0;
        System.out.println(A);
        return A+nodeDepthSums(node.leftChild, A+1) +nodeDepthSums(node.rightChild, A+1);
    }
    // Assignment  Sum of All Nodes recursively
    public int calculateNodeSums(){
        return nodeSums(root);
    }

    public int nodeSums(TNode node){
        if(node==null) return 0;

        return node.value+ nodeSums(node.leftChild)+nodeSums(node.rightChild);
    }
    // Sum of all Nodes

    /**
     * Task1: Implement finding an integer value in a BST
     *
     * boolean contains(int value){}
     */
    boolean contains(int value){

        // problem specifies a BST
        TNode current = root;

        if (current == null) {return false;}

        while (current!=null){

            if(current.value == value){ return true;}

            if(current.value <= value){
                current = current.rightChild;
                continue;
            }
            if(current.value >= value){
                current = current.leftChild;
            }
        }

        return false;


    }

    /**
     * Task2: Implement a method that returns true if the node is a leaf in BST
     *
     * see method:
     * isLeaf(TNode node)
     * Above
     *
     */

    /**
     * Task3: Implement a method that prints leaves of a BST
     * see method:
     * printLeaves(TNode root)
     * Above
     */
    /**
     * Task4: Implement a method that counts leaves of a BST.
     * see method:
     * countLeaves
     * Above
     */
    /**
     * Task5: Implement a method that returns sum of leaf values of a BST.
     * see method:
     * findSumOfLeaves
     * Above
     */
    /**
     * Task6: Implement a method that returns the height of a node in a BST.
     * see method:
     * height(TNode root)
     * Above
     */


}
