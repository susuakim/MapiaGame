package miniproject;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Minigame {

	Scanner sc = new Scanner(System.in);
	boolean result = true;
	MP3Player mp3 = new MP3Player();
	
	// SpecialGame 0 ==> ����������
	public boolean rspGame() {
		boolean result=false;
		Scanner sc = new Scanner(System.in);

		System.out.print("Id�� �Է��ϼ���! : ");
		String a = sc.next();

		// ���ڿ� �� => 'equals' �޼ҵ� ���
		// ���ҹ��ڿ�1.equals(���ҹ��ڿ�2) => True/False
		while (true) {
			System.out.print(a + "�� ������������ �����մϴ�! �Է��ϼ��� >> ");
			String rsp = sc.next();
			mp3.play(".\\music\\playMinigame.mp3");
			

			if (rsp.equals("����")) {
				System.out.println("�����մϴ�! �̰���ϴ�~!");
				System.out.println("���Ŵ� ~~~~~");
				mp3.play(".\\music\\playWow.mp3");
				mp3.stop();
				result=true;
				break;
			} else if (rsp.equals("����")) {
				System.out.println("��Ÿ�����~ �����ϴ٤̤Ѥ�");
				System.out.println("���� ȹ�濡 �����߽��ϴ�!");
				mp3.stop();
				mp3.play(".\\music\\playFail.mp3");
				break;
			} else if (rsp.equals("��")) {
				System.out.println("�����ϴ�! �� �� ��?");
				System.out.print("�� �� �� �Ͻðڽ��ϱ�? [1]�ٽ� �ϱ� [2]���� �ϱ� >> ");
				int choice = sc.nextInt();
				if (choice == 2) {
					System.out.println("���� ȹ���� �����ϼ̽��ϴ�.");
					break;
				}
			}
			
		}
		return result;
	}
	
	// ���̵� level1 => ������ ����
	public boolean level1() {
		mp3.play(".\\music\\playMinigame.mp3");        
		System.out.println("------------------------------------------------");
		System.out.println("�ڳͼ��� �����");
		System.out.println("------------------------------------------------");
		System.out.println("���� >> ���Ⱑ ȸ�翡�� ©����?");
		System.out.println("------------------------------------------------");
		System.out.print("[1]���� �Է� [2]���� ȹ�� ���� ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			mp3.stop();
			System.out.print("������ �Է��ϼ���(4����) >> ");
			String correct = sc.next();
			if (correct.equals("����÷�")) {
				System.out.println("�������Դϴ٢� ���Ÿ� ȹ���߽��ϴ�~!~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playWow.mp3");
				return true;
			} else {
				mp3.stop();
				System.out.println("Ʋ�Ƚ��ϴ٤̤Ѥ�  ���� ȹ�� ����~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playFail.mp3");
				return false;
			}
		}else{
			System.out.println("�̴ϰ����� �����ϼ̽��ϴ�.  ���� ȹ�� ����~!");
			System.out.println("------------------------------------------------");
			return false; 
		}
		
		

	}

	// ���̵� level2 => ������ ����
	public boolean level2() {
		mp3.play(".\\music\\playMinigame.mp3");  
		System.out.println("------------------------------------------------");
		System.out.println("�ڽ����� �����");
		System.out.println("------------------------------------------------");
		System.out.println("���� >> '�Ʊ� �׳۶� ���־���?'���� '�׳۶�'�� �����ϱ��?");
		System.out.println("------------------------------------------------");
		System.out.print("[1]���� �Է� [2]���� ȹ�� ���� ");		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			mp3.stop();
			System.out.print("������ �Է��ϼ��� >> ");
			String correct = sc.next();
			if (correct.equals("�����")) {
				System.out.println("�������Դϴ٢� ���Ÿ� ȹ���߽��ϴ�~!~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playWow.mp3");
				return true;		
			} else {
				mp3.stop();
				System.out.println("Ʋ�Ƚ��ϴ٤̤Ѥ�  ���� ȹ�� ����~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playFail.mp3");
				return false;
			}
		}else {
			System.out.println("�̴ϰ����� �����ϼ̽��ϴ�.  ���� ȹ�� ����~!");
			System.out.println("------------------------------------------------");
			return false;
		}

	}

	// ���̵� level3 => ������ ����
	public boolean level3() {
		mp3.play(".\\music\\playMinigame.mp3");
		System.out.println("�ڽ����� �����");
		System.out.println("------------------------------------------------");
		System.out.println("���� >> '����ġ��'�� ������ ���Ӹ��ϱ��?");
		System.out.println("------------------------------------------------");
		System.out.print("[1]���� �Է� [2]���� ȹ�� ���� ");
		int choice = sc.nextInt();
		if(choice == 1) {
			mp3.stop();
			System.out.print("������ �Է��ϼ���(7����) >> ");
			String correct = sc.next();
			if (correct.equals("��������ġŲ��")) {
				mp3.play(".\\music\\playWow.mp3");
				System.out.println("�������Դϴ٢� ���Ÿ� ȹ���߽��ϴ�~!~!");
				System.out.println("------------------------------------------------");
				return true;
			} else {
				mp3.stop();
				mp3.play(".\\music\\playFail.mp3");
				System.out.println("Ʋ�Ƚ��ϴ٤̤Ѥ�  ���� ȹ�� ����~!");
				System.out.println("------------------------------------------------");
				return false;
			}
		}else{
			System.out.println("�̴ϰ����� �����ϼ̽��ϴ�.  ���� ȹ�� ����~!");
			System.out.println("------------------------------------------------");
				return false;
		}

	}

	// ���̵� level4 => �γ� ����
	public boolean level4() {
		mp3.play(".\\music\\playMinigame.mp3");
		System.out.println("�ڵγ� �����");
		System.out.println("------------------------------------------------");
		System.out.println("���� >> �Ʒ��� ��Ģ�� ���� ���ֿ� ������ ���� ���Ͻÿ�.");
		System.out.println("�츮���� = 0");
		System.out.println("���ѹα� = 3");
		System.out.println("�뱸 = 0");
		System.out.println("���ֵ� = 0");
		System.out.println("�λ� = 1");

		System.out.println("------------------------------------------------");
		System.out.print("[1]���� �Է� [2]���� ȹ�� ���� ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.print("������ �Է��ϼ��� >> ");
			mp3.stop();
			int correct = sc.nextInt();
			if (correct==2) {
				System.out.println("�������Դϴ٢� ���Ÿ� ȹ���߽��ϴ�~!~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playWow.mp3");
				return true;
			} else {
				mp3.stop();
				System.out.println("Ʋ�Ƚ��ϴ٤̤Ѥ�  ���� ȹ�� ����~!");
				System.out.println("------------------------------------------------");
				mp3.play(".\\music\\playFail.mp3");
				return false;
			}
		}else{
			System.out.println("�̴ϰ����� �����ϼ̽��ϴ�.  ���� ȹ�� ����~!");
			System.out.println("------------------------------------------------");
			return false;
		}
	}

	// ���̵� level5 => ĳġ���ε�
	public boolean level5() {
		mp3.play(".\\music\\playMinigame.mp3");
		System.out.println("��ĳġ���ε��");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("���� >> �Ʒ� �׸��� ���� �������� ���߽ÿ�! (��Ʈ : 3����)");
		System.out.println("                                                  \n     "
				+ "                                                                 ;@@@@@@@@=              \n"
				+ "                                                                .$@@@@@@@@@*             \n"
				+ "                                                                !@@@@#**@@@@:            \n "
				+ "                                                                !@@@#-  ;@@@;    4���~!       \n "
				+ "                                                                -~~~-    @@@$,           \n  "
				+ "                                                                         @@@#,           \n "
				+ "           .@@@-  =@:                                                    @@@:            \n "
				+ "         #@@##@@@@#@@.                                                   @@@:            \n"
				+ "         #@    @@   @.                                 -!@;-@@=.        ;@@@:            \n "
				+ "         ## =: @# ! @.                                .@@$#@@*@:       ~@@@$-            \n "
				+ "         #@   #@@   @.                                .@=!#@#-@=.      =@@#-             \n "
				+ "         ,@#=#@@@@=#@.                                .@#=@@@$@!     ~=@@@=              \n "
				+ "          .~@@@@@@@                                    ~@@@@@@@:    -@@@@@               \n "
				+ "            -@@@@@=          ������~!                     ~@@@@@=    @@@@@@               \n "
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

		System.out.print("[1]���� �Է� [2]���� ȹ�� ���� ");
		int choice = sc.nextInt();
		if(choice == 1) {
			mp3.stop();
			System.out.print("������ �Է��ϼ���(3����) >> ");
			String correct = sc.next();
			if (correct.equals("������")) {
				System.out.println("�������Դϴ٢� ���Ÿ� ȹ���߽��ϴ�~!~!");
				System.out.println("-----------------------------------------------------------------------------");
				mp3.play(".\\music\\playWow.mp3");
				return true;
			} else
				mp3.stop();
				System.out.println("Ʋ�Ƚ��ϴ٤̤Ѥ�  ���� ȹ�� ����~!");
			System.out.println("-----------------------------------------------------------------------------");
			mp3.play(".\\music\\playFail.mp3");
				return false;
		}else{
			System.out.println("�̴ϰ����� �����ϼ̽��ϴ�.  ���� ȹ�� ����~!");
			System.out.println("-----------------------------------------------------------------------------");
			return false;
		}
	}

}
