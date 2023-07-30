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
        System.out.println("\nPostOrder");
        tree.postOrderTraversal(tree.root.rightChild);
    }
}
