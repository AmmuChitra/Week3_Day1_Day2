package week3.Day2;

public class Calculator
{
	
public void add(int a,int b)
{
	System.out.println(a+b);
}
public void add(int a,int b,int c) 
{
	System.out.println(a+b+c);
}
public void multiple(int i,int j) 
{
	System.out.println(i*j);

}

public void multiple(int a,double b)
{
	
	System.out.println(a*b);
	
}
public void sub(int l,int m)
{
	
	System.out.println(l-m);
	
}
public void sub(double a,double b)
{
	
	System.out.println(a-b);
}

public void divide(int i,int j) 
{
	
	System.out.println(i%j);
}
public void didvide(double c,double d) {
	
	System.out.println(c%d);
}
	public static void main(String[] args) {
	
		Calculator obj=new Calculator();
		obj.add(2, 5);
		obj.add(3, 4, 6);
		obj.multiple(2, 6);
		obj.multiple(3, 4);
		obj.sub(2, 2);
		obj.sub(3, 2);
		obj.divide(4, 2);
		obj.didvide(4, 6);
		
	}

}
