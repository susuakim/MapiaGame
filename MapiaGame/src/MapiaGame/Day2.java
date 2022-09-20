package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javazoom.jl.player.MP3Player;

public class Day2 {
	Connection conn ; 
	PreparedStatement psmt; 
	ResultSet rs; 
	MP3Player mp3 = new MP3Player();
	public void select(String die_name) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		String url="jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id="campus_f_0516_2"; 
		String db_pw="smhrd2";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn!=null) {
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "select * from info where die_name =? "; 
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,die_name);
			rs = psmt.executeQuery(); 
	
			if(rs.next()) {
				 String name = rs.getString("NAME");
				 String die_age = rs.getString("die_age");
				 String time=rs.getString("time");
				 String room_n=rs.getString("room_n");
				 
				 if(die_name.equals("�̱���")) {
					 System.out.println("<<�Ƕ��� ���Ǿ� " + die_name + "�� �׾����ϴ�.>>");
				 }else {
					 mp3.play(".\\music\\playX.mp3");
					 System.out.println("<<������ �ù� " + die_name + "�� �׾����ϴ�>>");
				 }
				 System.out.println();
				 System.out.println("==============�������===================");
					System.out.println("���� �߰���, �߰� �ð� : "+name+ ", "+ time);
					System.out.println("��� ���� �ð�       :11:00pm ~ 12:00pm ");
					System.out.println("������ �̸�         : " + die_name+" "+time);
					System.out.println("��� ���          :" +room_n);
					System.out.println("����              :��������, �����̿� ���� ����");
					System.out.println("======================================");
					System.out.println();
			}
			
			
			if(psmt!=null) {
			System.out.println("");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(rs!=null) { 
					rs.close();
				}if(psmt!=null) {
					psmt.close();
				}if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	
	
	}
}