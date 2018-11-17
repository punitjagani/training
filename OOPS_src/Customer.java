
public class Customer {
	
	private int custId;
	private String custName;
	private int creditLimit;
	
	private static int autogen=1001;
	
	public Customer() {
	}
	
	public Customer(String custName, int creditLimit) {
		this.custId = autogen++;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}

	public void printDetails() {
		System.out.println("Customer Id: " + custId);
		System.out.println("customer Name: " + custName);
		System.out.println("Customer CreditLimt: " + custId);
	}
}
