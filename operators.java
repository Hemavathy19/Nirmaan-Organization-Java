package day4;

import java.util.Scanner;

public class operators {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	int num1 = sc.nextInt();
	System.out.println("Enter the second number:");
	int num2 = sc.nextInt();

	int num4 = 10;
	int num5 = 50;
	int num6 = 5;
	int num7 = 100;
	
	boolean ischeck= (num1>num4 && num2<num5);
	boolean ischeck1= (num1<num6 || num2>num7);

	
	System.out.println("               ");
	System.out.println("Arithmatic operations");
	System.out.println("Addition:"+(num1+num2));
	System.out.println("Subtraction:"+(num1-num2));
	System.out.println("Multiplication:"+(num1*num2));
	System.out.println("Division:"+(num1/num2));
	System.out.println("Modulus:"+(num1%num2));
	System.out.println("               ");
	System.out.println("Relational operator:");
	System.out.println("12 > 25:"+(num1<num2));
	System.out.println("12 < 25:"+(num1>num2));
	System.out.println("12 >= 25:"+(num1>=num2));
	System.out.println("12 <= 25:"+(num1<=num2));
	System.out.println("12 == 25:"+(num1==num2));
	System.out.println("12 != 25:"+(num1!=num2));
	
	System.out.println("               ");
	System.out.println(" Logical operators:");
	System.out.println("12 >10 AND 25 <50:"+(ischeck));
	System.out.println("12 < 5 OR 25 > 100:"+(ischeck1));
	
	System.out.println("               ");
	int a = 10;
	int b=  12;
	int value1= a+=b;
	int value2= a-=b;
	int value3= a*=b;
	int value4= a/=b;
	int value5= a%=10;
	
	System.out.println("Assignment Operations :");
	System.out.println("Initial value:"+ a );
	System.out.println("After +=:" + value1 );
	System.out.println("After -=:" + value2 );
	System.out.println("After *=:" + value3 );
	System.out.println("After /=:" + value4 );
	System.out.println("After %=:" + value5 );
	
	System.out.println("               ");
	
	System.out.println(" Unary operations:");
	int val=12;
	System.out.println("Initial value:"+ val);
	System.out.println("After increment:"+ (++val));
	System.out.println("After decrement:"+ (--val));
	
	System.out.println("              ");
	
	System.out.println("Conditional operations:");
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	}

}
