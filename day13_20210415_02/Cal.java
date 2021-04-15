package day13_20210415_02;

import java.util.Scanner;

public class Cal {


	// + 메소드
	void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}

	// - 메소드
	void sub(int num1, int num2) {
		int sub = num1 - num2;
		System.out.print(sub);
	}

	// * 메소드
	int mul(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}

	// / 메소드
	int divi() {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1: ");
		int num1 = scan.nextInt();
		System.out.print("숫자2: ");
		int num2 = scan.nextInt();
		int divi = num1 / num2;
		return divi;
	}

}
