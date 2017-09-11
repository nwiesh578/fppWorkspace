package recursion;

public class MinChar {
	String c;
	public  String minChar(String x, int z){
		   if(z==0)
		   {
		   c=x.substring(0);
		   }
		    while(z < x.length()){
		        if(x.substring(z,z+1).compareTo(c)<0){
		            c = x.substring(z,z+1);
		        }
		        z++;
		        minChar(x, z);
		    }
		    return c;
		}
	public static void main(String[] args) {
		String c1 = "ndikel";
		MinChar m = new MinChar();
		System.out.println("The input String is : "+c1);
		System.out.println("The smallest character is : "+m.minChar(c1,0));
	}
}

/* Output

   The input String is : ndikel
   The smallest character is : d

*/
