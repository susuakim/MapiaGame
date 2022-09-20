package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RankDAO {
	int cnt=0;
	Connection conn=null;
	PreparedStatement psmt=null;
	ResultSet rs;
	public int insertrank(String rankid, long ranktime) { //¿©±â int?? ±¦ÂúÀºÁö?
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			String url="jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id="campus_f_0516_2"; 
			String db_pw="smhrd2";
			
		conn = DriverManager.getConnection(url, db_id, db_pw);
		if(conn!=null) { }
		
		
		String sql ="insert into rank values(?,?)";
		psmt =  conn.prepareStatement(sql);
		
		psmt.setString(1, rankid);
		psmt.setLong(2, ranktime);
		
		cnt = psmt.executeUpdate();
		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(psmt!=null) {
				psmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return cnt;
		
	}

	
	
	
	public void rankselect() {
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
		
		String sql = "select * from rank order by rank_time";
		try {
			
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); 
		
			System.out.print("È¸¿øID"+"\t");
			System.out.println("·©Å·½Ã°£");
			
			while(rs.next()) { 
		String id = rs.getString("user_id"); 
		String ranktime = rs.getString("rank_time"); 
		
		System.out.print(id +"\t");
		System.out.println(ranktime);
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


