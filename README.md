# M5 Team Project

This project demonstrates the implementation and testing of two key data structures and algorithms:

1. **HashTable with Level Indexing**: A custom hash table implementation that supports basic operations such as insertion, retrieval, removal, and size tracking with dynamic resizing.
2. **Queue-Based BFS (Breadth-First Search) with Level Indexing**: An algorithm to perform a level-order traversal of a binary tree, utilizing a queue-based BFS approach and storing nodes by levels.

### [Project Repository](https://github.com/NoahxAyyubi/DSA-M5-Team-Project/tree/main/src)

## Features

- **HashTableWithLevelIndexing**:
  - Implements the basic functionality of a hash table with dynamic resizing.
  - Supports insertion, retrieval, removal, and checking for keys.
  - Tracks the size of the table.
  
- **Queue-Based BFS**:
  - Performs a level-order traversal of a binary tree.
  - Utilizes a queue to process nodes and store them in levels.
  - Supports testing with different binary tree structures.

## Explanation

### 1. HashTableWithLevelIndexing
- **Put Method**: Adds a key-value pair to the hash table. If the load factor exceeds a threshold, the table is resized.
- **Get Method**: Retrieves the value associated with a given key.
- **Remove Method**: Removes a key-value pair from the hash table and handles rehashing if necessary.
- **ContainsKey Method**: Checks if a key is present in the hash table.
- **Size Method**: Returns the current number of key-value pairs in the table.

### 2. Queue-Based BFS
- **TreeNode Class**: Represents a node in the binary tree with left and right child pointers.
- **LevelOrder Method**: Implements BFS using a queue to traverse the tree level by level. Each level’s nodes are stored in a list, and the result is a list of lists of integers.

## Test Cases

The test cases for both solutions can be found in the `TestCases.java` file. It includes:
- **HashTable operations**: testing adding, removing, and retrieving key-value pairs.
- **BFS traversal**: testing the level-order traversal with different tree structures.

## Screenshots

![Screenshot of output](./Screenshot 2024-12-13 at 10.11.54 PM.png)


