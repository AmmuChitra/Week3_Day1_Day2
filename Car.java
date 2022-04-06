package week3.Day1;

public class Car extends Vehicle {
	public void ABS() {
		System.out.println("ABS");
	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.ABS();
		obj.applybreak();
		obj.soundHorn();
		
	}

}
