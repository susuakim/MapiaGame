package miniproject;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Lobby{
	

public static long main(String[] args) {
	MP3Player mp3 = new MP3Player();
	Scanner sc = new Scanner(System.in);
	SelectDAO dao = new SelectDAO();
	String name = null ;
	long afterTime = 0;
	System.out.println("                                                                 \r\n"
			+ "   :!!!!!!;        ,;!!!!!!!!!!!!*!!!!!!*!!!;,        ;!!!!!!:   \r\n"
			+ "   #@@@@@@@,      .#@@@@@@@@@@@@@@@@@@@@@@@@@#.      ,@@@@@@@#   \r\n"
			+ "  ~@=    :@;      =@,          ~@-          ,@=      !@:    =@~  \r\n"
			+ "  $@~     ##   ,$@@@#,         ~@~         ,#@@@#,   #@.    ~@#  \r\n"
			+ "  #@!:::::@@   =@=!=@@.        -@-        .@@=!=@=   @@:::::;@#  \r\n"
			+ "  #@@@@@@@@@. .@#   #@~        -@-        -@#   #@. .@@@@@@@@@#  \r\n"
			+ "  ,---#@-,,,  .@#   *@#$$$$$$$$$@$$$$$$$$$#@=   #@.  ,,,-@#-,,,  \r\n"
			+ "      #@       @@   =@@@@@@@@@@@@@@@@@@@@@@@=   @@       @#      \r\n"
			+ "      #@       :@=  =@~                   ~@*  =@~       @#      \r\n"
			+ "      #@.       $@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$        @#      \r\n"
			+ "      #@        ,:::::::::::::::::::::::::::::::,       .@#.     \r\n"
			+ "    @@@@@@,                                           ,@@@@@@    \r\n"
			+ "    !*!!!*.                 ,-,----,.                 .*!!!!*    \r\n"
			+ "                         ,=#@@@@@@@@@@=,                         \r\n"
			+ "                        ~@@#=*******=#@@~                        \r\n"
			+ "      $@@@@#~         -@#               #@-          -#@@@@#     \r\n"
			+ "      #@===@#         !@!               *@!          $@===@@     \r\n"
			+ "      #@   $@         *@-               -@*          @#  .@@     \r\n"
			+ "      #@.  =@         .@@,             ,@@.         .@$  ,@@     \r\n"
			+ "      #@   =@.         ;@@.           ,@@;          .@$  .@@     \r\n"
			+ "      #@   =@@@@@@#~    =@#*-... ...-*#@$.    -#@@@@@@$  .@@     \r\n"
			+ "      #@   :=====$@#     !@@@@@@@@@@@@@!.     #@$=====;  .@@     \r\n"
			+ "      #@.     ..  =@,                        ~@# . .    .,@@     \r\n"
			+ "      #@@@@@@@@@@@@@,                        ~@@@@@@@@@@@@@@     \r\n"
			+ "      *############$.                        .$############*     \r\n"
			+ "  $###########################################################$  \r\n"
			+ "                                                                 \r\n"
			+ "                                                                 \r\n");
	System.out.println();
	sc.nextLine();
	
	
	System.out.println("당신은 로비에 도착했습니다");
	int cnt = 0;
	int count=1;
	int cnt_alibi=0;
	gameEnding ending = new gameEnding();
	int cnt_mafia = 0;
	
	while(true) {
		
		System.out.print("[1]마피아 지목 [2]알리바이 확인 [3]증거획득 [4]포기  ");
		int choice = sc.nextInt();

		
		if(choice == 1) {
			count++;
			++cnt;
			name = dao.SelectName();
			if(name.equals("이광식")) {
				System.out.println("마피아를 지목하셨습니다");
				System.out.println("종료하겠습니다");
				ending.win();
				break;
			
			}else {
				++cnt_mafia;
				System.out.println();
				Day2 day2 = new Day2();
				day2.select(name);

			}
			
			
			if(cnt == 2) {
				if(cnt_mafia==1) {
					afterTime = System.currentTimeMillis();
					break;
					
				}
				else {
					System.out.println("마피아 지목 2번 기회를 전부 사용하셨습니다. ");
					System.out.println("게임 종료됩니다.");
					afterTime = System.currentTimeMillis();
					break;
				}
			}
		}else if(count==2&& choice==2) {
			++cnt_alibi;
			if(cnt_alibi!=0) {
				System.out.println("지목된 마피아 제외한 사람들의 알리바이를 확인할 수 있습니다.");
				System.out.println("당신이 지목한 마피아를 골라주세요");
				System.out.println("------------------------------------------------");
				System.out.println("[김영철] [이광식] [박철수] [홍아희] [김희미] [이병호]");
				name = sc.next();				
				mp3.play(".\\music\\playGun.mp3");
				dao.Alibi(name);
				
				

			}else{//알리바이를 맨처음 지목했을때
				System.out.println("====================<1일차 알리바이 확인>====================");
				System.out.println("김영철(남성, 50대, 의사) \n"+"-방에서 휴식을 취하고 있었어요.");
				System.out.println();
				System.out.println("이광식(남성, 20대, 킥복싱선수) \n"+"-저는 배가 고파서 공용주방에서 야식을 만들고 있었습니다.");
				System.out.println();
				System.out.println("박철수(남성, 50대, 펜션관리자) \n"+"-저는 창고가 어지럽혀 있어서 정리했습니다.");
				System.out.println();
				System.out.println("홍아희(여성, 30대, 주부) \n"+"-저는 잠이 안 와서 펜션 내부를 둘러보던 중에 201호에서 노랫소리를 들었습니다.");
				System.out.println();
				System.out.println("김희미(여성, 20대, 학생/유튜버) \n"+"-방에서 음악을 듣고 있었습니다.");
				System.out.println();
				System.out.println("이병호(남성, 40대, 건설직) \n"+"-피곤해서 일찍 잤습니다.");
				System.out.println("=======================================================");
				
			}
			
			 
//					System.out.println("당신이 생각하는 마피아를 골라주세요");
//					System.out.println("[김영철] [이광식] [박철수] [홍아희] [김희미] [이병호]");
//					name = sc.next();
//					
//					System.out.println("왜  출력이안되지");
//					mp3.play(".\\music\\playGun.mp3");
////					System.out.println("====================<2일차 알리바이 확인>====================");
//					dao.Alibi(name);
					
				}
		else if(choice==2) {
			System.out.println();
			Alibi alibi = new Alibi();
			alibi.alibi1();
			}
		
		else if(choice == 3) {
			Evidence evidence = new Evidence();
			evidence.main(args);

		}else if(choice == 4) {
			afterTime = System.currentTimeMillis();
			System.out.println("게임 포기를 누르셨습니다.");
			System.out.println("빠이~!!");
			afterTime = System.currentTimeMillis();
			break;
		}
		

		
	}
	return afterTime;
	}

}
