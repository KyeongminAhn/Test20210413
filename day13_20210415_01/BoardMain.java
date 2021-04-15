package day13_20210415_01;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board bm = new Board();	
		
		bm.boardWrite(10, "제목", "작성자", "내용");
		bm.boardView();
		
		bm.boardUpdate("제목_new", "내용_new");
		bm.boardView();
		
	}

}
