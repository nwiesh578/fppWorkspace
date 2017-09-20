package assignment8_2.problem1;

public class Marketing {
	String employeename;
	String productname;
	double salesamount;
	
	public Marketing(String employeename, String productname, double salesamount) {
		super();
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	@Override
	public String toString() {
		return "Marketing [employeename=" + employeename + ", productname=" + productname + ", salesamount="
				+ salesamount + "]"+"\n";
	}
}
