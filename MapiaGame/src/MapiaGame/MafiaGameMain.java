package miniproject;

import java.util.Scanner;

public class MafiaGameMain {
	static String id = null;
	static long beforeTime = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("___  ___  ___  ______  _____   ___     _____   ___  ___  ___ _____ \r\n"
				+ "|  \\/  | / _ \\ |  ___||_   _| / _ \\   |  __ \\ / _ \\ |  \\/  ||  ___|\r\n"
				+ "| .  . |/ /_\\ \\| |_     | |  / /_\\ \\  | |  \\// /_\\ \\| .  . || |__  \r\n"
				+ "| |\\/| ||  _  ||  _|    | |  |  _  |  | | __ |  _  || |\\/| ||  __| \r\n"
				+ "| |  | || | | || |     _| |_ | | | |  | |_\\ \\| | | || |  | || |___ \r\n"
				+ "\\_|  |_/\\_| |_/\\_|     \\___/ \\_| |_/   \\____/\\_| |_/\\_|  |_/\\____/ \r\n"
				+ "                                                                   \r\n"
				+ "                                                                   \r\n");
		
		//ȸ������--------------------------------------------------------	
		
		joinMemberMain joinmembermain = new joinMemberMain();
		id = joinmembermain.main(args);
		
//		joinmembermain.join();
		
		//���ӽ���--------------------------------------------------------
		GameStart gamestart = new GameStart();
		
		beforeTime = gamestart.GameStart();
		
		
		//1��° ������� ��Ÿ����-------------------------------------------
		Day1 day1 = new Day1();
		day1.acinfo();
		
		//�κ�����---------------------------------------------------------
		Lobby lobby = new Lobby();
		
		long afterTime = lobby.main(args);
		
		
		
		

		
		
	}

}
