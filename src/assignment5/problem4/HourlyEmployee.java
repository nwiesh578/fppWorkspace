package assignment5.problem4;

public class HourlyEmployee extends Employee implements Payable{
	
	private double wage;
	private double hours;
	
	public HourlyEmployee(String fname, String lname, String ssn, double wage, double hours) {
		super(fname, lname, ssn);
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}
	
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public double getHours() {
		return hours;
	}
	
	public void setHours(double hours) {
		 this.hours = hours;
	}
	
	@Override
	public double getPaymentAmount() {
		return   wage*hours ;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", getPaymentAmount()=" + getPaymentAmount() + "]";
	}
}
