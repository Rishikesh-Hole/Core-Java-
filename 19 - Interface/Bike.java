class BikeImp{
	public static void main(String [] args){
		Bike B1 = new FZ();
		B1.bikeCompany();
		B1.bikeSpeed();
		System.out.println("Bike bikeType is - " + B1.bikeType);
		Bike.bikeColor();
		B1.bikeGears();
		
		System.out.println("=================================");
		
		Bike B2 = new Pulsur();
		B2.bikeCompany();
		B2.bikeSpeed();		
		System.out.println("Bike bikeType is - " + B2.bikeType);
		Bike.bikeColor();
		B2.bikeGears();
	}
}

interface Bike{
	String bikeType="SPORT";
	void bikeCompany();
	void bikeSpeed();
	static void bikeColor(){
		System.out.println("Bike color is RED. ");
	}
	
	default void bikeGears(){
		System.out.println("Bike has 5 Gears. ");
	}	
}

class FZ implements Bike{
	public void bikeCompany(){
		System.out.println("Bike company is FZ. ");
	}
	public void bikeSpeed(){
		System.out.println("Bike speed is 120kmph. ");
	}
}

class Pulsur implements Bike{
	public void bikeCompany(){
		System.out.println("Bike company is Pulsur. ");
	}
	public void bikeSpeed(){
		System.out.println("Bike speed is 110 kmph. ");
	}
}