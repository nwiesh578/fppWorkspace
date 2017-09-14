package assignment5.problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	double overTimeHours;

	public Secretary(String name, double salary, LocalDate hiredate, double overTimeHours) {
		super(name, salary, hiredate);
		this.overTimeHours = overTimeHours;
	}

	public double getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(double overTimeHours) {
		this.overTimeHours = overTimeHours;
	}

	@Override
	public double computeSalary() {
		return salary+12*overTimeHours;
	}
	
	
}
