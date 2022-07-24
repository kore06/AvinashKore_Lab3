package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.util.BalancingBrackets;


public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression : ");
		String str = sc.next();
		boolean checkVal = BalancingBrackets.areBracketsBalanced(str);
		if(checkVal)
			System.out.println("The expression is balanced");
		else
			System.out.println("The expression is not balanced");
	}
}
