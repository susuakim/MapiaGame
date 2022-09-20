package miniproject;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Minigame {

	Scanner sc = new Scanner(System.in);
	boolean result = true;
	MP3Player mp3 = new MP3Player();
	
	// SpecialGame 0 ==> 가위바위보
	public boolean rspGame() {
		boolean result=false;
		Scanner sc = new Scanner(System.in);

		System.out.print("Id를 입력하세요! : ");
		String a = sc.next();

		// 문자열 비교 => 'equals' 메소드 사용
		// 비교할문자열1.equals(비교할문자열2) => True/False
		while (true) {
			System.out.print(a + "님 가위바위보를 시작합니다! 입력하세요 >> ");
			String rsp = sc.next();
			mp3.play(".\\music\\playMinigame.mp3");
			

			if (rsp.equals("가위")) {
				System.out.println("축하합니다! 이겼습니다~!");
				System.out.println("증거는 ~~~~~");
				mp3.play(".\\music\\playWow.mp3");
				mp3.stop();
				result=true;
				break;
			} else if (rsp.equals("바위")) {
				System.out.println("안타까워라~ 졌습니다ㅜㅡㅜ");
				System.out.println("증거 획득에 실패했습니다!");
				mp3.stop();
				mp3.play(".\\music\\playFail.mp3");
				break;
			} else if (rsp.equals("보")) {
				System.out.println("비겼습니다! 한 번 더?");
				System.out.print("한 번 더 하시겠습니까? [1]다시 하기 [2]종료 하기 >> ");
				int choice = sc.nextInt();
				if (choice == 2) {
					System.out.println("증거 획득을 포기하셨습니다.");
					break;
				}
			}
			
		}
		return result;
	}
	
	// 난이도 level1 => 신조어 퀴즈
	public boolean level1() {
		mp3.play(".\\music\\playMinigame.mp3");        
		System.out.println("------------------------------------------------");
		System.out.println("★넌센스 퀴즈★");
		System.out.println("------------------------------------------------");
		System.out.println("문제 >> 딸기가 회사에서 짤리면?");
		System.out.println("------------------------------------------------");
		System.out.print("[1]정답 입력 [2]증거 획득 포기 ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			mp3.stop();
			System.out.print("정답을 입력하세요(4글자) >> ");
			String correct = sc.next();
			if (correct.equals("딸기시럽")) {
				System.out.println("♥정답입니다♥ 증거를 획득했습니다~!~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playWow.mp3");
				return true;
			} else {
				mp3.stop();
				System.out.println("틀렸습니다ㅜㅡㅜ  증거 획득 실패~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playFail.mp3");
				return false;
			}
		}else{
			System.out.println("미니게임을 포기하셨습니다.  증거 획득 실패~!");
			System.out.println("------------------------------------------------");
			return false; 
		}
		
		

	}

	// 난이도 level2 => 신조어 퀴즈
	public boolean level2() {
		mp3.play(".\\music\\playMinigame.mp3");  
		System.out.println("------------------------------------------------");
		System.out.println("★신조어 퀴즈★");
		System.out.println("------------------------------------------------");
		System.out.println("문제 >> '아까 네넴띤 맛있었지?'에서 '네넴띤'은 무엇일까요?");
		System.out.println("------------------------------------------------");
		System.out.print("[1]정답 입력 [2]증거 획득 포기 ");		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			mp3.stop();
			System.out.print("정답을 입력하세요 >> ");
			String correct = sc.next();
			if (correct.equals("비빔면")) {
				System.out.println("♥정답입니다♥ 증거를 획득했습니다~!~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playWow.mp3");
				return true;		
			} else {
				mp3.stop();
				System.out.println("틀렸습니다ㅜㅡㅜ  증거 획득 실패~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playFail.mp3");
				return false;
			}
		}else {
			System.out.println("미니게임을 포기하셨습니다.  증거 획득 실패~!");
			System.out.println("------------------------------------------------");
			return false;
		}

	}

	// 난이도 level3 => 신조어 퀴즈
	public boolean level3() {
		mp3.play(".\\music\\playMinigame.mp3");
		System.out.println("★신조어 퀴즈★");
		System.out.println("------------------------------------------------");
		System.out.println("문제 >> '오저치고'는 무엇의 줄임말일까요?");
		System.out.println("------------------------------------------------");
		System.out.print("[1]정답 입력 [2]증거 획득 포기 ");
		int choice = sc.nextInt();
		if(choice == 1) {
			mp3.stop();
			System.out.print("정답을 입력하세요(7글자) >> ");
			String correct = sc.next();
			if (correct.equals("오늘저녁치킨고")) {
				mp3.play(".\\music\\playWow.mp3");
				System.out.println("♥정답입니다♥ 증거를 획득했습니다~!~!");
				System.out.println("------------------------------------------------");
				return true;
			} else {
				mp3.stop();
				mp3.play(".\\music\\playFail.mp3");
				System.out.println("틀렸습니다ㅜㅡㅜ  증거 획득 실패~!");
				System.out.println("------------------------------------------------");
				return false;
			}
		}else{
			System.out.println("미니게임을 포기하셨습니다.  증거 획득 실패~!");
			System.out.println("------------------------------------------------");
				return false;
		}

	}

	// 난이도 level4 => 두뇌 퀴즈
	public boolean level4() {
		mp3.play(".\\music\\playMinigame.mp3");
		System.out.println("★두뇌 퀴즈★");
		System.out.println("------------------------------------------------");
		System.out.println("문제 >> 아래의 규칙을 보고 광주와 서울의 합을 구하시오.");
		System.out.println("우리나라 = 0");
		System.out.println("대한민국 = 3");
		System.out.println("대구 = 0");
		System.out.println("제주도 = 0");
		System.out.println("부산 = 1");

		System.out.println("------------------------------------------------");
		System.out.print("[1]정답 입력 [2]증거 획득 포기 ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.print("정답을 입력하세요 >> ");
			mp3.stop();
			int correct = sc.nextInt();
			if (correct==2) {
				System.out.println("♥정답입니다♥ 증거를 획득했습니다~!~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playWow.mp3");
				return true;
			} else {
				mp3.stop();
				System.out.println("틀렸습니다ㅜㅡㅜ  증거 획득 실패~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playFail.mp3");
				return false;
			}
		}else{
			System.out.println("미니게임을 포기하셨습니다.  증거 획득 실패~!");
			System.out.println("------------------------------------------------");
			return false;
		}
	}

	// 난이도 level5 => 캐치마인드
	public boolean level5() {
		mp3.play(".\\music\\playMinigame.mp3");
		System.out.println("★캐치마인드★");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("문제 >> 아래 그림을 보고 무엇인지 맞추시오! (힌트 : 3글자)");
		System.out.println("                                                  \n     "
				+ "                                                                 ;@@@@@@@@=              \n"
				+ "                                                                .$@@@@@@@@@*             \n"
				+ "                                                                !@@@@#**@@@@:            \n "
				+ "                                                                !@@@#-  ;@@@;    4잡아~!       \n "
				+ "                                                                -~~~-    @@@$,           \n  "
				+ "                                                                         @@@#,           \n "
				+ "           .@@@-  =@:                                                    @@@:            \n "
				+ "         #@@##@@@@#@@.                                                   @@@:            \n"
				+ "         #@    @@   @.                                 -!@;-@@=.        ;@@@:            \n "
				+ "         ## =: @# ! @.                                .@@$#@@*@:       ~@@@$-            \n "
				+ "         #@   #@@   @.                                .@=!#@#-@=.      =@@#-             \n "
				+ "         ,@#=#@@@@=#@.                                .@#=@@@$@!     ~=@@@=              \n "
				+ "          .~@@@@@@@                                    ~@@@@@@@:    -@@@@@               \n "
				+ "            -@@@@@=          도망가~!                     ~@@@@@=    @@@@@@               \n "
				+ "           -@@@@@@=                                       @@@@@=   =@@@@@------,         \n "
				+ "          ~@@@@@@@=                                      @@@@@@=   #@@@@@@@@@@@@         \n "
				+ "          #@@@@@@@=                                     @@@@@@@=   #@@@@@@@@@@@@         \n "
				+ "         ;@@@@@@@@=                                   =@@@@@@@@=  ;@@@@@@@@@@@@@*,=-     \n "
				+ "        ;@@@@@@@@@=                                   =@@@@@@@@=  ~@@@@@@@@#=@@@@#@:     \n "
				+ "       ~#@@@@@@@@@=                                   ~@@##@@@@=  :@@:         #@@@:     \n"
				+ "       !@@@@@@@@@@=                                       :@@@@=  =@#          #@@#~     \n"
				+ "      ;@@@@@@@@@@@=                                       :@@@@= ,$@#          #@@!      \n"
				+ "     ;@@@@@@!@@@@@=                                       :@@@@=,$@@:                    \n "
				+ "     @@@@@@#-@@@@@=                                       :@@@@=                         \n "
				+ "    =@@@@@@.-@@@@@=                                       :@@@@=          @@@@:$@           \n "
				+ "   =@@@@@@. -@@@@@=                                       :@@@@=        @@.@@@@@@=         \n"
				+ "  .$@@@@@@-,~@@@@@@@@@@@=                                 :@@@@=       ;@@@@@@@@@@!        \n"
				+ "  =@@@@@@@@@@@@@@@@@@@@@=                                 :@@@@=        ;*@@@@@@@@!       \n "
				+ "  @@@@@@@@@@@@@@@@@@@@@@=                                 :@@@@=                @@*       \n "
				+ " ;@@@@@@@@@@@@@@@@@@@@@@#:                                :@@@@=                @@!        \n"
				+ ",#@@@@@@@@@@@@@@@@@@@@@@@!            ;$$$$$~             :@@@@=               =@@!       \n"
				+ " :@@@@@@@@@@@@@@@@$......           -@@@@@@@@#            :@@@@=            :@@@@=       \n"
				+ "            -@@@@@=                   ,@@@@@@@@@@         :@@@@$           -@@##@@@;.      \n "
				+ "            -@@@@@=                     -#@@@@@@@@        :@$==@*-              ;$@@@~     \n "
				+ "            -@@@@@=                      ~!!!*@@@@       .*@- .@@@!              .=@@@:    \n"
				+ "            -@@@@@   #@@@$-                 -@@@@        =@@= .@@@@.              ,=@@@:    \n"
				+ "            ,#@@@@@@@@@@@@: *@@@@@@@@@@-   =$@@@-       $@@@@..@@@@.               !@@@=    \n"
				+ "            -@@@@@@@;$@@@@: #@@@@@@@@@@ -#@@@@@.      #@@@@= :@@@@.                !@@@=    \n"
				+ "            :@@@@@= !@@@@@: #@#####@@@@-  .@@@@@$     ,@@@@~  @@@@-               :@@@#     \n"
				+ "       .--.-@@@     !@@@@@:              =$@@@@@,                       ,-       ~$@@@#    \n"
				+ "      .*@@!@@$;~    !@@@@$- ~@@@@@@    .   ,$@@@@=                     *@        @@@@@!     \n"
				+ "     !*@@@@@@!      !@@@@!  =@@@@@@@@        :@@@@=                    *@@@$$@@@@@@@@     \n "
				+ "    *@@@@@@@@!       #@@$,  =@@@@@@@@@       $@@@@=                    =@@@@@@@@@@@@@     \n "
				+ "    #@@@@@@@$        =@@.     @@@@@@@@@;  $@@@@@@@=                    ..@@@@@@@@@@@/        \n"
				+ "    #@@@@@@*          ##         *@@@@: #@@@@@@#                       @@@@@@       @@@   \n"
				+ "     $$$$,                             -@@@@@$                      ,~#;,@@!        #@@@: \n"
				+ "                                #@@=.  @@@@@.                      @@@@@@#         -@@@@:  \n"
				+ "                                 #@@@=;;@@@@!                    ;@@@@@#           -#@@@=,  \n"
				+ "                                  -@@@@@@@@@@-                   :#@@@#            ,$@@~,    \n"
				+ "                                    -@@@@@@@@;                                             \n "
				+ "                                     -@@@@@@!                                              \n"
				+ "                                       $$$*       ");

		System.out.print("[1]정답 입력 [2]증거 획득 포기 ");
		int choice = sc.nextInt();
		if(choice == 1) {
			mp3.stop();
			System.out.print("정답을 입력하세요(3글자) >> ");
			String correct = sc.next();
			if (correct.equals("포도주")) {
				System.out.println("♥정답입니다♥ 증거를 획득했습니다~!~!");
				System.out.println("-----------------------------------------------------------------------------");
				mp3.play(".\\music\\playWow.mp3");
				return true;
			} else
				mp3.stop();
				System.out.println("틀렸습니다ㅜㅡㅜ  증거 획득 실패~!");
			System.out.println("-----------------------------------------------------------------------------");
			mp3.play(".\\music\\playFail.mp3");
				return false;
		}else{
			System.out.println("미니게임을 포기하셨습니다.  증거 획득 실패~!");
			System.out.println("-----------------------------------------------------------------------------");
			return false;
		}
	}

}
