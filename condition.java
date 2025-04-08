package day5;

import java.util.Scanner;

public class condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark:");
		int mark =sc.nextInt();
		
		System.out.println("The mark is "+ mark);
		
		if (mark>=35) {
			System.out.println("you passed");
		}
			else {
				System.out.println("you failed");
			
		}
		
		
	}

}
