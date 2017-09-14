package assignment5.problem4;

public class CommissionEmployee extends Employee implements Payable{
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String fname, String lname, String ssn, double grossSales, double commissionRate) {
		super(fname, lname, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	@Override
	public double getPaymentAmount() {
		return grossSales*commissionRate;
	}
	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate
				+ ", getPaymentAmount()=" + getPaymentAmount() + "]";
	}
	
}
