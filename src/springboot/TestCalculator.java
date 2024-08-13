package springboot;

import java.io.IOException;

public class TestCalculator {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter 1st number");
		int num1 = MainClass.readInteger();

		System.out.println("Enter 2nd number");
		int num2 = MainClass.readInteger();

		int p = TypingClass.data();

		Calculator cal = new Calculator();

		if (p == 1) {
			cal.add(num1, num2);
		} else if (p == 2) {
			cal.substraction(num1, num2);
		} else if (p == 3) {
			cal.multiplication(num1, num2);
		} else if (p == 4) {
			cal.divison(num1, num2);
		} else if (p == 5) {
			cal.square(num2);
		} else if (p == 6) {
			cal.cube(num1);
		} else {
			System.out.println("Please enter valid number ");
			TypingClass.data();
		}

	}
}
