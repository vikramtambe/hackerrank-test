package com.hackerrank.test;

/*sameTree(tree1, tree2)
1. If both trees are empty then return 1.
2. Else If both trees are non -empty
     (a) Check data of the root nodes (tree1->data ==  tree2->data)
     (b) Check left subtrees recursively  i.e., call sameTree( 
          tree1->left_subtree, tree2->left_subtree)
     (c) Check right subtrees recursively  i.e., call sameTree( 
          tree1->right_subtree, tree2->right_subtree)
     (d) If a,b and c are true then return 1.
3  Else return 0 (one is empty and other is not)
*/

//A binary tree node 
class Node {
	int data;
	Node left;
	Node right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class CheckEqualBinaryTree {
	Node root1;
	Node root2;

	/*
	 * Given two trees, return true if they are structurally identical
	 */
	boolean identicalTrees(Node a, Node b) {
		/* 1. both empty */
		if (a == null && b == null) {
			return true;
		}
			

		/* 2. both non-empty -> compare them */
		if (a != null && b != null) {
			return (a.data == b.data && identicalTrees(a.left, b.left) && identicalTrees(a.right, b.right));
		}
			

		/* 3. one empty, one not -> false */
		return false;
	}

	/* Driver program to test identicalTrees() function */
	public static void main(String[] args) {
		CheckEqualBinaryTree tree = new CheckEqualBinaryTree();

		tree.root1 = new Node(1);
		tree.root1.left = new Node(2);
		tree.root1.right = new Node(3);
		tree.root1.left.left = new Node(4);
		tree.root1.left.right = new Node(5);
		tree.root1.left.right.left = new Node(5);
		tree.root2 = new Node(1);
		tree.root2.left = new Node(2);
		tree.root2.right = new Node(3);
		tree.root2.left.left = new Node(4);
		tree.root2.left.right = new Node(5);
		tree.root2.left.right.left = new Node(5);

		if (tree.identicalTrees(tree.root1, tree.root2))
			System.out.println("BOTH trees are identical");
		else
			System.out.println("Trees are NOT identical");

	}
}