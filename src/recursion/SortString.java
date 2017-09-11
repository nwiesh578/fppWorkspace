package recursion;

public class SortString {
		public static void main (String[] args){
		      SortString recurse = new SortString();
		      System.out.println("The final sorted string : " + recurse.compareTo("acez","abdz"));
		    }  

		  public String compareTo (String s1, String s2) {

		    if(s1.isEmpty() || s2.isEmpty()){
		      return s1+s2;
		    }
		    
		    if(s1.charAt(0)<s2.charAt(0)) {
		    	return s1.charAt(0)+""+s2.charAt(0)+compareTo(s1.substring(1),s2.substring(1));
		    }
		    else
		    	return s2.charAt(0)+""+s1.charAt(0)+compareTo(s1.substring(1),s2.substring(1));
		  }
}

/* Output
   
   The final sorted string : aabcdezz

*/