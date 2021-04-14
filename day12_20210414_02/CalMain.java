package day12_20210414_02;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cal 클래스 객체 선언
		Cal call = new Cal();
		// 리턴이 없는 메소드 호출
		call.sum1(10, 20);
		// 리턴이 있는 메소드 호출
		int sum = call.sum2(10, 20);
		System.out.println(sum);
	
		
		
	}

}
