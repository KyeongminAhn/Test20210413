package day12_20210414_03;

public class Member {
	// 필드선언
	String id, password, name;
	int age;
	// 생성자 선언
	Member() {

	}

	Member(String id, String password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		
	}
	// 메소드 선언 (리턴,매개변수 유무에 따라~)
	void info() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age);
	}
	// name을 매개변수로 받아서 그 값을 필드에 저장.
	void update(String name) {
		this.name = name;
	}
	
	String myName() {
		return this.name;
	}

}
