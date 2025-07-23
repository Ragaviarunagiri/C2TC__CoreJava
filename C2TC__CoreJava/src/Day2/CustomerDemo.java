package Day2;

public class CustomerDemo {
	public static  void main(String[] args) {
		 Customer cus1 = new Customer();
		 Customer cus2 = new Customer(41,"Ragavi","pondicherry");
		 Customer cus3 = new Customer(21,"thamizh");
		
		 //cus1.setId(41);
		 cus2.setId(62);
		// cus1.setName("Ragavi");
		 cus2.setName("keshu");
		// cus1.setCity("Pondicherry");
		 System.out.println(cus1);
		 System.out.println(cus2);
		 System.out.println(cus3);
		 System.out.println("Customer 1 city : " + cus1.getCity() + " Customer 1 name : " + cus2.getName() );
		 
	}



}
