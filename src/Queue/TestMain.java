package Queue;

public class TestMain {
	public static void main(String[] args) {
		ArrayQueueImpl a = new ArrayQueueImpl();
		
		System.out.println("");
		System.out.println("Is Empty?....");
		System.out.println(a.isEmpty());
		
		System.out.println("");
		System.out.println("Enqueue....");
		a.enqueue(10);	
		
		System.out.println("");
		System.out.println("Peek....");
		System.out.println(a.peek());
		
		System.out.println("");
		System.out.println("Dequeue....");
		System.out.println(a.dequeue());
		
		System.out.println("");
		System.out.println("Enqueue....");
		a.enqueue(20);
		a.enqueue(30);
		a.enqueue(40);
		a.enqueue(50);
		a.enqueue(60);
		a.enqueue(70);
		a.enqueue(80);
		
		System.out.println("");
		System.out.println("Peek....");
		System.out.println(a.peek());
		
		System.out.println("");
		System.out.println("Is Empty?....");
		System.out.println(a.isEmpty());
		
		System.out.println("");
		System.out.println("Size....");
		System.out.println(a.size());
		
		a.enqueue(90);
		a.enqueue(100);
		a.enqueue(110);
		a.enqueue(111);
		a.enqueue(112);
		a.enqueue(113);
		a.enqueue(114);
		a.enqueue(115);
		a.enqueue(116);
		
	}
}


/*Output


Is Empty?....
true

Enqueue....

Peek....
10

Dequeue....
10

Enqueue....
Resizing...
Resizing...
Resizing...

Peek....
20

Is Empty?....
false

Size....
7
Resizing...
*/