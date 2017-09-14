package assignment5.problem5;

public class Main {
	public static void main(String[] args) {
		Computer c = new Computer("Dell","Core i3",8192,1024,2.4);
		Computer c1 = new Computer("Dell","Core i3",8192,1024,2.4);
		Computer c2 = new Computer("HP","Core i7",4096,500,2.7);
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println("c.equals(c1) : "+c.equals(c1));
		System.out.println("\n");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println("c.equals(c1) : "+c1.equals(c2));
		System.out.println("\n");

		System.out.println("c - hashcode : "+c.hashCode());
		System.out.println("c1 - hashcode : "+c1.hashCode());
		System.out.println("c2 - hashcode : "+c2.hashCode());
	}
}

/*	Output
	
	Computer [manufacturer :- Dell, processor :- Core i3, ramSize :- 8192, diskSize :- 1024, processorSpeed :- 2.4, computePower() :- 19660.8]
	Computer [manufacturer :- Dell, processor :- Core i3, ramSize :- 8192, diskSize :- 1024, processorSpeed :- 2.4, computePower() :- 19660.8]
	c.equals(c1) : true


	Computer [manufacturer :- Dell, processor :- Core i3, ramSize :- 8192, diskSize :- 1024, processorSpeed :- 2.4, computePower() :- 19660.8]
	Computer [manufacturer :- HP, processor :- Core i7, ramSize :- 4096, diskSize :- 500, processorSpeed :- 2.7, computePower() :- 11059.2]
	c.equals(c1) : false

	c - hashcode : 1537335077
    c1 - hashcode : 1537335077
	c2 - hashcode : 208125247
*/