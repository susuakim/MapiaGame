package miniproject;
// 전체 회원 목록 보기 (select문)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ViewMember {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public void select() {
		try {
			// 1. 동적 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// DB 연결
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_2";
			String db_pw = "smhrd2";
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			// 3. SQL문 실행
			String sql = "select * from user_info "; // 실행할 SQL문 정의
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
//			rs.next(); // data 컬럼의 첫번째 행으로 이동 (컬럼 1칸씩 아래로 이동)
			System.out.print("ID" + "\t\t");
			System.out.print("PW" + "\t\t");
			System.out.println("NAME");
			System.out.println("-------------------------------------------");
			while (rs.next()) { // rs.next()가 true일 동안 반복해서 컬럼 전체데이터 출력
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				System.out.print(id + "\t\t");
				System.out.print(pw + "\t\t");
				System.out.println(name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ViewMember view = new ViewMember();
		view.select();
	}
}
