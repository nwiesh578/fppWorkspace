package assignment8.prob1;

	public class MyPerson {
		private final int INITIAL_LENGTH = 4;
		private Person[] pArray; 
		private int size;
		
		public MyPerson() {
			pArray = new Person[INITIAL_LENGTH];
			size = 0;
		}
		
		public void add(Person p){
			
			if(size == pArray.length) resize();
			pArray[size++] = p;
		}
		
		public Person get(int i){
			if(i < 0 || i >= size){
				return null;
			}
			return pArray[i];
		}
		
		public boolean find(String lastName) {
			for(Person test : pArray){
				if(test.getLast().equals(lastName)) return true;
			}
			return false;
		}
		
		public void insert(Person p, int pos){
			if(pos > size) return;
			if(pos >= pArray.length||size+1 > pArray.length) {
				resize();
			}
			Person[] temp = new Person[pArray.length+1];
			System.arraycopy(pArray,0,temp,0,pos);
			temp[pos] = p;
			
			System.arraycopy(pArray,pos,temp,pos+1, pArray.length - pos);
			pArray = temp;
			++size;
			
		}
		
		public boolean remove(Person p){
			if(size == 0) return false;
			int index = -1;
			for(int i = 0; i < size; ++i ){
				if(pArray[i].equals(p)){
					index = i;
					break;
				}
			}
			if(index==-1) return false;
			Person[] temp = new Person[pArray.length];
			System.arraycopy(pArray,0,temp,0,index);
			System.arraycopy(pArray,index+1,temp,index,pArray.length-(index+1));
			pArray = temp;
			--size;
			return true;
		}
		
		
		private void resize(){
			System.out.println("Resizing...");
			int len = pArray.length;
			int newlen = 2*len;
			Person[] temp = new Person[newlen];
			System.arraycopy(pArray,0,temp,0,len);
			pArray = temp;
		}
		public String toString(){
			StringBuilder sb = new StringBuilder("[");
			for(int i = 0; i < size-1; ++i){
				sb.append(pArray[i]+", ");
			}
			sb.append(pArray[size-1]+"]");
			
			return sb.toString();
		}
		public int size() {
			return size;
		}


			public static void main(String[] args) {
				Person p1 = new Person("L1","Rahul",20);
				Person p2 = new Person("L2","Sahul1",21);
				Person p3 = new Person("L3","Tahul2",22);
				Person p4 = new Person("L4","Kahul3",23);
				Person p5 = new Person("L5","Mahul3",24);
				Person p6 = new Person("L6","Bahul3",25);
				Person p10 = new Person("L10","Rob",20);
				
				
				MyPerson p = new MyPerson();
				System.out.println("Adding of Person instances and resizing if needed: ");
				p.add(p1);
				p.add(p2);
				p.add(p3);
				p.add(p4);
				p.add(p5);
				p.add(p6);
				System.out.println(p);
				
				System.out.println("");
				System.out.println("Array after removal of p2, p3 instances - Sahul1, Tahul2");
				p.remove(p2);
				p.remove(p3);
				System.out.println(p);
				
				System.out.println("");
				System.out.println("Array after insertion of p10 instance at position 1 - Rob");
				p.insert(p10, 1);
				System.out.println(p);
				
				System.out.println("");
				System.out.println("Finding an instance in the array with the lastName : L10");
				System.out.println(p.find("L10"));
				
				
			}
}
	
/*  Output:
	
	Adding of Person instances and resizing if needed: 
	Resizing...
	[Person [lastName=L1, firstName=Rahul, age=20], Person [lastName=L2, firstName=Sahul1, age=21], Person [lastName=L3, firstName=Tahul2, age=22], Person [lastName=L4, firstName=Kahul3, age=23], Person [lastName=L5, firstName=Mahul3, age=24], Person [lastName=L6, firstName=Bahul3, age=25]]

	Array after removal of p2, p3 instances - Sahul1, Tahul2
	[Person [lastName=L1, firstName=Rahul, age=20], Person [lastName=L4, firstName=Kahul3, age=23], Person [lastName=L5, firstName=Mahul3, age=24], Person [lastName=L6, firstName=Bahul3, age=25]]

	Array after insertion of p10 instance at position 1 - Rob
	[Person [lastName=L1, firstName=Rahul, age=20], Person [lastName=L10, firstName=Rob, age=20], Person [lastName=L4, firstName=Kahul3, age=23], Person [lastName=L5, firstName=Mahul3, age=24], Person [lastName=L6, firstName=Bahul3, age=25]]

	Finding an instance in the array with the lastName : L10
	true
*/