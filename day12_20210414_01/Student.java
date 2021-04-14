package day12_20210414_01;

public class Student {
	// 필드
	String name;
	// 학번 ex)0012345 ←int로 할 경우, 00을 무시하고 출력.
	int stuNum;
	
	// 생성자를 아무것도 쓰지 않으면 기본생성자를 쓸 수 있지만
	// 기본생성자 형태가 아닌 생성자(ex매개변수생성자)를 정의하면 기본생성자를 쓸 수 없음.
	// 기본생성자를 쓰고 싶다면 따로 정의를 해줘야 함.
	
	// 기본생성자 선언(생성자의 이름 = 클래스 이름)
	Student() {
		System.out.println("기본생성자 호출");
	}
	// 매개변수가 있는 생성자 선언
	Student(String name, int stuNum) {
		System.out.println("매개변수 있는 생성자 호출");
		this.name = name;
		this.stuNum = stuNum;
	} // 매개변수가 있으면 호출하고자 하는 대상에서 넘겨받아 넘겨받은 값을 활용.


	// 메소드 선언
	// 리턴이 없는 메소드 선언
	// 리턴? : 메소드가 선언한 기능을 실행 후 결과값. 리턴유무 체크.
	/*
	 * 리턴타입 void : 리턴이 없다는 표현
	 * 메소드이름 : fieldPrint / 소문자로 시작, 두 단어 이상일때 뒤에 대문자.
	 * 				▲변수이름 짓는 규칙을 따름.
	 * 매개변수 : 없음
	 */
	void fieldPrint() {
		System.out.println("메소드 호출됨");
		System.out.println(this.name);
		System.out.println(this.stuNum);
	}

	// 리턴이 있는 메소드 선언
	/*
	 * 리턴타입 int : 리턴되는 값이 int
	 * 메소드이름 : numberMethod
	 * 매개변수 : 없음
	 */
	int numberMethod() {
		int num = 10; // 정수형변수
		// class안에서 선언하는 건 필드로 인식, 특정 메소드 안 선언 = 변수
		return num; // num변수가 가진 값을 리턴해줌.
	}
	/*
	 * 리턴타입 String : 리턴되는 값이 String
	 * 메소드이름 : stringMethod
	 * 매개변수 : 없음
	 */
	String stringMethod() {
		String val = "리턴값";
		return val;
	}
	
	
	// 매개변수가 있는 메소드
	int numberMethod2(int num1) {
		int num2 = 10;
		int sum = num1 + num2;
		return sum;
	}
	// void제외, 특정타입을 쓰면 특정타입값에 대한 retun문이 블록 안에 있어야 한다.
	// 			int를 썼으면 return문에 int타입이 와야~ / ""(x-타입mismatch)


}