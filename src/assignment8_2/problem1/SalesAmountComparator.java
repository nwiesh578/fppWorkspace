package assignment8_2.problem1;

import java.util.Comparator;

public class SalesAmountComparator implements Comparator<Marketing> {

	@Override
	public int compare(Marketing o1, Marketing o2) {
		
		return Double.compare(o1.salesamount, o2.salesamount);
	}
}
