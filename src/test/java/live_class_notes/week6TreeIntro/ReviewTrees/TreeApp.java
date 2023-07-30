package live_class_notes.week6TreeIntro.ReviewTrees;

public class TreeApp {


    public static void main(String[] args) {

        TreeClass studentTree = new TreeClass();

        System.out.println(studentTree.root);
        studentTree.insert(new TreeNode("John", "Locke", 5));
        studentTree.insert(new TreeNode("Carrol", "Smith", 3));
        studentTree.insert(new TreeNode("Fatih", "Bardak", 6));
        studentTree.insert(new TreeNode("Kadifa", "Friend", 4));

        studentTree.preOrderTraversal(studentTree.root);
        System.out.println("--------------------------------------");
        studentTree.inOrderTraversal(studentTree.root);
        System.out.println("--------------------------------------");
        studentTree.levelOrderTraversal();
    }
}
