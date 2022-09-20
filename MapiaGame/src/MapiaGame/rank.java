package miniproject;
import java.util.Scanner;

public class rank {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	long beforeTime = 0; 
	long afterTime = 0;
	
	System.out.print("시작 1번 입력>> ");
	int start_cnt = sc.nextInt();
	
	if(start_cnt == 1) {
		beforeTime = System.currentTimeMillis(); //현재시간을 beforeTime 변수에 담기
	}
	
    
	
	
	System.out.print("종료 4번 입력>> ");
	int end_cnt = sc.nextInt();
	
	if(end_cnt == 4) {
		afterTime = System.currentTimeMillis(); //종료시간을 aftertime 변수에 담기	
	}
	    
	long ResutlTime = (afterTime - beforeTime)/1000;
	System.out.println("총 "+ ResutlTime + "초 사용하셨습니다.");


	}
}
