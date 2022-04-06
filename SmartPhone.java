package week3.Day2;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsapp() 
	{
		System.out.println("Hello Guys");
	}
	public static void main(String[] args) {
		
		
		SmartPhone obj=new SmartPhone();
		obj.sendMsg();
		obj.connectWhatsapp();
		obj.makeCall();
		obj.natakeVideo();
		obj.saveContact();
	}

}
