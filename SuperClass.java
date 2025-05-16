package day18;



	
	class example {
		example(){
			System.out.println("this is example");
		}
	}
	
	class example1 extends example{
	
		example1(){
			super();
			System.out.println("this is example 1");
		}
	}
	class example2 extends example1{
		example2(){
			System.out.println("this is example 3");
		}
	}
	
	public class SuperClass {
		public static void main(String[] args) {
			//SuperClass s = new SuperClass();
			example2 ex2 = new example2();
			
			
		}
	
}
