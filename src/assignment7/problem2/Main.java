package assignment7.problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntryBase en = new EntryBase();
		en.add('a', "Avikar");
		en.add('b',"Bonn");
		en.add('e',"Emma");
		
		
		en.add('a', "Ansa");
		
		System.out.println(en);
		
		String s = en.get('e');
		System.out.println(s);
	}

}