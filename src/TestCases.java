import java.util.List;

public class TestCases {
    
    public static void main(String[] args) {
        QueueBasedBFS bfs = new QueueBasedBFS();

        // Test case 1: Tree structure
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        // Perform level order traversal for tree 1
        List<List<Integer>> result1 = bfs.levelOrder(root1);
        System.out.println("Test Case 1 Result: " + result1);

        // Test case 2: A different tree structure
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.right = new TreeNode(6);

        // Perform level order traversal for tree 2
        List<List<Integer>> result2 = bfs.levelOrder(root2);
        System.out.println("Test Case 2 Result: " + result2);
    }
}
