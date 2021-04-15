package day13_20210415_01;

public class Board {
	// 필드 선언
	int bNumber;
	String bTitle, bWriter, bContents;
	// 생성자 선언
	Board() {
		
	}
	
	Board(int bNumber, String bTitle, String bWriter, String bContents) {
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
	}
	// 메소드 선언
	void boardWrite(int bNumber, String bTitle, String bWriter, String bContents) {
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;	
	}
	
	void boardView() {
		System.out.println(this.bNumber);
		System.out.println(this.bTitle);
		System.out.println(this.bWriter);
		System.out.println(this.bContents);
	}
	
	void boardUpdate(String bTitle, String bContents) {
		this.bTitle = bTitle;
		this.bContents = bContents;
	}
}
