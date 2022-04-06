package week3.Day2;

public class LearnOverLoading {
	
	public void add(int a,int b) {
		
		System.out.println(a+b);
		
	}
public void add(int c,double d) {
	
	System.out.println(c+d);
	
}
public void StudentDetails(String name,int Id, int regnum) {
	
	System.out.println(name+Id+regnum);
}
public void StudentDetail(String School,short age, int num) {
	
	System.out.println(School+age+num);
	
}
	public static void main(String[] args) {
		// creating the object
		
		LearnOverLoading overLoad = new LearnOverLoading();
		overLoad.add(2, 2);
		overLoad.add(5, 6);
		overLoad.StudentDetails("Chitra", 254, 12345);
		overLoad.StudentDetails("Acs", 31, 456);
				

	}

}
