import java.util.*;

class LinkedListDequeDemo{
	public static void main(String [] args){
		LinkedList<Integer> queue = new LinkedList<Integer>(); // Valid - we can use Deque methods +  Queue methods + List methods as well
		//Queue<Integer> queue = new LinkedList<Integer>(); // Valid but we can't use Deque methods + List methods, Queue methods are valid here only
		
		queue.addFirst(1);
		queue.addLast(2);
		queue.offerFirst(3);
		queue.offerLast(4);
		queue.addFirst(5);
		queue.addLast(6);
		
		System.out.println("\nTraversing using Iterator..");
		Iterator<Integer> iterator = queue.iterator();
		while(iterator.hasNext()){
			System.out.println("queue member - " + iterator.next());
		}
		System.out.println("\nTraversing using advanced for loop..");
		for (Integer member:queue){
			System.out.println("queue member - "+member);
		}
		System.out.println("\nTraversing using method reference..");
			queue.forEach(System.out::println);
		
		System.out.println("\nRemoving element using removeFirst() and removeLast() ");
		queue.removeFirst();
		queue.removeLast();
		
		System.out.println("\nTraversing using method reference..");
		queue.forEach(System.out::println);		
		
		System.out.println("\nPolling element (retrieving and removing first element) using queue.pollFirst() : " + queue.pollFirst());
		System.out.println("\nPolling element (retrieving and removing last element) using queue.pollLast() : " + queue.pollLast());
		
		
		
		System.out.println("\nTraversing using method reference..");
		queue.forEach(System.out::println);		
		
		System.out.println("\nAccessing elements using getFirst() : "+queue.getFirst());
		System.out.println("\nAccessing elements using getLast() : "+queue.getLast());		
		
		System.out.println("\nChecking queue emptiness queue.isEmpty() : " + queue.isEmpty());
		System.out.println("\nChecking queue size queue.size() : " + queue.size());			
				
		System.out.println("\nRemoving all Elements from queue using queue.clear()");
		queue.clear();
		
		System.out.println("\nChecking queue emptiness queue.isEmpty() : " + queue.isEmpty());

	}
}


/*

D:\Final Interview\Collection framwork\Queue>java LinkedListDequeDemo.java

Traversing using Iterator..
queue member - 5
queue member - 3
queue member - 1
queue member - 2
queue member - 4
queue member - 6

Traversing using advanced for loop..
queue member - 5
queue member - 3
queue member - 1
queue member - 2
queue member - 4
queue member - 6

Traversing using method reference..
5
3
1
2
4
6

Removing element using removeFirst() and removeLast()

Traversing using method reference..
3
1
2
4

Polling element (retrieving and removing first element) using queue.pollFirst() : 3

Polling element (retrieving and removing last element) using queue.pollLast() : 4

Traversing using method reference..
1
2

Accessing elements using getFirst() : 1

Accessing elements using getLast() : 2

Checking queue emptiness queue.isEmpty() : false

Checking queue size queue.size() : 2

Removing all Elements from queue using queue.clear()

Checking queue emptiness queue.isEmpty() : true

D:\Final Interview\Collection framwork\Queue>

*/