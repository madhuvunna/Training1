package springboot;

import java.io.IOException;

public class TypingClass {
	public static int data() throws IOException {
		System.out.println("\n data for Numerical Operations: ");
		System.out.println("1. Add\n"
				+ "2. Subtract\n3. Multiply\n4. Divide\n5. Square\n6. Cube");
		System.out.print("Enter your option: ");
		int p = MainClass.readInteger();
		return p;
	}
}
