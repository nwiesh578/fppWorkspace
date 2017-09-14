package lesson5_3;

public class BasePlusCommissionEmployee extends CommissionEmployee implements Payable{
	double baseSalary;
	CommissionEmployee c,g;

	public BasePlusCommissionEmployee(String fname, String lname, String ssn, double grossSales, double commissionRate,
			double baseSalary, CommissionEmployee c, CommissionEmployee g) {
		super(fname, lname, ssn, grossSales, commissionRate);
		this.baseSalary = baseSalary;
		this.c = c;
		this.g = g;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPaymentAmount() {
		return  baseSalary+(c.getGrossSales()*c.getCommissionRate());
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + ", c=" + c + ", g=" + g
				+ ", getPaymentAmount()=" + getPaymentAmount() + "]";
	}
	
	
}
