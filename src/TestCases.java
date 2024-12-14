import java.util.*;

public class TestCases {

    public static void main(String[] args) {

        /********** HashTableWithLevelIndexing Test Cases **********/
        System.out.println("===== Running HashTableWithLevelIndexing Test Cases =====");
        HashTableWithLevelIndexing<String, Integer> hashTable = new HashTableWithLevelIndexing<>();

        // Test case 1: Add and retrieve values
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);

        System.out.println("Value for 'one': " + hashTable.get("one")); // 1
        System.out.println("Value for 'two': " + hashTable.get("two")); // 2
        System.out.println("Value for 'three': " + hashTable.get("three")); // 3

        // Test case 2: Check size
        System.out.println("Size: " + hashTable.size()); // 3

        // Test case 3: Remove a key
        System.out.println("Removing 'two': " + hashTable.remove("two")); // true
        System.out.println("Value for 'two': " + hashTable.get("two")); // null
        System.out.println("Size: " + hashTable.size()); // 2

        // Test case 4: Check containsKey
        System.out.println("Contains 'one': " + hashTable.containsKey("one")); // true
        System.out.println("Contains 'two': " + hashTable.containsKey("two")); // false

        // Test case 5: Add more entries to trigger resize
        hashTable.put("four", 4);
        hashTable.put("five", 5);
        System.out.println("Size after adding more entries: " + hashTable.size()); // 4

        System.out.println("===== Finished HashTableWithLevelIndexing Test Cases =====\n");

        /********** Queue-Based BFS Test Cases **********/
        System.out.println("===== Running Queue-Based BFS Test Cases =====");
        QueueBasedBFSLevelIndexing bfs = new QueueBasedBFSLevelIndexing();

        // Test case 1: Tree structure
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        // Perform level order traversal for tree 1
        List<List<Integer>> result1 = bfs.levelOrder(root1);
        System.out.println("Queue-Based BFS Test Case 1 Result: " + result1);

        // Test case 2: A different tree structure
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.right = new TreeNode(6);

        // Perform level order traversal for tree 2
        List<List<Integer>> result2 = bfs.levelOrder(root2);
        System.out.println("Queue-Based BFS Test Case 2 Result: " + result2);

        System.out.println("===== Finished Queue-Based BFS Test Cases =====");
    }
}