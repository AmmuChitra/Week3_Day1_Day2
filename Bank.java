package week3.Day2;

public class Bank {
	
public void savingAccount(int interest, String name) {
		
		
		System.out.println("6% interest");
	}
	
	public void fixedDeposit() {
		
		System.out.println("8% interest");

	}
	
	public static void main(String[] args) {
		
		Bank obj = new Bank();
		obj.savingAccount(0, null);
		obj.fixedDeposit();
		

	}

}
