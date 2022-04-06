package week3.Day2;

public class Desktop implements Hardware,Software {

	public void desktopModels() {
		
		System.out.println("Desktip");
	}
	
	
	public void hardwareResources() {
		
		System.out.println("Hardware");
	}
	public void softwareResources() {
		
		System.out.println("Software");
		
	}
	public static void main(String[] args) {
		
	     Desktop obj = new Desktop();
	     obj.desktopModels();
	     obj.hardwareResources();
	     obj.softwareResources();

		}
}
