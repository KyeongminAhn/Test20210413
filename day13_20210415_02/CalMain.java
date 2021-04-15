package day13_20210415_02;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		Cal cal = new Cal();
		while (run) {
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5. 종료");
			System.out.print("선택>");
			int selectNo = scan.nextInt();
			int num1 = 0, num2 = 0;

			if (selectNo == 1) {
				num1 = 10; 
				num2 = 20;
				cal.sum(num1, num2);
			} else if (selectNo == 2) {
				System.out.print("숫자1: ");
				num1 = scan.nextInt();
				System.out.print("숫자2: ");
				num2 = scan.nextInt();
				cal.sub(num1, num2);
			} else if (selectNo == 3) {
				System.out.print("숫자1: ");
				num1 = scan.nextInt();
				System.out.print("숫자2: ");
				num2 = scan.nextInt();
				int result = cal.mul(num1, num2);
				System.out.println(result);
			} else if (selectNo == 4) {
				int result = cal.divi();
				System.out.println(result);
			} else if (selectNo == 5) {
				System.out.println("종료");
				run = false;
			} else {
				
			}

		}

	}

}
