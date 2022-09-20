package miniproject; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import oracle.jdbc.driver.OracleDriver;//����� �� ��δ� �ٲ����ʴ´�

public class SelectDAO { 
	MP3Player mp3 = new MP3Player();
	Connection conn; 
	PreparedStatement psmt; 
	ResultSet rs; 
	Scanner sc = new Scanner(System.in);
	int cnt =0;
	
	public String SelectName() {

		// �����ε�-------------------------------------------------------------------------------
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB����----------------------------------------------------------------------------------------------
		String url="jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id="campus_f_0516_2"; 
		String db_pw="smhrd2";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
		// ����--------------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("���ǾƷ� ������ ����� ������");
		System.out.print("[�迵ö] [�̱���] [��ö��] [ȫ����] [�����] [�̺�ȣ]  ");
		String name = sc.next();
		mp3.play(".\\music\\playGun.mp3");
		String sql = "update people set survive = '�׾���' where name = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name); 
			cnt = psmt.executeUpdate(); 
			
			System.out.println(cnt);
		} catch (SQLException e) {
			e.printStackTrace();
			//4. ���� ����------------------------------------------------------------------------
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
		
			
		String[] arr_kyc = {"�迵ö(����, 50��, �ǻ�)", "-���� ����� �Ͼ �� ������ �������� �濡�� ��¦���� �ʾҽ��ϴ�."};
		String[] arr_lks = {"�̱���(����, 20��, ű���̼���)", "-������ �� ���� �ʾƼ� �濡�� ������ �߽��ϴ�."};
		String[] arr_pcs = {"��ö��(����, 60��, ��ǰ�����)", "-�Ҽ� ���θ� �����߽��ϴ�."};
		String[] arr_hah = {"ȫ����(����, 30��, �ֺ�)", "-���� ���� �ش޶�� �⵵�� �߾��"};
		String[] arr_khm = {"�����(����, 20��, �л�/��Ʃ��)", "-��Ʃ�� �����ȸ!! ������ ���ؼ� �濡�� ������ ������ �ϰ� �־���."};
		String[] arr_lbh = {"�̺�ȣ(����, 40��, �Ǽ���)", "-�ǹ� ������ �ۼ��ϴٰ� �κ񿡼� Ŀ�� �����߽��ϴ�."};
			
		
		System.out.println();
		System.out.println("====================<2���� �˸����� Ȯ��>====================");
		if(name.equals("�迵ö")) {
			for(int i=0; i<arr_lks.length; i++) {System.out.println(arr_lks[i]);} //�̱���
			System.out.println();
			for(int j=0; j<arr_pcs.length; j++) {System.out.println(arr_pcs[j]);} //��ö�� 
			System.out.println();
			for(int k=0; k<arr_hah.length; k++) {System.out.println(arr_hah[k]);} //ȫ����
			System.out.println();
			for(int m=0; m<arr_khm.length; m++) {System.out.println(arr_khm[m]);} //�����
			System.out.println();
			for(int l=0; l<arr_lbh.length; l++) {System.out.println(arr_lbh[l]);} //�̺�ȣ
			System.out.println("================================================================");
			
		}else if(name.equals("�̱���")) {
			for(int i=0; i<arr_kyc.length; i++) {System.out.println(arr_kyc[i]);} //�迵ö
			System.out.println();
			for(int j=0; j<arr_pcs.length; j++) {System.out.println(arr_pcs[j]);} //��ö�� 
			System.out.println();
			for(int k=0; k<arr_hah.length; k++) {System.out.println(arr_hah[k]);} //ȫ����
			System.out.println();
			for(int m=0; m<arr_khm.length; m++) {System.out.println(arr_khm[m]);} //�����
			System.out.println();
			for(int l=0; l<arr_lbh.length; l++) {System.out.println(arr_lbh[l]);} //�̺�ȣ
			System.out.println("================================================================");
			
		}else if(name.equals("��ö��")) {
			for(int i=0; i<arr_kyc.length; i++) {System.out.println(arr_kyc[i]);} //�迵ö
			System.out.println();
			for(int j=0; j<arr_lks.length; j++) {System.out.println(arr_lks[j]);} //�̱��� 
			System.out.println();
			for(int k=0; k<arr_hah.length; k++) {System.out.println(arr_hah[k]);} //ȫ����
			System.out.println();
			for(int m=0; m<arr_khm.length; m++) {System.out.println(arr_khm[m]);} //�����
			System.out.println();
			for(int l=0; l<arr_lbh.length; l++) {System.out.println(arr_lbh[l]);} //�̺�ȣ
			System.out.println("================================================================");
			
		}else if(name.equals("ȫ����")) {
			for(int i=0; i<arr_kyc.length; i++) {System.out.println(arr_kyc[i]);} //�迵ö
			System.out.println();
			for(int j=0; j<arr_lks.length; j++) {System.out.println(arr_lks[j]);} //�̱��� 
			System.out.println();
			for(int k=0; k<arr_pcs.length; k++) {System.out.println(arr_pcs[k]);} //��ö��
			System.out.println();
			for(int m=0; m<arr_khm.length; m++) {System.out.println(arr_khm[m]);} //�����
			System.out.println();
			for(int l=0; l<arr_lbh.length; l++) {System.out.println(arr_lbh[l]);} //�̺�ȣ
			System.out.println("================================================================");
			
		}else if(name.equals("�����")) {
			for(int i=0; i<arr_kyc.length; i++) {System.out.println(arr_kyc[i]);} //�迵ö
			System.out.println();
			for(int j=0; j<arr_lks.length; j++) {System.out.println(arr_lks[j]);} //�̱��� 
			System.out.println();
			for(int k=0; k<arr_pcs.length; k++) {System.out.println(arr_pcs[k]);} //��ö��
			System.out.println();
			for(int m=0; m<arr_hah.length; m++) {System.out.println(arr_hah[m]);} //ȫ����
			System.out.println();
			for(int l=0; l<arr_lbh.length; l++) {System.out.println(arr_lbh[l]);} //�̺�ȣ
			System.out.println();
		}else if(name.equals("�̺�ȣ")) {
			for(int i=0; i<arr_kyc.length; i++) {System.out.println(arr_kyc[i]);} //�迵ö
			System.out.println();
			for(int j=0; j<arr_lks.length; j++) {System.out.println(arr_lks[j]);} //�̱��� 
			System.out.println();
			for(int k=0; k<arr_pcs.length; k++) {System.out.println(arr_pcs[k]);} //��ö��
			System.out.println();
			for(int m=0; m<arr_hah.length; m++) {System.out.println(arr_hah[m]);} //ȫ����
			System.out.println();
			for(int l=0; l<arr_khm.length; l++) {System.out.println(arr_khm[l]);} //�����
			System.out.println("================================================================");
		}
			
		}
		
		
		
		
		
		

	}
	
	

		

