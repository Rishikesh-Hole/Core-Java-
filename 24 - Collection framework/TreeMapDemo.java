import java.util.*;

class TreeMapDemo{
	public static void main(String [] args){
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		//Map<Integer, String> map = new TreeMap<Integer, String>(); // valid
						
		map.put(1, "Rishikesh");
		map.put(2, "Rooshi");
		map.put(6, "Baijayanti");
		map.put(4, "Saloni");
		map.put(3, "Sankalp");
		map.putIfAbsent(5, "Navin");
		
		System.out.println("\nTraversing using Iterator..");
		Iterator<Integer> iterator = map.keySet().iterator();
		while(iterator.hasNext()){
			Integer key = iterator.next();
			System.out.println("Key: " + key + " " + "Value: " + map.get(key));
		}
		
		System.out.println("\nTraversing using advanced for loop..");
		for (Map.Entry<Integer, String> member:map.entrySet()){
			System.out.println("Key: "+member.getKey()+ " Value: "+member.getValue());
		}
		System.out.println("\nTraversing using method reference..");
			map.forEach((key, value)->System.out.println("Key: "+key+ " Value: "+value));
			
		System.out.println("\nRemoving elements using map.remove(4).  "+map.remove(4));
		
		System.out.println("\nChecking for element presence using map.containsKey(5) : "+map.containsKey(5));
		System.out.println("\nChecking for element presence using map.containsValue(Navin) : "+map.containsValue("Navin"));
		
		System.out.println("\nChecking emptiness using map.isEmpty() : "+map.isEmpty());
				
		System.out.println("\nChecking size using map.size() : "+map.size());
		
		System.out.println("\nmap.values(): "+map.values());
		
		System.out.println("\nClearing map using map.clear() "); 
		map.clear();
		
		System.out.println("\nChecking emptiness using map.isEmpty() : "+map.isEmpty());		
	}
}

/*

D:\Final Interview\Collection framwork\Map>java TreeMapDemo.java

Traversing using Iterator..
Key: 1 Value: Rishikesh
Key: 2 Value: Rooshi
Key: 3 Value: Sankalp
Key: 4 Value: Saloni
Key: 5 Value: Navin
Key: 6 Value: Baijayanti

Traversing using advanced for loop..
Key: 1 Value: Rishikesh
Key: 2 Value: Rooshi
Key: 3 Value: Sankalp
Key: 4 Value: Saloni
Key: 5 Value: Navin
Key: 6 Value: Baijayanti

Traversing using method reference..
Key: 1 Value: Rishikesh
Key: 2 Value: Rooshi
Key: 3 Value: Sankalp
Key: 4 Value: Saloni
Key: 5 Value: Navin
Key: 6 Value: Baijayanti

Removing elements using map.remove(4).  Saloni

Checking for element presence using map.containsKey(5) : true

Checking for element presence using map.containsValue(Navin) : true

Checking emptiness using map.isEmpty() : false

Checking size using map.size() : 5

map.values(): [Rishikesh, Rooshi, Sankalp, Navin, Baijayanti]

Clearing map using map.clear()

Checking emptiness using map.isEmpty() : true

D:\Final Interview\Collection framwork\Map>
*/