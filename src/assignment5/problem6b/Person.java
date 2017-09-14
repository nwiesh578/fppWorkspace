package assignment5.problem6b;

class Person implements Cloneable{

	String name;
	Computer computer;

	public Person(String name, Computer computer) {
		super();
		this.computer = computer;
		this.name = name;
	}
	
	public String toString() {
		
		String str = this.name+" has a second hand "+this.computer+" laptop";
		return str;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Person clone = (Person) super.clone();
		clone.computer = (Computer)this.computer.clone();
		return clone;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
	
    // Shallow copy of Cloning assign the objects instance references 
      
      Person addObj = new Person("John", new Computer("DELL","CORE I3",8192,1024,2.4));
      
      System.out.println("Before Cloning");
      System.out.println(addObj);
      
      Person cloAdd= (Person) addObj.clone(); 
      System.out.println("After Cloning");
      System.out.println(cloAdd);
      
      addObj.computer.setManufacturer("Apple");
      System.out.println("After Modifing the Manufacturer");
      System.out.println(cloAdd);
         	       
     	     
	}
}


/*	Output
	
	Before Cloning
	John has a second hand DELL laptop
	After Cloning
	John has a second hand DELL laptop
	After Modifing the Manufacturer
	John has a second hand DELL laptop
*/