package miniproject;

import java.util.Scanner;

public class MinigameMain {

	public static void main(String[] args) {
		Minigame game = new Minigame();
		Scanner sc = new Scanner(System.in);
		System.out.print("�١١����� ȹ���� ���� �̴ϰ����� �����մϴ�!  ");
		System.out.println("�̴ϰ����� ���̵��� �����ϼ���!�١١�");
		System.out.println("�����ǡ� ���̵��� �������� �� �������� ���Ÿ� ȹ���Ͻ� �� �ֽ��ϴ�!");
		System.out.println("-------------------------------------------------------------");
		System.out.print("[1]level 1 \n"
				+ "[2]level 2 \n"
				+ "[3]level 3 \n"
				+ "[4]level 4 \n"
				+ "[5]level 5 \n");
		System.out.print("[��0��]SpecialGame(0����) \n");
		System.out.print("level ���� >> ");

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
			}else System.out.print("��ȣ�� �ٽ� �Է��ϼ���! >> ");
		}
			
			
		

	}

}
