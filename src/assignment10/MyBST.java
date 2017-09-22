package assignment10;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}
	
	/**
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			printTree( t.left );
		    System.out.print(t.element+",");
		    printTree( t.right );
		} 
	}
		 
	public void preOrder(){
		preOrder(root);  
	}
	
	private void preOrder(BinaryNode t){
		if( t != null ){
			System.out.print(t.element+",");
			preOrder( t.left );
		    preOrder( t.right );
		} 
	}
	
	public void postOrder(){
		postOrder(root);  
	}
	
	private void postOrder(BinaryNode t){
		if( t != null ){
			postOrder( t.left );
			postOrder( t.right );
			System.out.print(t.element+",");		    
		} 
	}
	
	public Integer getRoot() {
		return root.element;
	}
		
	public Integer findMin(){ 
		 return findMin(root);
	}
	
	public Integer findMin(BinaryNode t) {
		BinaryNode n;
		n = root;
		while(n.left!=null) {
			n=n.left;
		}
		return n.element;
	}
	
	public Integer findMax(){ 
		 return findMax(root);
	}
	
	public Integer findMax(BinaryNode t) {
		BinaryNode n;
		n = root;
		while(n.right!=null) {
			n=n.right;
		}
		return n.element;
	}
	
	public int size() {
		return getSize(root);
	}
	
	private int getSize(BinaryNode t) {
		if(t == null) return 0;
		else if(t.left == null && t.right == null) return 1;
		else return 1 + getSize(t.left) + getSize(t.right);
	}
	
	public boolean contains(Integer key){ 
		BinaryNode t = root;
		
		while(t != null) {
			if(key.compareTo(t.element)<0) {
				t = t.left;
			}				
			else if(key.compareTo(t.element)>0){ 
				t = t.right;
			}
			else {
				return true;
			}

		}
		
		return false;		
	}

	
	public Integer leafNodes(){ 
		return leafNodes(root); 
	}
	
	private int leafNodes(BinaryNode t) { 
		if(t == null) return 0;
		if(t.left == null && t.right == null) return 1;
		else return leafNodes(t.left) + leafNodes(t.right);
	}
	
	public boolean isEmpty(){
		if (root == null) return true;
		return false;
	}

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)
				{
				if(x.compareTo(n.element)<0) {
					
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
									
					if(n.right==null){
					n.right = new BinaryNode(x,null,null);
					inserted = true;
					}
						
					else {
							n = n.right;
					}
										
				}
				
				else {
					inserted = true;
				}

			}

		}
	}
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
	}
		

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		
		System.out.print("Is Empty : ");
		System.out.println(mybst.isEmpty());
		System.out.println(" ");
		
		int [] a = {45, 25, 65, 75, 15, 30, 55, 80, 10, 20, 50, 60};
	
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
		
		//mybst.insert(12);
		
		System.out.print("Is Empty : ");
		System.out.println(mybst.isEmpty());
		
		System.out.println(" ");
		System.out.println("InOrder Traversal");
		mybst.printTree();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Pre-Order Traversal");
		mybst.preOrder();
		
		System.out.println("");
		System.out.println("");
		System.out.println("Post-Order Traversal");
		mybst.postOrder();
		
		System.out.println(" ");
		System.out.println(" ");		
		
		System.out.println("The minimum element : "+mybst.findMin());
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("The maximum element : "+mybst.findMax());
		
		System.out.println(" ");
		System.out.println("The size : "+mybst.size());
		
		System.out.println(" ");
		System.out.println("Leafnodes: " + mybst.leafNodes());
		
		System.out.println(" ");
		System.out.println("GetRoot: " + mybst.getRoot());
		
		System.out.println(" ");
		System.out.println("Element Contained 45: " + mybst.contains(45));
		System.out.println("Element Contained 65: " + mybst.contains(65));
		System.out.println("Element Contained 50: " + mybst.contains(50));
		System.out.println("Element Contained 20: " + mybst.contains(20));
		System.out.println("Element Contained 20: " + mybst.contains(21));
		
		/*TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int j = 0; j < a.length; j++ ) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();		
			Integer nextItem = null;
			while(it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			} 
			System.out.println();
		}
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11)+", "+ map.get(10);
		System.out.println(str);*/
			
	}
}

/*	Output:
	
	Is Empty : true
	 
	Is Empty : false
	 
	InOrder Traversal
	10,15,20,25,30,45,50,55,60,65,75,80, 
	 
	Pre-Order Traversal
	45,25,15,10,20,30,65,55,50,60,75,80,

	Post-Order Traversal
	10,20,15,30,25,50,60,55,80,75,65,45, 
	 
	The minimum element : 10
	 
	 
	The maximum element : 80
	 
	The size : 12
	 
	Leafnodes: 6
	 
	GetRoot: 45
	 
	Element Contained 45: true
	Element Contained 65: true
	Element Contained 50: true
	Element Contained 20: true
	Element Contained 20: false
*/