package day18;

public class StaticKeyword {
	
	static {
		System.out.println("this is static");
	}
	
	 int num = 10;
	
	
	
	public static void main(String[] args) {
		
		StaticKeyword s = new StaticKeyword();
		s.num=20;
		
		System.out.println(s.num);
	}

}
