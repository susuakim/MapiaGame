package miniproject;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class joinMemberMain {

	public static String main(String[] args) {
		String id = null;
		Scanner sc = new Scanner(System.in);
		joinMemberDAO dao = new joinMemberDAO();
		MP3Player mp3 = new MP3Player();
		mp3.play(".\\music\\playCatch.mp3");
		
		while (true) {
			System.out.println("=================================================================");
			System.out.println("♥ 게임을 시작하기 전 회원가입을 완료해주세요. 회원가입을 완료했다면 로그인을 해주세요! ♥");
			System.out.print("[1]회원가입 [2]로그인 [3]회원탈퇴 [4]나가기>> ");
			
			int menu = sc.nextInt();
			System.out.println("=================================================================");

			if (menu == 1) {
				join();
				break;

			} else if (menu == 2) {
				System.out.print("로그인을 위한 ID를 입력하세요. >> ");
				String input_id = sc.next();
				System.out.print("로그인을 위한 PW를 입력하세요. >> ");
				String input_pw = sc.next();
				joinMemberDTO dto = new joinMemberDTO(input_id, input_pw);
//				dao.login(dto);

				id = dao.login(dto);
				
				
				System.out.println("=================================================================");
				break;
			} else if (menu == 3) {
				dao.delete();
				System.out.println("=================================================================");
			} else if (menu == 4) {
				System.out.println("종료 되었습니다.");
				System.out.println("=================================================================");
				break;
			}else {
				System.out.println("메뉴를 잘못 입력하셨습니다. ");
			}
			break;
		}
		
		return id;

	}

	public static void join() {
		Scanner sc = new Scanner(System.in);
		String id = null;
		System.out.println("                              회원가입                              ");
		System.out.println("=================================================================");

		while (true) {
			System.out.print("ID를 입력하세요 >> ");
			id = sc.next();
			System.out.print("PW를 입력하세요 >> ");
			String user_pw = sc.next();
			System.out.print("이름을 입력하세요 >> ");
			String user_name = sc.next();
			joinMemberDTO dto = new joinMemberDTO(id, user_pw, user_name);
			joinMemberDAO dao = new joinMemberDAO();
			int cnt = dao.insert(dto);

			if (cnt > 0) {
				System.out.println(user_name + "님 회원가입 완료되었습니다!");
				System.out.println();
				break;
			} else {
				System.out.println("ID를 중복 입력하셨습니다. 다시 입력해주세요.");
			    System.out.println();
			}
		}
	}
	
	
	
		
	
	

}
