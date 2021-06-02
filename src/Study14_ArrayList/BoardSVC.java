package Study14_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {

	ArrayList<BoardVO> boardList = new ArrayList<BoardVO>();

	// 1.기본생성자
	public BoardSVC() {
		
		
	}

	// 2.글 입력
	public void writeArticle(Scanner sc) {
		System.out.println("[게시판 글을 작성하세요]");

		System.out.println("작성자: ");
		String register = sc.next();
		System.out.println("이메일: ");
		String email = sc.next();
		System.out.println("비밀번호: ");
		String passwd = sc.next();
		System.out.println("제목: ");
		String subject = sc.next();
		System.out.println("글내용: ");
		String content = sc.next();

		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);

		addArticle(boardVO);

	}

	// 3. 입력 내용을 ArrayList에 넣기
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);

	}

	// 4. 글 목록 보기
	public void listArticles(Scanner sc) {

		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i));
			}

		} else
			System.out.println("등록된 글이 없습니다.");

	}

	// 5. 글삭제
	public void removeArticle(Scanner sc) {

		System.out.println("[제거할 글의 작성자와 비밀번호를 입력하세요.]");
		System.out.println("작성자: ");
		String register = sc.next();
		System.out.println("비밀번호: ");
		String passwd = sc.next();
		removeArticle(register, passwd);
	}

	// 6. 글 삭제 동작

	public void removeArticle(String register, String passwd) {

		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).getRegister().equals(register)) {
					if (boardList.get(i).getPasswd().equals(passwd)) {
						boardList.remove(boardList.get(i));
					} else {
						System.out.println("비밀번호가 틀립니다,");
					}
				} else {
					System.out.println("작성자가 존재하지 않습니다.");
				}

			}

		}

	}

}
