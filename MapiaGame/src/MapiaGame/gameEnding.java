package miniproject;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class gameEnding {
	MP3Player mp3 = new MP3Player();
	Scanner sc = new Scanner(System.in);
	// ���Ǿ� �˰� ���� ��
	public void win() {
		mp3.play(".\\music\\goodEnding.mp3");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("\r\n"
				+ " __      __     ______      __  __     \r\n"
				+ "/\\ \\  __/\\ \\   /\\__  _\\    /\\ \\/\\ \\    \r\n"
				+ "\\ \\ \\/\\ \\ \\ \\  \\/_/\\ \\/    \\ \\ `\\\\ \\   \r\n"
				+ " \\ \\ \\ \\ \\ \\ \\    \\ \\ \\     \\ \\ , ` \\  \r\n"
				+ "  \\ \\ \\_/ \\_\\ \\    \\_\\ \\__   \\ \\ \\`\\ \\ \r\n"
				+ "   \\ `\\___x___/    /\\_____\\   \\ \\_\\ \\_\\\r\n"
				+ "    '\\/__//__/     \\/_____/    \\/_/\\/_/\r\n"
				+ "");		
		System.out.println("\r\n"
				+ "         ,    --                                  \r\n"
				+ "         -,   --                                  \r\n"
				+ "        --,  ---    -                             \r\n"
				+ "        --,  ---   ,-,                            \r\n"
				+ "     -- --,  ---   --.                 ,,         \r\n"
				+ "     -- --,  --.  ---                  --         \r\n"
				+ "     -- --, ,--.  --.             .    --    .    \r\n"
				+ "     -- --, ---  ---             --   .--   --    \r\n"
				+ "     -- --- --- .---             --,  .--   --    \r\n"
				+ "     --.---.--- ---.             ,--  .--   --    \r\n"
				+ "     --,------ .---              .--   --.  --  , \r\n"
				+ "     --------- ----               --   --- .-- ,- \r\n"
				+ "     -------------                ---  --- .-- -- \r\n"
				+ "     -------------                ---  --- --- -- \r\n"
				+ "     ------------,    .--,        .--, --- --..-- \r\n"
				+ "     ------------,   ----         .--- --- -- ,-, \r\n"
				+ "     ,-----------, .---,           ---.---,-- --, \r\n"
				+ "     ,----------------,            ----------,--  \r\n"
				+ "     ,----------------     ---,    -------------  \r\n"
				+ "      ---------------       ,--,   -------------  \r\n"
				+ "      --------------         ,--,  ------------,  \r\n"
				+ "      -------------           ----.------------.  \r\n"
				+ "      ------------            .----------------   \r\n"
				+ "      ----------.              ----------------   \r\n"
				+ "    ,$@@$;----,                 ---------------   \r\n"
				+ "   @@@@@@@@:--                  ,-------------    \r\n"
				+ "  @@!----!@@-                    -------------    \r\n"
				+ " .@=------~@=                     ,-----------    \r\n"
				+ " !@,-------@@                      ----------.    \r\n"
				+ "  @~-------@@@@@@@                  .--------.    \r\n"
				+ "  *--------@=    @@@@@$               ,--------    \r\n"
				+ "  ,-------*@-   @;    @ ~@            --;@@@@@~   \r\n"
				+ "  --------* @@@,@=    -@  $@- ,,      ,@@@=~=@@~  \r\n"
				+ " ,--------      @     @=    =@. @     #@;-----@@  \r\n"
				+ " --------,      .@=  .@.    @:   @*@.,@$------!@  \r\n"
				+ ",:-------         @@@@ @~   @    @..:@@--------@  \r\n"
				+ ".--------               @* ~@   $@   #@~-------@  \r\n"
				+ " -------,                .@@ @.#@:   =@*-------.  \r\n"
				+ "    ----                      @  @@@#@@@-------,  \r\n"
				+ "      --                              .@--------  \r\n"
				+ "                                        --------  \r\n"
				+ "                                         -------, \r\n"
				+ "                                           -----, \r\n"
				+ "                                                  \r\n"
				+ "");
		
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		ask();
	}
	// ���Ǿ� �˰� ���� ��
	public void lose() {
		mp3.play(".\\music\\badEnding.mp3");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("\r\n"
				+ "                                                                                                                                                                                                                                       \r\n"
				+ "                                                                                                                                                                                                                                       \r\n"
				+ "  MMMMMMMM               MMMMMMMM               AAA               FFFFFFFFFFFFFFFFFFFFFFIIIIIIIIII               AAA                                WWWWWWWW                           WWWWWWWWIIIIIIIIIINNNNNNNN        NNNNNNNN  \r\n"
				+ "  M:::::::M             M:::::::M              A:::A              F::::::::::::::::::::FI::::::::I              A:::A                               W::::::W                           W::::::WI::::::::IN:::::::N       N::::::N  \r\n"
				+ "  M::::::::M           M::::::::M             A:::::A             F::::::::::::::::::::FI::::::::I             A:::::A                              W::::::W                           W::::::WI::::::::IN::::::::N      N::::::N  \r\n"
				+ "  M:::::::::M         M:::::::::M            A:::::::A            FF::::::FFFFFFFFF::::FII::::::II            A:::::::A                             W::::::W                           W::::::WII::::::IIN:::::::::N     N::::::N  \r\n"
				+ "  M::::::::::M       M::::::::::M           A:::::::::A             F:::::F       FFFFFF  I::::I             A:::::::::A                             W:::::W           WWWWW           W:::::W   I::::I  N::::::::::N    N::::::N  \r\n"
				+ "  M:::::::::::M     M:::::::::::M          A:::::A:::::A            F:::::F               I::::I            A:::::A:::::A                             W:::::W         W:::::W         W:::::W    I::::I  N:::::::::::N   N::::::N  \r\n"
				+ "  M:::::::M::::M   M::::M:::::::M         A:::::A A:::::A           F::::::FFFFFFFFFF     I::::I           A:::::A A:::::A                             W:::::W       W:::::::W       W:::::W     I::::I  N:::::::N::::N  N::::::N  \r\n"
				+ "  M::::::M M::::M M::::M M::::::M        A:::::A   A:::::A          F:::::::::::::::F     I::::I          A:::::A   A:::::A                             W:::::W     W:::::::::W     W:::::W      I::::I  N::::::N N::::N N::::::N  \r\n"
				+ "  M::::::M  M::::M::::M  M::::::M       A:::::A     A:::::A         F:::::::::::::::F     I::::I         A:::::A     A:::::A                             W:::::W   W:::::W:::::W   W:::::W       I::::I  N::::::N  N::::N:::::::N  \r\n"
				+ "  M::::::M   M:::::::M   M::::::M      A:::::AAAAAAAAA:::::A        F::::::FFFFFFFFFF     I::::I        A:::::AAAAAAAAA:::::A                             W:::::W W:::::W W:::::W W:::::W        I::::I  N::::::N   N:::::::::::N  \r\n"
				+ "  M::::::M    M:::::M    M::::::M     A:::::::::::::::::::::A       F:::::F               I::::I       A:::::::::::::::::::::A                             W:::::W:::::W   W:::::W:::::W         I::::I  N::::::N    N::::::::::N  \r\n"
				+ "  M::::::M     MMMMM     M::::::M    A:::::AAAAAAAAAAAAA:::::A      F:::::F               I::::I      A:::::AAAAAAAAAAAAA:::::A                             W:::::::::W     W:::::::::W          I::::I  N::::::N     N:::::::::N  \r\n"
				+ "  M::::::M               M::::::M   A:::::A             A:::::A   FF:::::::FF           II::::::II   A:::::A             A:::::A                             W:::::::W       W:::::::W         II::::::IIN::::::N      N::::::::N  \r\n"
				+ "  M::::::M               M::::::M  A:::::A               A:::::A  F::::::::FF           I::::::::I  A:::::A               A:::::A                             W:::::W         W:::::W          I::::::::IN::::::N       N:::::::N  \r\n"
				+ "  M::::::M               M::::::M A:::::A                 A:::::A F::::::::FF           I::::::::I A:::::A                 A:::::A                             W:::W           W:::W           I::::::::IN::::::N        N::::::N  \r\n"
				+ "  MMMMMMMM               MMMMMMMMAAAAAAA                   AAAAAAAFFFFFFFFFFF           IIIIIIIIIIAAAAAAA                   AAAAAAA                             WWW             WWW            IIIIIIIIIINNNNNNNN         NNNNNNN  \r\n"
				+ "                                                                                                                                                                                                                                       \r\n"
				+ "                                                                                                                                                                                                                                       \r\n"                                                                                                                                                                                                            
				+ "                                                                                                                                                                                                                                       \r\n"
				+ "                                                                                                                                                                                                                                       \r\n"
				+ "");
	
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		ask();
	}
	
	public void ask() {
		long afterTime = 0;
		RankDAO rankdao = new RankDAO();
		MafiaGameMain m = new MafiaGameMain();
		
		while(true) {
			System.out.print("[1]���� ���� [2]���� �ٽ��ϱ� >> ");
			int choice = sc.nextInt();
				
			if(choice == 1) {
				System.out.println("������ ����Ǿ����ϴ�!");
				afterTime = System.currentTimeMillis();
				System.out.println("�����ID : "+m.id);
//				System.out.println("�÷��̽ð� : "+m.beforeTime);
				long ResutlTime = (afterTime - m.beforeTime)/1000;
				System.out.println();
				System.out.println("�� "+ ResutlTime + "�� ����ϼ̽��ϴ�.");
				System.out.println();
				rankdao.insertrank(m.id, ResutlTime);
				
				System.out.print("[1]��ũ���� [2] ���� �ٽ��ϱ� >> ");
				choice = sc.nextInt();
				if(choice == 1) {
					System.out.println("============����� ������=============");
					rankdao.rankselect();
					System.out.println("==================================");
					break;
				}else if(choice == 2) {	
					System.out.println("���Ӵٽý���");
				}else System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
					break;
					
			}
			else if(choice == 2) {
				
				System.out.println("ù ȭ������ ���ư��ϴ�!");
				MafiaGameMain mafiagamemain = new MafiaGameMain();
				mafiagamemain.main(null);
			}else {System.out.println("��ȣ�� �ٽ� �Է��ϼ���!");}
			
			}
		
	}
		
}
