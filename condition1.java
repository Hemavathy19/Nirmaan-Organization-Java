package day5;

import java.util.Scanner;

public class condition1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your mark: ");
		int mark = sc.nextInt();
		
		System.out.println("the mark is "+ mark);
		
		if(mark>=35 && mark<=100) {
			System.out.println(" you passed ");
			if (mark>=95) {
				System.out.println("grade A ");
				
			}
			else if (mark>=90) {
				System.out.println("grade A1");
				
			}
			else if ( mark>=80) {
				System.out.println("grade B");
				
			}
			else if (mark>=70) {
				System.out.println("grade C");
			}
			else {
				System.out.println(" grade D");
			}
			
		}
		else if(mark<35 && mark>=0) {
			System.out.println("you failed");
		
		}
		else {
			System.out.println("invalid mark ");
		}
	}

}
