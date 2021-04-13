package day11_20210413_01;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PeopleMain 클래스에서 People 클래스를 객체로 만들어 활용.
//		String name; // 필드와 변수는 표현색이 다르나 목적은 같다.
		
		// People 클래스 객체 선언
		
		// ▲객체로 만들 클래스명
		People p = new People(); // ◀People 클래스 객체 선언
//			   ▼현재 파일에서 쓸 객체명	
//						▼해당클래스가 가지고 있는 생성자
//						 해당클래스가 별도 생성자 정의하고 있지 않다면 기본생성자(People)를 사용.		
		
		// 객체로 선언한 클래스가 가지고 있는 자원(필드, 메소드) 활용
		// People 클래스가 가지고 있는 필드에 값 저장 및 출력.
		p.name = "이름1";
		p.age = 10;
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.nation);
		p.nation = "미국";
		System.out.println(p.nation); // 물론 새로 입력 가능.
		
		People p1 = new People();
		p1.name = "이름2";
		System.out.println(p1.name);
		
		People p2 = new People();
		p2.name = "이름3";
		System.out.println(p2.name); // 객체는 여러개 선언이 가능.
		
		// 매개변수가 있는 생성자를 이용한 객체(인스턴스) 생성
		People p3 = new People("이름4", 30);
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.nation); // nation에 대한 언급이 없기에 null.
		p3.nation = "캐나다";
		System.out.println(p3.nation);
		p3.name = "이름4 변경";
		p3.age =  100;
		System.out.println(p3.name);
		System.out.println(p3.age); // 필드값 새로 입력 가능.
		
				
		
	}

}
