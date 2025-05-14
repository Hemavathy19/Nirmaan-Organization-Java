package inheritanceTadk;

 class vehicle1 {
	
	void startEngine() {
		System.out.println("Vehicle engine started ");
	}
 }
 class car extends vehicle1{
	void drive() {
		System.out.println("car is driving ");
	}
}

 class ElectricCar extends car{
	void chargeBattery() {
		System.out.println("Electric Car is Charging ");
	}
}

 class bike extends vehicle1{
	void kickStart() {
		System.out.println("vehicle engine start ");
	}
	
}

 public class vehicle{
	 

	public static void main(String[] args) {
	 ElectricCar e = new ElectricCar();
	 e.startEngine();
	 e.drive();
	 e.chargeBattery();
	 
	 
	 
	 
		
	}
	
	
	
	
	
	
	
	
	
	
 }



	

