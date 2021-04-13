package day11_20210413;

import java.util.Scanner;

public class Ex01_ArrayStudent2 {

	public static void main(String[] args) {
		/*
		 * 학생 수를 입력해야 다른 기능이 가능함. 입력한 학생 수만큼 점수 입력을 할 수 있음. 입력한 점수 출력. 입력한 점수의 최고값, 평균값
		 * 그리고 내림차순 정렬값 출력.
		 */

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int scores[] = null; // scores 라는 배열 이름만 선언
		int max = 0; // 최고점수
		int sum = 0; // 합산

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("----------------------------------------------------");
			System.out.print("선택>");
			int selectNo = scan.nextInt();
			
			// int[] scores = new int[studentNum]; // 선택창이 뜰 때마다 배열은 새롭게 선언됨.
			
			if (selectNo == 1) {
				System.out.print("학생수>");
				int studentNum = scan.nextInt(); // 학생수
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				// 배열에 데이터 저장
				for (int i = 0; i < scores.length; i++) {
					System.out.print((i + 1) + "번 째 학생점수 : ");
					scores[i] = scan.nextInt();
				}
			} else if (selectNo == 3) {
				// 배열에 저장된 데이터 출력
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번 째 학생점수 : " + scores[i]);
				}
			} else if (selectNo == 4) {
				// 최대값, 평균값, 내림차순 정렬
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = sum / scores.length;
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
				int temp; // 내림차순 정렬
				for (int i = 0; i < scores.length; i++) {
					for (int j = i + 1; j < scores.length; j++) {
						if (scores[i] < scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;

						}

					}
				}
				// 내림차순 정렬 결과 출력
				for (int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}

			} else if(selectNo == 5) {
				run = false;
				System.out.println("종료");
			}
		}
	}

}