package simpleProblems;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num2 = reader.nextInt();

		if(num2 % 2 == 0)
			System.out.println(num2 + " is even");
		else
			System.out.println(num2 + " is odd");
	}
// this line is added by rago for test

}
