package binary_tree_problem;

import java.util.ArrayList;

public class BinarySearchTree {
	Node root;

	BinarySearchTree() {
		root = null;
	}

	void inorder() {
		inorderUtil(this.root);
	}

	void inorderUtil(Node node) {
		if (node == null)
			return;

		inorderUtil(node.leftData);
		System.out.print(node.data + " ");
		inorderUtil(node.rightData);
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data)
			root.leftData = insertRec(root.leftData, data);
		else if (data > root.data)
			root.rightData = insertRec(root.rightData, data);

		return root;
	}

	ArrayList<Integer> treeToList(Node node, ArrayList<Integer> list) {

		if (node == null)
			return list;

		treeToList(node.leftData, list);
		list.add(node.data);
		treeToList(node.rightData, list);

		return list;
	}

	boolean isPairPresent(Node node, int target) {
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = treeToList(node, a1);

		int start = 0;

		int end = a2.size() - 1;

		while (start < end) {

			if (a2.get(start) + a2.get(end) == target) // Target Found!
			{
				System.out.println("Pair Found: " + a2.get(start) + " + " + a2.get(end) + " " + "= " + target);
				return true;
			}

			if (a2.get(start) + a2.get(end) > target) // decrements end
			{
				end--;
			}

			if (a2.get(start) + a2.get(end) < target) // increments start
			{
				start++;
			}
		}

		System.out.println("No such values are found!");
		return false;
	}
}
