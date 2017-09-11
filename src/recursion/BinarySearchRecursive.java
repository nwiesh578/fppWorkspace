package recursion;

public class BinarySearchRecursive {

	   //"helper" method,to feed in params
	   public int binarySearch(int[] a, int x) { 
	      return binarySearch(a, x, 0, a.length - 1);
	   }
	  
	   
	   private int binarySearch(int[ ] a, int x,
	         int low, int high) {
	      if (low > high) return -1; 
	      int mid = (low + high)/2;
	      if (a[mid] == x) return mid;
	      else if (a[mid] < x)
	         return binarySearch(a, x, mid+1, high);
	      else // last possibility: a[mid] > x
	         return binarySearch(a, x, low, mid-1);
	   }


	   public static void main(String[] args) {
	      BinarySearchRecursive bin =
	         new BinarySearchRecursive();
	      int[] a =
	        { 2,4,8,12,14,16,19,24,28,31,33,
	         39,40,45,49,51,53,54,56,57,60,
	         63,69,77,82,88,89,94,96,97};  
	      System.out.println("Position of all the elements of the array:");
	      for (int i = 0; i < a.length; i++)
	         System.out.print(bin.binarySearch(a,
	            a[i]) + " ");
	      System.out.println();
	      System.out.println("Position of the keys:");
	      System.out.print(bin.binarySearch(a,1) +" ");
	      System.out.print(bin.binarySearch(a,19)+" ");
	      System.out.print(bin.binarySearch(a,85)+" ");
	      System.out.print(bin.binarySearch(a,99)+" ");
	      System.out.print(bin.binarySearch(a,12)+" ");
	      System.out.print(bin.binarySearch(a,13)+" ");
	      System.out.print(bin.binarySearch(a,45)+" ");
	      System.out.print(bin.binarySearch(a,82)+" ");
	      
	      System.out.println();
	   }
	}

/* 	Output

	Position of all the elements of the array:
	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29
 
	Position of the keys:
	-1 6 -1 -1 3 -1 13 24 
*/