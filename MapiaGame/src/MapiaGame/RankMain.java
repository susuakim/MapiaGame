package miniproject;

import java.util.Scanner;

public class RankMain {
	public static void main(String[] args, long afterTime, long beforeTime, String userid) {

		long ResutlTime = (afterTime - beforeTime)/1000;
		System.out.println("�� "+ ResutlTime + "�� ����ϼ̽��ϴ�.");
		
		System.out.println(userid);

//		Scanner sc = new Scanner(System.in);
//		System.out.print("���̵�>>"); //ȸ�������� �� ���̵� �������� ����ǰ� �ϱ�
//		String userid=sc.next();
//
//		System.out.print("��ũŸ��>>"); //���� ����� �ԷµǴ� �����Ͱ� �������� ���� �����!! 
//		int ranktime=sc.nextInt();
//		RankDTO rankdto = new RankDTO(userid, ranktime);//userid, ranktime ȸ�������� ���̵�� ������ �ð���°�
				RankDAO rankdao = new RankDAO();
				rankdao.insertrank(userid, ResutlTime); //���� : �θ�Ű ���� ���¿��� ���Ἲ���� ���� ������(�ܷ�Ű�������� �����Ͽ� ������ �÷� ������� �θ�Ű�� ���̺� �ܷ�Ű �߰��ؾߵ�)
	
//	rankdao.rankselect(); //��ũ���̺� �ҷ����� ��
	
	}

}
