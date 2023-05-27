package simpleProblems;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int num3 = reader.nextInt();

		if(num3 % 2 == 0)
			System.out.println(num3 + " is even");
		else
			System.out.println(num3 + " is odd");

	}
// this line is added by rago for test

}
