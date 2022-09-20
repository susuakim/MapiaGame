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

	// ȸ������
	public int insert(joinMemberDTO dto) {
		connect();
		try {

			// SQL�� ����
			String id = dto.getUser_id();
			String user_pw = dto.getUser_pw();
			String user_name = dto.getUser_name();
			String sql = "insert into user_info values(?, ?, ?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, user_pw);
			psmt.setString(3, user_name);

			cnt = psmt.executeUpdate();

			// ���� ����
			psmt.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println("ȸ�����Կ� �����ϼ̽��ϴ�. ");
		}
		return cnt;

	}
	// ȸ�� Ż��
	public int delete() {
		connect();

		try {
			// SQL�� ����
			System.out.print("Ż���ϰ� ���� ID�� �Է��Ͻÿ�. >> ");
			String id_input = sc.next();

			String sql = "delete from user_info where user_id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id_input);

			cnt = psmt.executeUpdate();
			System.out.println("���������� Ż�� �Ϸ�Ǿ����ϴ�.");
		}catch(SQLException e) {
			System.out.println("Ż�� ����");
		}
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("�����������");
		}
		return cnt;
		
	}

	// �α���
	public String login(joinMemberDTO dto) {
		String result_id=null;
		connect();

		try {//SQL�� ����
			// �Է¹��� user_id/user_pw�� result���Ͽ� �α��� ��� ���
			
			String sql = "select user_id, user_pw from user_info where user_id = ? and user_pw = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getUser_id()); // ù ��° ����ǥ
			psmt.setString(2, dto.getUser_pw()); // �� ��° ����ǥ
			
			rs = psmt.executeQuery();
				
			if(rs.next()) {
				result_id = rs.getString(1);
				String result_pw = rs.getString(2);
				
				if(result_id.equals(dto.getUser_id()) && result_pw.equals(dto.getUser_pw())) {
					System.out.println(rs.getString(1) + "�� �α��� �����ϼ̽��ϴ�!");
					
				
					
			
				}else System.out.println("�α��� ����");
			}	
		} catch (SQLException e) {
			System.out.println("ȸ�� ������ ã�� �� �����ϴ�. ");
		}
		
		try {//���� ����
			if(rs!=null) {
				rs.close();
			}
			if(psmt!=null) {
				psmt.close();
				
			}if(conn!=null) {
				conn.close();
			}
		}catch (SQLException e) {
			System.out.println("���� ���� ����");
		} return result_id;
	}
	public void connect() {
		try {//�����ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		}

		try {//DB����
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_2";
			String db_pw = "smhrd2";
			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}
	}
				
		
		

}
