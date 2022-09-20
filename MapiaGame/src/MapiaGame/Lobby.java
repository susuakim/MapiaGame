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
	
	
	System.out.println("����� �κ� �����߽��ϴ�");
	int cnt = 0;
	int count=1;
	int cnt_alibi=0;
	gameEnding ending = new gameEnding();
	int cnt_mafia = 0;
	
	while(true) {
		
		System.out.print("[1]���Ǿ� ���� [2]�˸����� Ȯ�� [3]����ȹ�� [4]����  ");
		int choice = sc.nextInt();

		
		if(choice == 1) {
			count++;
			++cnt;
			name = dao.SelectName();
			if(name.equals("�̱���")) {
				System.out.println("���ǾƸ� �����ϼ̽��ϴ�");
				System.out.println("�����ϰڽ��ϴ�");
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
					System.out.println("���Ǿ� ���� 2�� ��ȸ�� ���� ����ϼ̽��ϴ�. ");
					System.out.println("���� ����˴ϴ�.");
					afterTime = System.currentTimeMillis();
					break;
				}
			}
		}else if(count==2&& choice==2) {
			++cnt_alibi;
			if(cnt_alibi!=0) {
				System.out.println("����� ���Ǿ� ������ ������� �˸����̸� Ȯ���� �� �ֽ��ϴ�.");
				System.out.println("����� ������ ���ǾƸ� ����ּ���");
				System.out.println("------------------------------------------------");
				System.out.println("[�迵ö] [�̱���] [��ö��] [ȫ����] [�����] [�̺�ȣ]");
				name = sc.next();				
				mp3.play(".\\music\\playGun.mp3");
				dao.Alibi(name);
				
				

			}else{//�˸����̸� ��ó�� ����������
				System.out.println("====================<1���� �˸����� Ȯ��>====================");
				System.out.println("�迵ö(����, 50��, �ǻ�) \n"+"-�濡�� �޽��� ���ϰ� �־����.");
				System.out.println();
				System.out.println("�̱���(����, 20��, ű���̼���) \n"+"-���� �谡 ���ļ� �����ֹ濡�� �߽��� ����� �־����ϴ�.");
				System.out.println();
				System.out.println("��ö��(����, 50��, ��ǰ�����) \n"+"-���� â�� �������� �־ �����߽��ϴ�.");
				System.out.println();
				System.out.println("ȫ����(����, 30��, �ֺ�) \n"+"-���� ���� �� �ͼ� ��� ���θ� �ѷ����� �߿� 201ȣ���� �뷧�Ҹ��� ������ϴ�.");
				System.out.println();
				System.out.println("�����(����, 20��, �л�/��Ʃ��) \n"+"-�濡�� ������ ��� �־����ϴ�.");
				System.out.println();
				System.out.println("�̺�ȣ(����, 40��, �Ǽ���) \n"+"-�ǰ��ؼ� ���� ����ϴ�.");
				System.out.println("=======================================================");
				
			}
			
			 
//					System.out.println("����� �����ϴ� ���ǾƸ� ����ּ���");
//					System.out.println("[�迵ö] [�̱���] [��ö��] [ȫ����] [�����] [�̺�ȣ]");
//					name = sc.next();
//					
//					System.out.println("��  ����̾ȵ���");
//					mp3.play(".\\music\\playGun.mp3");
////					System.out.println("====================<2���� �˸����� Ȯ��>====================");
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
			System.out.println("���� ���⸦ �����̽��ϴ�.");
			System.out.println("����~!!");
			afterTime = System.currentTimeMillis();
			break;
		}
		

		
	}
	return afterTime;
	}

}
