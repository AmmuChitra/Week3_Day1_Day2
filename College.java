package week3.Day2;

public class College  extends University{

	public static void main(String[] args) {
		
College obj=new College();
obj.pg();
	}

	@Override
	public void ug() {
		System.out.println("Under Graduate");
	}

}
