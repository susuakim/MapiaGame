package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class joinMemberDAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	int cnt = 0;
	Scanner sc = new Scanner(System.in);

	// 회원가입
	public int insert(joinMemberDTO dto) {
		connect();
		try {

			// SQL문 실행
			String id = dto.getUser_id();
			String user_pw = dto.getUser_pw();
			String user_name = dto.getUser_name();
			String sql = "insert into user_info values(?, ?, ?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, user_pw);
			psmt.setString(3, user_name);

			cnt = psmt.executeUpdate();

			// 연결 종료
			psmt.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println("회원가입에 실패하셨습니다. ");
		}
		return cnt;

	}
	// 회원 탈퇴
	public int delete() {
		connect();

		try {
			// SQL문 실행
			System.out.print("탈퇴하고 싶은 ID를 입력하시오. >> ");
			String id_input = sc.next();

			String sql = "delete from user_info where user_id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id_input);

			cnt = psmt.executeUpdate();
			System.out.println("정상적으로 탈퇴 완료되었습니다.");
		}catch(SQLException e) {
			System.out.println("탈퇴 실패");
		}
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("연결종료실패");
		}
		return cnt;
		
	}

	// 로그인
	public String login(joinMemberDTO dto) {
		String result_id=null;
		connect();

		try {//SQL문 실행
			// 입력받은 user_id/user_pw와 result비교하여 로그인 결과 출력
			
			String sql = "select user_id, user_pw from user_info where user_id = ? and user_pw = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getUser_id()); // 첫 번째 물음표
			psmt.setString(2, dto.getUser_pw()); // 두 번째 물음표
			
			rs = psmt.executeQuery();
				
			if(rs.next()) {
				result_id = rs.getString(1);
				String result_pw = rs.getString(2);
				
				if(result_id.equals(dto.getUser_id()) && result_pw.equals(dto.getUser_pw())) {
					System.out.println(rs.getString(1) + "님 로그인 성공하셨습니다!");
					
				
					
			
				}else System.out.println("로그인 실패");
			}	
		} catch (SQLException e) {
			System.out.println("회원 정보를 찾을 수 없습니다. ");
		}
		
		try {//연결 종료
			if(rs!=null) {
				rs.close();
			}
			if(psmt!=null) {
				psmt.close();
				
			}if(conn!=null) {
				conn.close();
			}
		}catch (SQLException e) {
			System.out.println("연결 종료 실패");
		} return result_id;
	}
	public void connect() {
		try {//동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		}

		try {//DB연결
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_2";
			String db_pw = "smhrd2";
			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
	}
				
		
		

}
