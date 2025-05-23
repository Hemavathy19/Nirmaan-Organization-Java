package day21;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		byte num2 = 20;
		float num3 = 40.90f;
		double num4 = 50.90;
		boolean isWork = true;
		long l = 200000000;
		
		System.out.println("we can have any methods in this primitive data type ");
		
//		autoBoxing  
		
		Integer num6= num1;
		Byte num7 = num2;
		Float num8 = num3;
		Double num9=num4;
		Boolean isTrue = isWork;
		
//		unBoxing 
		int a = num6;
		byte b = num7;
		float c = num8;
		double d = num9;
		boolean isCheck =isTrue;
		
		System.out.println(num7.compareTo(num2));
		System.out.println(num8.equals(40.90f));
		System.out.println(num6.doubleValue());
		System.out.println(isTrue.compare(isWork, isCheck));
		System.out.println(num9.toString());
		
		
		
	}

}
