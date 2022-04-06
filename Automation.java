package week3.Day2;

public class Automation extends  MultiLanguage implements Language,TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Automation objCallMethod =new Automation();
	objCallMethod.ruby();
	objCallMethod.java();
	objCallMethod.selenium();
	
	
}

	@Override
	public void ruby() {
		System.out.println("Hello Ruby");
	}

	public void java() {
		System.out.println("Hello Java");
	}

	public void selenium() {
		System.out.println("Hello Selenium");
		
	}
}