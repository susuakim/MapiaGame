package miniproject; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import oracle.jdbc.driver.OracleDriver;//참고로 이 경로는 바뀌지않는다

public class SelectDAO { 
	MP3Player mp3 = new MP3Player();
	Connection conn; 
	PreparedStatement psmt; 
	ResultSet rs; 
	Scanner sc = new Scanner(System.in);
	int cnt =0;
	
	public String SelectName() {

		// 동적로딩-------------------------------------------------------------------------------
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB연결----------------------------------------------------------------------------------------------
		String url="jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id="campus_f_0516_2"; 
		String db_pw="smhrd2";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
		// 실행--------------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("마피아로 지목할 대상을 고르세요");
		System.out.print("[김영철] [이광식] [박철수] [홍아희] [김희미] [이병호]  ");
		String name = sc.next();
		mp3.play(".\\music\\playGun.mp3");
		String sql = "update people set survive = '죽었음' where name = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name); 
			cnt = psmt.executeUpdate(); 
			
			System.out.println(cnt);
		} catch (SQLException e) {
			e.printStackTrace();
			//4. 연결 종료------------------------------------------------------------------------
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return name;
		
	}	
		
	
	
		public void Alibi(String name) {
		
			
		String[] arr_kyc = {"김영철(남성, 50대, 의사)", "-살인 사건이 일어난 것 때문에 무서워서 방에서 꼼짝하지 않았습니다."};
		String[] arr_lks = {"이광식(남성, 20대, 킥복싱선수)", "-시합이 얼마 남지 않아서 방에서 연습을 했습니다."};
		String[] arr_pcs = {"박철수(남성, 60대, 펜션관리자)", "-팬션 내부를 순찰했습니다."};
		String[] arr_hah = {"홍아희(여성, 30대, 주부)", "-별일 없게 해달라고 기도를 했어요"};
		String[] arr_khm = {"김희미(여성, 20대, 학생/유튜버)", "-너튜브 떡상기회!! 떡상을 위해서 방에서 동영상 편집을 하고 있었죠."};
		String[] arr_lbh = {"이병호(남성, 40대, 건설직)", "-건물 도면을 작성하다가 로비에서 커피 한잔했습니다."};
			
		
		System.out.println();
		System.out.println("====================<2일차 알리바이 확인>====================");
		if(name.equals("김영철")) {
			for(int i=0; i<arr_lks.length; i++) {System.out.println(arr_lks[i]);} //이광식
			System.out.println();
			for(int j=0; j<arr_pcs.length; j++) {System.out.println(arr_pcs[j]);} //박철수 
			System.out.println();
			for(int k=0; k<arr_hah.length; k++) {System.out.println(arr_hah[k]);} //홍아희
			System.out.println();
			for(int m=0; m<arr_khm.length; m++) {System.out.println(arr_khm[m]);} //김희미
			System.out.println();
			for(int l=0; l<arr_lbh.length; l++) {System.out.println(arr_lbh[l]);} //이병호
			System.out.println("================================================================");
			
		}else if(name.equals("이광식")) {
			for(int i=0; i<arr_kyc.length; i++) {System.out.println(arr_kyc[i]);} //김영철
			System.out.println();
			for(int j=0; j<arr_pcs.length; j++) {System.out.println(arr_pcs[j]);} //박철수 
			System.out.println();
			for(int k=0; k<arr_hah.length; k++) {System.out.println(arr_hah[k]);} //홍아희
			System.out.println();
			for(int m=0; m<arr_khm.length; m++) {System.out.println(arr_khm[m]);} //김희미
			System.out.println();
			for(int l=0; l<arr_lbh.length; l++) {System.out.println(arr_lbh[l]);} //이병호
			System.out.println("================================================================");
			
		}else if(name.equals("박철수")) {
			for(int i=0; i<arr_kyc.length; i++) {System.out.println(arr_kyc[i]);} //김영철
			System.out.println();
			for(int j=0; j<arr_lks.length; j++) {System.out.println(arr_lks[j]);} //이광식 
			System.out.println();
			for(int k=0; k<arr_hah.length; k++) {System.out.println(arr_hah[k]);} //홍아희
			System.out.println();
			for(int m=0; m<arr_khm.length; m++) {System.out.println(arr_khm[m]);} //김희미
			System.out.println();
			for(int l=0; l<arr_lbh.length; l++) {System.out.println(arr_lbh[l]);} //이병호
			System.out.println("================================================================");
			
		}else if(name.equals("홍아희")) {
			for(int i=0; i<arr_kyc.length; i++) {System.out.println(arr_kyc[i]);} //김영철
			System.out.println();
			for(int j=0; j<arr_lks.length; j++) {System.out.println(arr_lks[j]);} //이광식 
			System.out.println();
			for(int k=0; k<arr_pcs.length; k++) {System.out.println(arr_pcs[k]);} //박철수
			System.out.println();
			for(int m=0; m<arr_khm.length; m++) {System.out.println(arr_khm[m]);} //김희미
			System.out.println();
			for(int l=0; l<arr_lbh.length; l++) {System.out.println(arr_lbh[l]);} //이병호
			System.out.println("================================================================");
			
		}else if(name.equals("김희미")) {
			for(int i=0; i<arr_kyc.length; i++) {System.out.println(arr_kyc[i]);} //김영철
			System.out.println();
			for(int j=0; j<arr_lks.length; j++) {System.out.println(arr_lks[j]);} //이광식 
			System.out.println();
			for(int k=0; k<arr_pcs.length; k++) {System.out.println(arr_pcs[k]);} //박철수
			System.out.println();
			for(int m=0; m<arr_hah.length; m++) {System.out.println(arr_hah[m]);} //홍아희
			System.out.println();
			for(int l=0; l<arr_lbh.length; l++) {System.out.println(arr_lbh[l]);} //이병호
			System.out.println();
		}else if(name.equals("이병호")) {
			for(int i=0; i<arr_kyc.length; i++) {System.out.println(arr_kyc[i]);} //김영철
			System.out.println();
			for(int j=0; j<arr_lks.length; j++) {System.out.println(arr_lks[j]);} //이광식 
			System.out.println();
			for(int k=0; k<arr_pcs.length; k++) {System.out.println(arr_pcs[k]);} //박철수
			System.out.println();
			for(int m=0; m<arr_hah.length; m++) {System.out.println(arr_hah[m]);} //홍아희
			System.out.println();
			for(int l=0; l<arr_khm.length; l++) {System.out.println(arr_khm[l]);} //김희미
			System.out.println("================================================================");
		}
			
		}
		
		
		
		
		
		

	}
	
	

		

