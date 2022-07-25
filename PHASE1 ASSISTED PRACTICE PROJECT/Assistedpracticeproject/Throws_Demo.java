package Assistedpracticeproject1;

public class Throws_Demo {
	void Division() throws ArithmeticException {
		int a = 45, b = 0, c;
		c = a / b;
		System.out.println("The result is : " + c);
	}

	public static void main(String[] args) {
		Throws_Demo T = new Throws_Demo();
		try {
			T.Division();
		} catch (ArithmeticException Ex) {
			System.out.println("Error : " + Ex.getMessage());
		}
		System.out.println("End of program.");
	}
}
