package miniproject;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class gameEnding {
	MP3Player mp3 = new MP3Player();
	Scanner sc = new Scanner(System.in);
	// 마피아 검거 성공 시
	public void win() {
		mp3.play(".\\music\\goodEnding.mp3");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
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
		
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		ask();
	}
	// 마피아 검거 실패 시
	public void lose() {
		mp3.play(".\\music\\badEnding.mp3");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
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
	
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		ask();
	}
	
	public void ask() {
		long afterTime = 0;
		RankDAO rankdao = new RankDAO();
		MafiaGameMain m = new MafiaGameMain();
		
		while(true) {
			System.out.print("[1]게임 종료 [2]게임 다시하기 >> ");
			int choice = sc.nextInt();
				
			if(choice == 1) {
				System.out.println("게임이 종료되었습니다!");
				afterTime = System.currentTimeMillis();
				System.out.println("사용자ID : "+m.id);
//				System.out.println("플레이시간 : "+m.beforeTime);
				long ResutlTime = (afterTime - m.beforeTime)/1000;
				System.out.println();
				System.out.println("총 "+ ResutlTime + "초 사용하셨습니다.");
				System.out.println();
				rankdao.insertrank(m.id, ResutlTime);
				
				System.out.print("[1]랭크보기 [2] 게임 다시하기 >> ");
				choice = sc.nextInt();
				if(choice == 1) {
					System.out.println("============당신의 순위는=============");
					rankdao.rankselect();
					System.out.println("==================================");
					break;
				}else if(choice == 2) {	
					System.out.println("게임다시시작");
				}else System.out.println("번호를 잘못 입력하셨습니다.");
					break;
					
			}
			else if(choice == 2) {
				
				System.out.println("첫 화면으로 돌아갑니다!");
				MafiaGameMain mafiagamemain = new MafiaGameMain();
				mafiagamemain.main(null);
			}else {System.out.println("번호를 다시 입력하세요!");}
			
			}
		
	}
		
}
