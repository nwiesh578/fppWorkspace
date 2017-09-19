package assignment7.problem2;

public class EntryBase {
	private final int DEFAULT_ASCII_VAL = 97;
	
	private Entry[] entries = new Entry[26];
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		int ascii = (int) c;
		
		return entries[ascii - DEFAULT_ASCII_VAL].toString();
	}
	
	//adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		int ascii = (int) c;
		Entry e = new Entry(c, s);
		this.entries[ascii - DEFAULT_ASCII_VAL] = e;
	}
	
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		String s = "";
		for(int i=0; i<entries.length; i++) {
			if(entries[i] != null) {
				s += entries[i].toString() + "\n";
			}
		}
		return s;
	}
	
	private class Entry {
		private Character ch;
		private String str;
		
		Entry(char ch, String str){
			this.ch = ch;
			this.str = str;
		}
		
		//returns a String of the form "ch->str"
		@Override
		public String toString() {
			return ch + " -> " + str;
		}
	}
	
}
