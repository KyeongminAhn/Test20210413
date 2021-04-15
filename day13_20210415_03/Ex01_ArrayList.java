package day13_20210415_03;

import java.util.*;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList
		/*
		 * Collection Framework : List, Set, Map
		 */
		// ArrayList 선언(저장데이터 타입 : String)
		List<String> list = new ArrayList<String>();
//			 ▲타입	 ▲객체						▲타입		
		// list 에 데이터 저장 : add 메소드 호출
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add(1, "네번째"); // 기존의 index값 밀어내기(새치기) 가능.
		list.add(1, "다섯번째");
//		배열은 사이즈를 지정한 내에서, list는 넣으면 넣는대로 무한대~
				
		// list에 담긴 데이터 출력
		System.out.println(list.get(0));
		// 알아서 꺼내주니 index번호만 알면 된다.
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	
		// list 크기 확인
		System.out.println(list.size());
		
		// list 데이터 삭제
		list.remove(1);
		System.out.println(list.get(1));
		
		// for문을 이용, list에 담긴 모든 데이터 출력.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// list에 정수를 저장할때
		List<Integer> list1 = new ArrayList<Integer>(); // Wrapper Class; generic에선 int를 감싸는 Integer 클래스를 선언해야 한다.
		
		
		
		
		
		
	}

}
