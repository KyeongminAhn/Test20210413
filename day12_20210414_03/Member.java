package day12_20210414_03;

public class Member {

	String id, name;
	int password, age;

	Member() {

	}

	Member(String id, int password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		
	}

	void info() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age);
	}

	void update(String name) {
		name = "안경민";
		this.name = name;
		System.out.println(this.name);
	}
	
	String myName() {
		String mN = "안경민";
		return mN;
	}

}
