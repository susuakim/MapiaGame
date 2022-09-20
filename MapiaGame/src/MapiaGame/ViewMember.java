package miniproject;
// ��ü ȸ�� ��� ���� (select��)

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
			// 1. ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// DB ����
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_2";
			String db_pw = "smhrd2";
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			// 3. SQL�� ����
			String sql = "select * from user_info "; // ������ SQL�� ����
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
//			rs.next(); // data �÷��� ù��° ������ �̵� (�÷� 1ĭ�� �Ʒ��� �̵�)
			System.out.print("ID" + "\t\t");
			System.out.print("PW" + "\t\t");
			System.out.println("NAME");
			System.out.println("-------------------------------------------");
			while (rs.next()) { // rs.next()�� true�� ���� �ݺ��ؼ� �÷� ��ü������ ���
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
