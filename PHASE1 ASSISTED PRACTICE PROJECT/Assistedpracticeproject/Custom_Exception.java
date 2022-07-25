package Assistedpracticeproject1;

import java.util.Scanner;

class BankValueException extends Exception {
	@Override
	public String toString() {
		return "Bankballance is not suficient enough to make the withddrawal";
	}
}

public class Custom_Exception {
	static void validate() throws BankValueException {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the amount:");
		int amount = a.nextInt();
		if (amount > 1000) {
			throw new BankValueException();
		} else {
			System.out.println("withdraw is successfull");
		}
	}

	public static void main(String[] args) {
		try {
			validate();
		} catch (BankValueException e) {
			System.out.println(e);
		}
	}
}