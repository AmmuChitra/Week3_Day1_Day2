package week3.Day2;

public class AxisBank extends Bank {

	public void savingAccount(int interest,String name) {
		
		
		System.out.println("5% interest");
	}
	
	public void fixedDeposit() {
		
		System.out.println("7% interest");
	}
	public void gst() {
		System.out.println("5% gst");
		
	}
	public static void main(String[] args) {
		
		AxisBank bank =new AxisBank();
		bank.savingAccount(0, null);
		bank.fixedDeposit();
		bank.gst();
		

	}

}
