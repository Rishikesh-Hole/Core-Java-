// Try with resouce are applicable to resource object only. 
// Resource objects are the objects which require explicit cleanup. Means which needs to close after thier usage. (like using .close() method)
// for example database connection objects, file read write objects (Streams, readers), sockets, etc..

// We can make an object as rsource object by implementing AutoCloseable interface and overriding its close() method.
// Then you can use try with resouce on that object.


class BikeImp{
	public static void main(String [] args){
		//try(Bike B1 = new FZ()){ // here it is invalid as B1 is not a resouce object
		try{ Bike B1 = new FZ();
		B1.bikeCompany();
		B1.bikeSpeed();
		System.out.println("Bike bikeType is - " + B1.bikeType);
		Bike.bikeColor();
		B1.bikeGears();
		}
		catch(Exception e){
			System.out.println("Excpetion!!");
		}
		
		System.out.println("=================================");
		
		try(Pulsur B2 = new Pulsur()){ // we made Pulsur class as resouce class using AutoCloseable 
		B2.bikeCompany();
		B2.bikeSpeed();		
		System.out.println("Bike bikeType is - " + B2.bikeType);
		Bike.bikeColor();
		B2.bikeGears();
		}
		catch(Exception e){
			System.out.println("Excpetion!!");
		}
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

class Pulsur implements Bike, AutoCloseable{
	public void bikeCompany(){
		System.out.println("Bike company is Pulsur. ");
	}
	public void bikeSpeed(){
		System.out.println("Bike speed is 110 kmph. ");
	}
	@Override
	public void close() throws Exception{
		System.out.println("Pulsur resource object is closed. ");
	}
}

/*
D:\Final Interview\Core java\Coding practice\16 - Garbage collection>java TryWithResource.java
TryWithResource.java:3: error: incompatible types: try-with-resources not applicable to variable type
                try(Bike B1 = new FZ()){
                         ^
    (Bike cannot be converted to AutoCloseable)
TryWithResource.java:16: error: incompatible types: try-with-resources not applicable to variable type
                try(Bike B2 = new Pulsur()){
                         ^
    (Bike cannot be converted to AutoCloseable)
2 errors
error: compilation failed

D:\Final Interview\Core java\Coding practice\16 - Garbage collection>
*/

/*


*/