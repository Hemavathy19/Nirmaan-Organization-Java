package day20;

import java.util.Scanner;

public class ExceptionHandle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
	    
		
		try {
			System.out.println("Enter the number : ");
			int num = sc.nextInt()	;
		    int div = 10/num;
		    System.out.println(div);
		}
		
		
//		   catch(ArithmeticException a) {
//			   System.out.println(a);
//		   }
		   catch(Exception e){
			   System.out.println(e);
		   }
		    
			 try {
					int[] num1  = null;
			    System.out.println(num1[2]);
			}
		   catch (Exception ee) {
			   System.out.println(ee);
		   }
			
		
}
}
