package day6;

import java.util.Scanner;

public class tables {
	public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the table:");
	int table=sc.nextInt()
;
	
	for (int i=1;i<=10;i++)
		System.out.println(table+"x"+i+"="+i*table);
	
	
	System.out.println("             ");
	
	
	System.out.println("Enter the table:");
	int table1=sc.nextInt();
	
	for (int i=1;i<=10;i++)
		System.out.println(table1+"x"+i+"="+i*table1);
	}

}
