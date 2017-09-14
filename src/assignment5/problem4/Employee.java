package assignment5.problem4;

public abstract class Employee {
	private String fname;
	private String lname;
	private String ssn;
	
	public Employee(String fname, String lname, String ssn) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.ssn = ssn;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", ssn=" + ssn + "]";
	}
	
	
	
}
