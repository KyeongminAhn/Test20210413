package day13_20210415_03;

import java.util.Scanner;
import java.util.*;

public class Ex02_ArrayListEx {

	public static void main(String[] args) {
		/*
		 * ArrayList에 영어로 된 단어 5개를 스캐너로 입력받고
		 * 입력받은 단어를 모두 출력하고
		 * 마지막에는 가장 긴 단어를 출력하세요.
		 */

		List<String> list = new ArrayList<String>();
		
		String var1 = "water";
		System.out.println(var1.length());
		Scanner scan = new Scanner(System.in);
		String voca = "";
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print("단어를 입력하세요 : " + voca);
			voca = scan.nextLine();
			System.out.print(voca);
		}
		
		
		
		
	}

}
