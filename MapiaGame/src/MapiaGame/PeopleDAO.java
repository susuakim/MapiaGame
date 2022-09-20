package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeopleDAO { //★★★★★★★★★★★★★용의자정보 나타냄!!! 
Connection conn;
PreparedStatement psmt;
ResultSet rs;
public void select() {
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

	String sql = "select * from people";
	try {
		psmt = conn.prepareStatement(sql);
	
		rs = psmt.executeQuery();  
	

		System.out.print("이름"+"\t");
		System.out.print("나이"+"\t");
		System.out.print("생존여부"+"\t");
		System.out.print("직업"+"\t");
		System.out.println("방번호");
		
		while(rs.next()) { 
	String name = rs.getString(1); 
	String age = rs.getString(2); 
	String job = rs.getString(3);
	String survive = rs.getString(5); 
	String room = rs.getString(6);
	
	System.out.print(name +"\t");
	System.out.print(age +"\t");
	System.out.print(survive + "\t");
	System.out.print(job + "\t");
	System.out.println(room);
	}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		
	
	
	try {
		if(rs != null) {
		rs.close();
		}if(psmt !=null) { 
		psmt.close();
		}if(conn !=null) { 
			conn.close();
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	}
	





}
}