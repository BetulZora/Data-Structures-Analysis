package live_class_notes.week6TreeIntro.ReviewTrees;

public class TreeApp {


    public static void main(String[] args) {

        TreeClass tree = new TreeClass();

        System.out.println(tree.root);
        tree.insert(new TreeNode("John", "Locke", 5));
        tree.insert(new TreeNode("Carrol", "Smith", 3));
        tree.insert(new TreeNode("Fatih", "Bardak", 6));
        tree.insert(new TreeNode("Kadifa", "Friend", 4));
    }
}
