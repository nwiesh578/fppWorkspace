package assignment8_2.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {
	
	public static void main(String[] args) {
		
		List<Marketing> m = new ArrayList<Marketing>();
		
		Marketing m1 = new Marketing("Jack","pID1",5000.0); 
		Marketing m2 = new Marketing("Dolly","cID1",500.0); 
		Marketing m3 = new Marketing("Sam","eID1",420.0); 
		Marketing m4 = new Marketing("Dorothy","hID1",7800.0);
		Marketing m5 = new Marketing("Lily","jID1",6800.0);
		
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		
		System.out.println(m);
		
		System.out.println("");
		System.out.println("After Removing an object : ");
		m.remove(m1);
		System.out.println(m);
		
		System.out.println("After modifying status of object using set : ");
		m.set(1, m5);
		System.out.println(m);
		
		System.out.println("");
		System.out.println("The size of the list is : "+m.size());
		
		System.out.println("After Sorting in natural order using SaleAmountComparator : "); //NOTE : Dont forget Comparator consistent with equals
		Collections.sort(m, new SalesAmountComparator());
		System.out.println(m);
				
		System.out.println("");
		System.out.println("Retrieving employees with salary > 1000 using method listMoreThan1000 : ");
		List<Marketing> res = listMoreThan1000(m);
		System.out.println(res);
		
		System.out.println("");
		System.out.println("After Sorting in natural order using employeename (through EmployeeName Comparator) : ");
		Collections.sort(res, new EmployeeNameComparator());
		System.out.println(res);
		
	}
	 public static List<Marketing> listMoreThan1000(List<Marketing> list){  
		 List<Marketing> newlist = new ArrayList<Marketing>();
		 for(Marketing mar : list) {
			 if(mar.salesamount>1000.0) {
				 newlist.add(mar);
			 }
		 }
		 return newlist;
	 }	 
}
		 
/*	Output
	
			[Marketing [employeename=Jack, productname=pID1, salesamount=5000.0]
			, Marketing [employeename=Dolly, productname=cID1, salesamount=500.0]
			, Marketing [employeename=Sam, productname=eID1, salesamount=420.0]
			, Marketing [employeename=Dorothy, productname=hID1, salesamount=7800.0]
			]

			After Removing an object : 
			[Marketing [employeename=Dolly, productname=cID1, salesamount=500.0]
			, Marketing [employeename=Sam, productname=eID1, salesamount=420.0]
			, Marketing [employeename=Dorothy, productname=hID1, salesamount=7800.0]
			]
			After modifying status of object using set : 
			[Marketing [employeename=Dolly, productname=cID1, salesamount=500.0]
			, Marketing [employeename=Lily, productname=jID1, salesamount=6800.0]
			, Marketing [employeename=Dorothy, productname=hID1, salesamount=7800.0]
			]

			The size of the list is : 3
			
			After Sorting in natural order using SaleAmountComparator : 
			[Marketing [employeename=Dolly, productname=cID1, salesamount=500.0]
			, Marketing [employeename=Lily, productname=jID1, salesamount=6800.0]
			, Marketing [employeename=Dorothy, productname=hID1, salesamount=7800.0]
			]

			Retrieving employees with salary > 1000 using method listMoreThan1000 : 
			[Marketing [employeename=Lily, productname=jID1, salesamount=6800.0]
			, Marketing [employeename=Dorothy, productname=hID1, salesamount=7800.0]
			]

			After Sorting in natural order using employeename (through EmployeeName Comparator) : 
			[Marketing [employeename=Dorothy, productname=hID1, salesamount=7800.0]
			, Marketing [employeename=Lily, productname=jID1, salesamount=6800.0]
			]
			
*/