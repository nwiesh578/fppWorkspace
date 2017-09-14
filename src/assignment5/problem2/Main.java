package assignment5.problem2;

/*import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0] = new Professor("Jane",6000.0,LocalDate.of(1990,1,1),3);
		department[1] = new Professor("Doe",4000.0,LocalDate.of(2000,2,10),2);
		department[2] = new Secretary("Malina",3000.0,LocalDate.of(2005,5,5),2.0);
		department[3] = new Secretary("Sally",2000.0,LocalDate.of(2008,8,10),4.0);
		department[4] = new Secretary("Mahira",2000.0,LocalDate.of(2009,11,28),5.0);
		double totSal = 0;
		
		for(DeptEmployee d : department) {
			for(int i=0; i<department.length;i++) {
				totSal = totSal + d.computeSalary();
				
			}
		}
			Scanner sn = new Scanner(System.in);
			System.out.println("Do you wish to see all the salaries ? y/n");
			String input = sn.next();
			
			switch(input) {
			
			case "y" :
					
				System.out.println("The total salaries : "+totSal);
				break;
				
			case "n" :
				
				System.out.println("It all ends here");
			}
					
		sn.close();
	}
}*/
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor professor1 = new Professor("John", 8000, LocalDate.of(1972, 8, 12), 4);
		Professor professor2 = new Professor("Wick", 4000, LocalDate.of(1990, 9, 8), 8);
		Professor professor3 = new Professor("Jordon", 6000, LocalDate.of(1998, 4, 20), 5);
		
		Secretary secretary1 = new Secretary("Suzy", 3000, LocalDate.of(2008, 2, 1), 5);
		Secretary secretary2 = new Secretary("Sally", 2000, LocalDate.of(2010, 9, 15), 10);
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0] = professor1;
		department[1] = professor2;
		department[2] = professor3;
		
		department[3] = secretary1;
		department[4] = secretary2;

		Scanner sn = new Scanner(System.in);
		System.out.println("Do you want to see the sum of all Professor salary, \nSum of all secretary salary and \nAll salaries in the department?");
		
		String res = sn.nextLine();
		Boolean dispRes = false;
		if(res.toLowerCase().equals("y")) {
			dispRes = true;
		display(department, dispRes);
		}
		else {
			dispRes = false;
			System.out.println("This is the end of program");
		}
		
		
		sn.close();
	}
	
	public static void display(DeptEmployee[] ob, Boolean dispRes){
		double sum = 0;
		String str;
		
		for(DeptEmployee d: ob) {
			str = d.getClass().getSimpleName();
			
			if(str.toLowerCase().equals("professor")) {
				System.out.println("Salary of Professor " + d.getName() + " is " + d.computeSalary());
			} else {
				System.out.println("Salary of Secretary " + d.getName() + " is " + d.computeSalary());
			}
			
			sum += d.computeSalary();
		}
		
		if(dispRes.equals(true)) {
			System.out.println("\nTotal salary of all: " + sum);
		}
	}

}

	/*Output

	Do you want to see the sum of all Professor salary, 
	Sum of all secretary salary and 
	All salaries in the department?
	
	y
	
	Salary of Professor John is 8000.0
	Salary of Professor Wick is 4000.0
	Salary of Professor Jordon is 6000.0
	Salary of Secretary Suzy is 3060.0
	Salary of Secretary Sally is 2120.0

	Total salary of all: 23180.0
	
	
	Do you want to see the sum of all Professor salary, 
	Sum of all secretary salary and 
	All salaries in the department?
	
	n
	
	This is the end of program*/