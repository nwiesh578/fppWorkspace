package lesson5_1;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	int numberOfPublications;

	public Professor(String name, double salary, LocalDate hiredate, int numberOfPublications) {
		super(name, salary, hiredate);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	/*@Override
	public double computeSalary() {
		return salary;
	}*/
}
