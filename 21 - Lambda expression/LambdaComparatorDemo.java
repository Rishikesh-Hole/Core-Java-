import java.util.*;

class LambdaComparatorDemo{
	
	int studId;
	String studName;
	LambdaComparatorDemo(int studId, String studName){
		this.studId = studId;
		this.studName = studName;
	}
	
	public String toString(){
		return "[ Studen ID: "+studId+" Name: "+studName+"]";
	}
	
	public static void main(String [] args){
		TreeSet<LambdaComparatorDemo> TS = new TreeSet<LambdaComparatorDemo>((o1,o2)-> Integer.compare(o1.studId, o2.studId));
		TS.add(new LambdaComparatorDemo(301, "Rishikesh"));
		TS.add(new LambdaComparatorDemo(203, "Ankit"));
		TS.add(new LambdaComparatorDemo(152, "Karan"));
		TS.add(new LambdaComparatorDemo(770, "Sankalp"));
		TS.add(new LambdaComparatorDemo(430, "Sankalp"));
		
		TS.forEach(System.out::println);
		
		System.out.println();
		
		TreeSet<LambdaComparatorDemo> TS1 = new TreeSet<LambdaComparatorDemo>((o1,o2)-> (o1.studId > o2.studId)?1 : (o1.studId < o2.studId)? -1 : 0);
		
		TS1.add(new LambdaComparatorDemo(101, "Rishikesh"));
		TS1.add(new LambdaComparatorDemo(903, "Ankit"));
		TS1.add(new LambdaComparatorDemo(52, "Karan"));
		TS1.add(new LambdaComparatorDemo(770, "Sankalp"));
		TS1.add(new LambdaComparatorDemo(430, "Sankalp"));
		
		TS1.forEach(System.out::println);
		
		
	}
}