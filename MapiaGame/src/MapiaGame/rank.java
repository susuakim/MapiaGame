package miniproject;
import java.util.Scanner;

public class rank {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	long beforeTime = 0; 
	long afterTime = 0;
	
	System.out.print("���� 1�� �Է�>> ");
	int start_cnt = sc.nextInt();
	
	if(start_cnt == 1) {
		beforeTime = System.currentTimeMillis(); //����ð��� beforeTime ������ ���
	}
	
    
	
	
	System.out.print("���� 4�� �Է�>> ");
	int end_cnt = sc.nextInt();
	
	if(end_cnt == 4) {
		afterTime = System.currentTimeMillis(); //����ð��� aftertime ������ ���	
	}
	    
	long ResutlTime = (afterTime - beforeTime)/1000;
	System.out.println("�� "+ ResutlTime + "�� ����ϼ̽��ϴ�.");


	}
}
