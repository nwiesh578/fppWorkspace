package assignment8_2.problem1;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Marketing>{

	@Override
	public int compare(Marketing o1, Marketing o2) {
		
		return o1.employeename.compareTo(o2.employeename);
	}

}