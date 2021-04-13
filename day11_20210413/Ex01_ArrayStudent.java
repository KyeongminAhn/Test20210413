package day11_20210413;

import java.util.Scanner;

public class Ex01_ArrayStudent {

	public static void main(String[] args) {
		/*
		 * 학생 수를 입력해야 다른 기능이 가능함. 입력한 학생 수만큼 점수 입력을 할 수 있음. 입력한 점수 출력. 입력한 점수의 최고값, 평균값
		 * 그리고 내림차순 정렬값 출력.
		 */

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int scores[] = null;

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("----------------------------------------------------");
			System.out.print("선택>");
			int selectNo = scan.nextInt();
			if (selectNo == 1) {
				System.out.print("학생수>");
				int studentNum = scan.nextInt(); // 학생수.
				scores = new int[studentNum];
			} else if (selectNo == 2) { // 학생점수.
				for (int i = 0; i < scores.length; i++) {
					System.out.print((i + 1) + "번 째 학생점수 : ");
					scores[i] = scan.nextInt();
				}
			} else if (selectNo == 3) { // 학생점수 출력.
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번 째 학생점수 : " + scores[i]);
				}
			} else if (selectNo == 4) { // 최대값, 평균값 내림차순 출력.
				int max = 0, sum = 0; // 최대값, 합산.
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + sum/scores.length); // double변수로 소수점까지 출력 가능.
				int temp; // 내림차순 정렬.
				for (int i = 0; i < scores.length; i++) {
					for (int j = i + 1; j < scores.length; j++) {
						if (scores[i] < scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;

						}

					}
				}
				// 정렬 후 배열 값 확인 (내림차순 정렬 결과 출력)
				for (int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}

			} else {
				run = false;
				System.out.println("종료");
			}
		}
	}

}
