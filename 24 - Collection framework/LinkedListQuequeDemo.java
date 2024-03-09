import java.util.*;

class LinkedListQuequeDemo{
	public static void main(String [] args){
		//LinkedList<Integer> queue = new LinkedList<Integer>(); // Valid - we can use Deque methods +  Queue methods + List methods as well
		Queue<Integer> queue = new ArrayDeque<Integer>(); // Valid  but we can not use Deque methods, only Queue methods we can use 
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		
		System.out.println("\nTraversing using Iterator..");
		Iterator<Integer> iterator = queue.iterator();
		while(iterator.hasNext()){
			System.out.println("Family member - " + iterator.next());
		}
		System.out.println("\nTraversing using advanced for loop..");
		for (Integer member:queue){
			System.out.println("Family member - "+member);
		}
		System.out.println("\nTraversing using method reference..");
			queue.forEach(System.out::println);
		
		System.out.println("\nRemoving element");
		queue.remove();
		
		System.out.println("\nTraversing using method reference..");
		queue.forEach(System.out::println);		
		
		System.out.println("\nPolling element (retrieving and removing top/low element)");
		queue.poll();
		
		System.out.println("\nTraversing using method reference..");
		queue.forEach(System.out::println);		
		
		System.out.println("\nPeek element (retrieving but not removing top/low element)");
		System.out.println("queue.peek() : " + queue.peek());			
		
		System.out.println("\nChecking queue emptiness queue.isEmpty() : " + queue.isEmpty());
		System.out.println("\nChecking queue size queue.size() : " + queue.size());			
				
		System.out.println("\nRemoving all Elements from queue using queue.clear()");
		queue.clear();
		
		System.out.println("\nChecking queue emptiness queue.isEmpty() : " + queue.isEmpty());

	}
}


/*
D:\Final Interview\Collection framwork\Queue>java LinkedListQuequeDemo.java

Traversing using Iterator..
Family member - 1
Family member - 2
Family member - 3
Family member - 4
Family member - 5
Family member - 6

Traversing using advanced for loop..
Family member - 1
Family member - 2
Family member - 3
Family member - 4
Family member - 5
Family member - 6

Traversing using method reference..
1
2
3
4
5
6

Removing element

Traversing using method reference..
2
3
4
5
6

Polling element (retrieving and removing top/low element)

Traversing using method reference..
3
4
5
6

Peek element (retrieving but not removing top/low element)
queue.peek() : 3

Checking queue emptiness queue.isEmpty() : false

Checking queue size queue.size() : 4

Removing all Elements from queue using queue.clear()

Checking queue emptiness queue.isEmpty() : true

D:\Final Interview\Collection framwork\Queue>

*/