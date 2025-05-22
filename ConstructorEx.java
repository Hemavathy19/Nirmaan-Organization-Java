package day16;

public class ConstructorEx {

	String name;
	int rollNo;
	
	ConstructorEx(String name){
		this.name = name;
		
	}
	
	ConstructorEx(int rollNo){
		this.rollNo = rollNo;
	}
	
	ConstructorEx(String name,int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
public static void main(String[] args) {
	
	ConstructorEx con = new ConstructorEx("hema");
	
	System.out.println(con.name);
	
	ConstructorEx con1 = new ConstructorEx(001);
	
	System.out.println(con1.rollNo);
	
	ConstructorEx con3 = new ConstructorEx("harini");
	
	System.out.println(con3.name);
	
	ConstructorEx con4 = new ConstructorEx(002);
	
	System.out.println(con4.rollNo);
	
	ConstructorEx con5 = new ConstructorEx("srinivasan",003);
	System.out.println(con5.name);
	System.out.println(con5.rollNo);
	
	ConstructorEx con6 = new ConstructorEx("deepa",004);
	System.out.println(con6.name);
	System.out.println(con6.rollNo);
	
    
	
	
	
	
	
	
	
	
	
}
}
