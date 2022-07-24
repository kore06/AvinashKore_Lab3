package binary_tree_problem;

import java.util.ArrayList;
import java.util.Scanner;

class DriverCode {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of nodes you want : ");
		int noOfNodes = sc.nextInt();
		System.out.println("Enter the values =>");
		for (int i = 0; i < noOfNodes; i++) {
			int temp;
			temp = sc.nextInt();
			tree.insert(temp);
		}
		System.out.println("Enter the value you want to check :");
		int checkVal = sc.nextInt();
		tree.isPairPresent(tree.root, checkVal);
	}
}
