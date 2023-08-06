package study_notes.implementingTree;

import java.util.Arrays;

public class TreeApp {

    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 5, 12, 3, 6, 11, 13, 2};
        for (int i = 0; i<numbers.length; i++){
            tree.insert(numbers[i]);
        }

        System.out.println(Arrays.toString(numbers));

        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("PreOrder");
        tree.preOrderTraversal(tree.root);
        System.out.println("\nInOrder");
        tree.inOrderTraversal(tree.root);
        System.out.println("\nLevelOrder");
        tree.levelOrderTraversal();
        System.out.println("\nPostOrder of right subtree");
        tree.postOrderTraversal(tree.root.rightChild);


        System.out.println("\n Test Contains function");
        System.out.println("Tree contains 5? " + tree.contains(5));
        System.out.println("Tree contains 0? " + tree.contains(0));

        System.out.println("\n Height Calculations");
        System.out.println("Height of a leaf: " + tree.height(tree.root.rightChild.rightChild));
        System.out.println("Height of a parent of a leaf : " + tree.height(tree.root.rightChild));
        System.out.println("Height of the root: " + tree.height(tree.root));



    }
}
