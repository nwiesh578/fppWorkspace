package lesson3;

public class Main {

	public static void main(String[] args) {
	
		Customer[] customerArr = new Customer[3];
		Customer customer1 = new Customer();
		Address addr1 = new Address();
		Customer customer2 = new Customer();
		Address addr2 = new Address();
		Customer customer3 = new Customer();
		Address addr3 = new Address();


		addr1.setCity("city1");
		addr1.setState("state1");
		addr1.setStreet("street1");
			
		
		customer1.setFirstName("Robert");
		customer1.setLastName("Downy Jr.");
		customer1.setSocSecurityNum("0001");
		customer1.setBillingAddress(addr1);
		customer1.setShippingAddress(addr1);
		
		addr2.setCity("Chicago");
		addr2.setState("state1");
		addr2.setStreet("street2");		
				
		customer2.setFirstName("Emma");
		customer2.setLastName("Watson");
		customer2.setSocSecurityNum("0002");
		customer2.setBillingAddress(addr2);
		customer2.setShippingAddress(addr2);
		
		addr3.setCity("Chicago");
		addr3.setState("state1");
		addr3.setStreet("street3");
		
		customer3.setFirstName("Jack");
		customer3.setLastName("Brown");
		customer3.setSocSecurityNum("0003");
		customer3.setBillingAddress(addr3);
		customer3.setShippingAddress(addr3);	
		
		customerArr[0]= customer1;
		customerArr[1]= customer2;
		customerArr[2]= customer3;
	
	
	for(Customer c:customerArr) {
		if(c.getBillingAddress().getCity().equals("Chicago")) {
			System.out.println(c.toString());
			}
		}
	}
}