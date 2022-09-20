package miniproject;

import java.util.Scanner;

public class RankMain {
	public static void main(String[] args, long afterTime, long beforeTime, String userid) {

		long ResutlTime = (afterTime - beforeTime)/1000;
		System.out.println("총 "+ ResutlTime + "초 사용하셨습니다.");
		
		System.out.println(userid);

//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디>>"); //회원가입할 때 아이디가 이쪽으로 연결되게 하기
//		String userid=sc.next();
//
//		System.out.print("랭크타임>>"); //게임 종료시 입력되는 데이터가 이쪽으로 오게 만들기!! 
//		int ranktime=sc.nextInt();
//		RankDTO rankdto = new RankDTO(userid, ranktime);//userid, ranktime 회원가입한 아이디랑 마지막 시간재는거
				RankDAO rankdao = new RankDAO();
				rankdao.insertrank(userid, ResutlTime); //오류 : 부모키 없는 상태에서 무결성제약 조건 때문에(외래키제약조건 삭제하여 독립된 컬럼 만들던가 부모키인 테이블에 외래키 추가해야돼)
	
//	rankdao.rankselect(); //랭크테이블 불러오는 거
	
	}

}
