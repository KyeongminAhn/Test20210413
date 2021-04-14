package day12_20210414_03;

public class Member_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본생성자를 이용한 객체 선언 (3)
		Member mm1 = new Member();
		mm1.id = "akm";
		mm1.password = 1234;
		mm1.name = "Kyeongmin Ahn";
		mm1.age = 30;
		
		mm1.info();
		
		Member up1 = new Member();
		up1.update("");
		
		Member mN1 = new Member();
		System.out.println(mN1.myName());
		
		//매개변수가 있는 생성자를 이용한 객체 선언 (3)
		Member mm2 = new Member("akm", 1234, "Kyeongmin Ahn", 30);
		System.out.println(mm2.id);
		System.out.println(mm2.password);
		System.out.println(mm2.name);
		System.out.println(mm2.age);
		
		Member up2 = new Member();
		String aa = up2.name();
		
		Member mN2 = new Member();
		

	}

}
