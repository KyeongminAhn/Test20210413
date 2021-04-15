package day12_20210414_03;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본생성자를 이용한 객체 선언
		Member mm1 = new Member();
		mm1.id = "akm";
		mm1.password = "a1234";
		mm1.name = "Kyeongmin Ahn";
		mm1.age = 30;
		// 호출하는 메소드의 리턴 유무 구분해 호출을 잘하자.
		mm1.info();
		
		mm1.update("변경이름");
		mm1.info();
		
		mm1.myName();
		String name1 = mm1.myName();
		System.out.println(mm1.myName());
		
		// 매개변수가 있는 생성자를 이용한 객체 선언
		Member mm2 = new Member("akm", "a1234", "Kyeongmin Ahn", 30);
		mm2.info();

	}

}
