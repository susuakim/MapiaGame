package miniproject;

import java.util.Scanner;

public class MinigameMain {

	public static void main(String[] args) {
		Minigame game = new Minigame();
		Scanner sc = new Scanner(System.in);
		System.out.print("☆☆☆증거 획득을 위한 미니게임을 시작합니다!  ");
		System.out.println("미니게임의 난이도를 선택하세요!☆☆☆");
		System.out.println("※주의※ 난이도가 높을수록 더 결정적인 증거를 획득하실 수 있습니다!");
		System.out.println("-------------------------------------------------------------");
		System.out.print("[1]level 1 \n"
				+ "[2]level 2 \n"
				+ "[3]level 3 \n"
				+ "[4]level 4 \n"
				+ "[5]level 5 \n");
		System.out.print("[★0★]SpecialGame(0선택) \n");
		System.out.print("level 선택 >> ");

		while(true) {
			int level_choice = sc.nextInt();
			if(level_choice == 1) {
				game.level1();
			}else if(level_choice == 2) {
				game.level2();
			}else if(level_choice == 3) {
				game.level3();
			}else if(level_choice == 4) {
				game.level4();
			}else if(level_choice == 5) {
				game.level5();
			}else if(level_choice == 0) {
				game.rspGame();
			}else System.out.print("번호를 다시 입력하세요! >> ");
		}
			
			
		

	}

}
