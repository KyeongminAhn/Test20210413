package day12_20210414_01;

public class StudentMain {

	public static void main(String[] args) {
		// 기본생성자를 이용한 객체선언
		Student stu1 = new Student(); 
		stu1.name = "학생1";
		System.out.println(stu1.name);
		stu1.stuNum = 11;
		System.out.println(stu1.stuNum);
		
		// 매개변수가 있는 생성자를 이용한 객체(인스턴스) 선언
		Student stu2 = new Student("학생2", 12);
		// 변수 순서대로(String->int) 선언 
		System.out.println(stu2.name);
		System.out.println(stu2.stuNum);
		
		System.out.println("메소드 호출전");
		// fieldPirnt 메소드 호출
		stu1.fieldPrint();
		
		System.out.println("메소드 호출끝");
		
		stu2.fieldPrint();

		// 매개변수 있는 생성자 호출 (순서 체크)
		Student stu3 = new Student("학생3", 13);
		stu3.fieldPrint();
		
		// fieldPrint라는 메소드를 동일하게 호출하지만 앞에 객체에 따라 다른 값.
		// 서로 영향을 안줌.
		
		System.out.println("리턴있는 메소드 호출"); // 리턴값 활용을 위해 사용.
		// 리턴이 있는 메소드를 호출할 때는 호출만하고 끝나는 것이 아니라
		// 리턴값을 활용하는 내용이 필요
		
		stu1.numberMethod();
		
		int aa = 0;
		System.out.println(aa); // 메소드 호출전
		aa = stu1.numberMethod();
		System.out.println(aa); // 메소드 호출후
		
		System.out.println(stu2.numberMethod());
		// print문 안에 쓰는 건 가능.
		
		System.out.println("String 메소드호출");
	
		String bb = stu3.stringMethod(); // 변수 이용한거.
		System.out.println(bb);
		
		System.out.println(stu3.stringMethod()); // print문 안에 쓴거.
		
		// 매개변수 있는 메소드 이용, 생성자 선언
		Student stu4 = new Student();
		int cc = stu4.numberMethod2(30);
		System.out.println(cc); // cc? -- 40
		
		int number1 = 50;
		cc = stu4.numberMethod2(number1);
		System.out.println(cc); // cc? -- 60
		
		
		
		
		

	}

}
