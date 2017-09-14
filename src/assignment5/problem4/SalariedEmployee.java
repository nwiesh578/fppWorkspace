package assignment5.problem4;

public class SalariedEmployee extends Employee implements Payable{
	private double weeklySalary;
	
	public SalariedEmployee(String fname, String lname, String ssn, double weeklySalary) {
		super(fname, lname, ssn);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public void setWeeklySalary(double weeklySalary) {
		 this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double getPaymentAmount() {
		return  weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + ", getPaymentAmount()=" + getPaymentAmount() + "]";
	}

}
