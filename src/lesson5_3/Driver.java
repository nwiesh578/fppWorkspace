package lesson5_3;

public class Driver {
	public static void main(String[] args) {
		
		Payable c = new CommissionEmployee("Joe","Doe","115",1000.0 ,15.0);
		Payable c1 = new CommissionEmployee("John","Wick","116",5000.0 ,25.0);
		Payable h =  new HourlyEmployee("Jane","Watson","117",5000.0, 12.0);
		Payable h1 =  new HourlyEmployee("Mark","Twain","118",2000.0, 15.0);
		Payable s = new SalariedEmployee("Shelly","Kane","119",6000.0);
		Payable i = new Invoice("1A","Book",4, 15.0);
		
		Payable[] p = {c,c1,h,h1,s,i};
		print(p);
	}
	
	public static void print(Payable[] p) {
		double totSal = 0.0;
		for(Payable pay : p) {
		  totSal = totSal+pay.getPaymentAmount();
		  System.out.println(pay);
		}
		System.out.println("The Total Salaries of all is : "+totSal);
		
		}
	}

/*	Output

	CommissionEmployee [grossSales=1000.0, commissionRate=15.0, getPaymentAmount()=15000.0]
	CommissionEmployee [grossSales=5000.0, commissionRate=25.0, getPaymentAmount()=125000.0]
	HourlyEmployee 	   [wage=5000.0, hours=12.0, getPaymentAmount()=60000.0]
	HourlyEmployee     [wage=2000.0, hours=15.0, getPaymentAmount()=30000.0]
	SalariedEmployee   [weeklySalary=6000.0, getPaymentAmount()=6000.0]
	Invoice            [partNumber=1A, partDescription=Book, quantity=4, pricePerItem=15.0]
	
	The Total Salaries of all is : 236060.0
*/	