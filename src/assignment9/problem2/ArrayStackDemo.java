package assignment9.problem2;

import java.util.LinkedList;
import java.util.List;

interface Stack1
{ 
	public void push(Object ob);
	public Object pop();
	public Object peek();
	public boolean isEmpty();
	public int size();
}
class ArrayStack implements Stack1
{
	private List<Object> a;
	private int top; // stack top
	public ArrayStack(int n) // constructor
	{ 
		a = new LinkedList(); // create stack array
		top = -1; // no items in the stack
	}
	
	public void push(Object item) // add an item on top of stack
	{
		if(top == a.size())
		{ 
			System.out.println("Stack is full");
			return;
		}
		
		top++; // increment top
		a.add(item); // insert an item

	}
	
	public Object pop() // remove an item from top of stack
	{
		if( isEmpty() )
		{ 
			System.out.println("Stack is empty");
			return null;
		}
		
		Object item = ((LinkedList) a).getLast(); // access top item
		top--; // decrement top
		return item;
	}
	public Object peek() // get top item of stack
	{ if( isEmpty() ) return null;
	return ((LinkedList) a).getLast();
	}
	public boolean isEmpty() // true if stack is empty
	{ 
		return (top == -1); }
	
	public int size() // returns number of items in the stack
	{ 
		return top+1; 
	}
}

public class ArrayStackDemo {

	public static void main(String[] args) {
		ArrayStack stk = new ArrayStack(4); // create stack of size 4
		Object item;
		stk.push('A'); // push 3 items onto stack
		stk.push('B');
		stk.push('C');
		stk.push(4);

		System.out.println("size(): "+ stk.size());
		item = stk.pop(); // delete item
		System.out.println(item + " is deleted");
		stk.push('D'); // add three more items to the stack
		stk.push('E');
		System.out.println(stk.pop() + " is deleted");
		stk.push('G'); // push one item
		item = stk.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());
	}

}

/*
 * Output
 * size(): 4
4 is deleted
E is deleted
G is on top of stack
Size of the Stack : 5*/
