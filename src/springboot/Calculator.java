package springboot;

public class Calculator {
			
	public void add(int a, int b)
	{
		int result=a+b;
		System.out.println("Addition of two numbers is:"+result);
	}
	
	public void substraction (int a, int b) {
		int result=a-b;
		System.out.println("Substraction of two numbers is:"+result);
	}
	
	public void multiplication(int a ,int b) {
		int result=a*b;
		System.out.println("Multiplication of two numbers is:"+result);
	}

	public void divison(int a, int b) {
	int result=a/b;
	System.out.println("Division of two numbers is:"+result);
	}
	
	public void square(int a) {
		int result=a*a;
		System.out.println("Square of two numbers is:"+result);
	}
	
	public void cube(int a) {
		int result=a*a*a;
		System.out.println("Cube of number is:"+result);
	}
}


