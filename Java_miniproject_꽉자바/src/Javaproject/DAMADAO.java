package Javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAMADAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int result;
	String sql;

	// 데이터베이스를 연결하는 메소드 getConn()

	// 데이터베이스를 연결끊는 메소드 endClose()

	// 회원정보 메소드

	// insert insert()

	// select select()

	// update update()

	// delete delete()

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "cgi_2_3_1022";
			String password = "smhrd3";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) { // 어떠한 오류라도 발생시 캐치해주는 역활
			System.out.println("연결 오류");
			e.printStackTrace();
		}
	}
 
	public void endClose() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void table1() {
		getConn();

		sql = "create table user_info " + "(ID varchar2(10)," + "PASSWORD NUMBER(10) NOT NULL," 
				+ "CONSTRAINT INFO_PK PRIMARY KEY (ID)" + ")";
		try {
			conn.createStatement();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public void table2() {
		getConn();
		sql = "create table DAMA_INFO (" + "ID VARCHAR2(10)," + "NICK varchar2(10)," + "LV NUMBER(5)," 
				+ "EXPE NUMBER(5)," + "HP NUMBER(5)," + "ENE NUMBER(5)," + "MAX_HP NUMBER(5),"
				+ "MAX_ENE NUMBER(5)," + "ATK NUMBER(5)," + "DEF NUMBER(5)," + "SPD NUMBER(5),"
				+ "FOOD NUMBER(5)," + "HERBS NUMBER(5)," + "STARTDAY NUMBER(5)," + "SICKDAY NUMBER(5)," 
				+ "CONSTRAINT DAMA_FK FOREIGN KEY (ID) REFERENCES user_info(ID)" + ")";
		try {
			conn.createStatement();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}
	
	public int join(String Id, String Pw) {
		int i=0;
		getConn();
		try {
			String sql = "insert into user_info values(?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Id);
			psmt.setString(2, Pw);
			int up=psmt.executeUpdate();// 업데이트 줄수
			if (up>0) {
				i=5;
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
		return i;
	}
	
	public void joinStators(String Id, String Nick) {
		getConn();
		try {
			String sql = "insert into DAMA_INFO values(?,?,1,1,100,100,100,100,30,10,30,5,1,1,1)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Id);
			psmt.setString(2, Nick);
			psmt.executeUpdate();// 업데이트 줄수
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public void select() {
		getConn();
		String sql = "select * from user_info";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String getId = rs.getString(1);
				String getPw = rs.getString(2);
				System.out.println("아이디 : " + getId + " 비밀번호 : " + getPw);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}
	public void ranksys() {
		getConn();
		int i=0;
		String sql = "select * from dama_info order by Lv,Expe,STARTDAY";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				i++;
				String getID = rs.getString(1);
				String getnick = rs.getString(2);
				int getLv = rs.getInt(3);
				int getExpe = rs.getInt(4);
				int getturn = rs.getInt(14);
				System.out.println(i+"위  아이디 : "+getID + "\t닉네임 : "+getnick+"\t레벨 : "+getLv+"\t경험치 : "+ getExpe +"\t턴수 : "+getturn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}
	public DAMAVO dama_loding(String id) {
		DAMAVO dm = new DAMAVO();
		getConn();
		String sql = "select * from DAMA_INFO where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				String getId = rs.getString(1);
				String getNick = rs.getString(2);
				int getLv = rs.getInt(3);
				int getExpe = rs.getInt(4);
				int getHp = rs.getInt(5);
				int getEne = rs.getInt(6);
				int getMax_hp = rs.getInt(7);
				int getMax_ene = rs.getInt(8);
				int getAtk = rs.getInt(9);
				int getDef = rs.getInt(10);
				int getSpd = rs.getInt(11);
				int getFood = rs.getInt(12);
				int getHerbs = rs.getInt(13);
				int getStartday = rs.getInt(14);
				int getSickday = rs.getInt(15);
				
				dm = new DAMAVO(getId, getNick, getLv, getExpe, getHp, getEne, getMax_hp, getMax_ene, getAtk, getDef, 
								getSpd, getFood, getHerbs, getStartday, getSickday);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
		return dm;
	}

	public int login(String Id, String Pw) {
		getConn();
		int i = 0;
		String sql = "select * from user_info where id = ? and password = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Id);
			psmt.setString(2, Pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				i = 5;
			} else {
				i = 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
		return i;
	}
		
}
