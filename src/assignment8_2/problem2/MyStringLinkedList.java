package assignment8_2.problem2;

import code8b.MyStringLinkedList.Node;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
		    	header.previous = n;
		    	header = n;
		    	
		}
	}

// Implement the code

	public void addLast(String item) {
		
		if(header == null)
			header = new Node(null, item, null);
		else {
			
			Node temp = findLast();
			Node newNode = new Node(temp, item, null);
			temp.next = newNode;
		}
		
	}


	// implement the code
	public void postAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.next == null) {
			//n is the first node
			addLast(value);
		}
		else {
			newNode = new Node(n, value, n.next);
			n.next.previous = newNode;
			n.next = newNode;
		}	
					
					
	}
// implement the code

       public int Size(){
    	   int size=0;
   		for (Node i= header; i != null; i=i.next){
   			size++;
   		}
   		return size;
       }

// implement code
    public boolean isEmpty(){
    	if (header == null)
    		return true;
    	return false;
}  

 

       
	
	public void preAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.previous == null) {
			//n is the first node
			addFront(value);
		}
		else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}	
					
	}
	
	public Node getFirst(){
		return header;
	}

	public Node getLast(){
		for (Node i=header; i!=null;i=i.next){
			if(i.next==null) return i;
		}
		return null;
	}

	
	public void removeFirst(){
		if (header == null)
    		return;
		else {
			header = header.next;
			header = null;
			header.next.previous = null;
		}
	}
	
	public void removeLast(){
		if (header == null)
    		return;
		else {
			Node temp = findLast();
			temp.previous.next = null;
			temp = null;
		}
	} 
	
	/*public void printMax(){
		Node max = new Node();
		max.value = null;
		for (Node i= header; i != null; i=i.next){
	   		if(i.value.equals(i.next.value))
	   			max.value = i.value;
	   		}
	   	} */
	
	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		} 
		
		
		
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}
	
	public void deleteList(){
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}
	
	public void print(Node n) {
		System.out.println("Recursively displaying\n"+print(n,"-->["));
	}

	public String print(Node n, String str) {
		if(n==null) return str+"NULL]";
		str+=n.toString()+"]-->[";
		return print(n.next,str);
	}
	
	/*public void  print(Node n) {
		if (header == null) return;
		System.out.println("Recursive display of nodes"+print(n));
		n= n.next;
	}*/

	public void printReverse() {
		String str =""; 
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}
	
	public class Node {
		String value;
		Node next;
		Node previous;
		
		Node() {
			
		}

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		
		System.out.println("");
		System.out.println("Is Empty?");
		System.out.println(mySL.isEmpty());
		
		System.out.println("");
		System.out.println("Added to the front");
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		
		System.out.println("");
		System.out.println("Added to the last");
		mySL.addLast("Fruit Cake");
		System.out.println(mySL);
		
		System.out.println("");
		System.out.println("Is Empty Again?");
		System.out.println(mySL.isEmpty());
		
		System.out.println("");
		System.out.println("Post Add Node");
		mySL.postAddNode(mySL.findItem("Fruit Cake"), "Cup cake");
		System.out.println(mySL);
		
		System.out.println("");
		mySL.postAddNode(mySL.findItem("Fruit Cake"), "Muffin");
		System.out.println(mySL);
		
		System.out.println("");
		System.out.println("Pre Add Node");
		mySL.preAddNode(mySL.findItem("Fruit Cake"), "Pan Cake");
		System.out.println(mySL);
		
		System.out.println("");
		System.out.println("Delete Node");
		mySL.deleteNode(mySL.findItem("Pan Cake"));
		System.out.println(mySL);
		
		System.out.println("");
		System.out.print("First Node : ");
		System.out.println(mySL.getFirst());
		
		System.out.println("");
		System.out.print("Last Node : ");
		System.out.println(mySL.getLast());
		
		System.out.println("");
		mySL.print(mySL.header);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Pre-Present MyStringLinkedList function calls");
		mySL.printReverse();
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Orange Juice");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Apple Pie"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Peach Sauce"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Carrot Cake"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteList();
		System.out.println(mySL);
		mySL.printReverse();
	}

}


/*		Output
	
			-->[NULL]

			Is Empty?
			true

			Added to the front
			-->[Carrot Cake]-->[NULL]

			Added to the last
			-->[Carrot Cake]-->[Fruit Cake]-->[NULL]

			Is Empty Again?
			false

			Post Add Node
			-->[Carrot Cake]-->[Fruit Cake]-->[Cup cake]-->[NULL]

			-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[NULL]

			Pre Add Node
			-->[Carrot Cake]-->[Pan Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[NULL]

			Delete Node
			I am here 4
			-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[NULL]

			First Node : Carrot Cake

			Last Node : Cup cake

			Recursively displaying
			-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[NULL]


			Pre-Present MyStringLinkedList function calls
			==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[NULL]
			-->[Carrot Cake]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[NULL]
			==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Carrot Cake]==>[NULL]
			-->[Blueberry Muffin]-->[Carrot Cake]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[NULL]
			==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
			-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[NULL]
			==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
			-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
			-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
			==>[Peach Sauce]==>[Orange Juice]==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
			I am here 2
			-->[Blueberry Muffin]-->[Carrot Cake]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
			==>[Peach Sauce]==>[Orange Juice]==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
			I am here 3
			-->[Blueberry Muffin]-->[Carrot Cake]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
			I am here 4
			-->[Blueberry Muffin]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
			-->[Blueberry Muffin]-->[Carrot Cake]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
			-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
			-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Danish Delight]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
			-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[Mango Smoothie]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Mango Smoothie]==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Danish Delight]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
			-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Carrot Cake]-->[Fruit Cake]-->[Muffin]-->[Cup cake]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
			==>[Peach Sauce]==>[Orange Juice]==>[Mango Smoothie]==>[Cup cake]==>[Muffin]==>[Fruit Cake]==>[Carrot Cake]==>[Danish Delight]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
			-->[NULL]
			==>[NULL]

*/
	