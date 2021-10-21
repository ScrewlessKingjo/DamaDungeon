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
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
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
		
		sql = "create table user_info "
				+ "(ID varchar2(10),"
				+ "PASSWORD NUMBER(10) NOT NULL,"
				+ "CONSTRAINT INFO_PK PRIMARY KEY (ID)"
				+ ")";
		try {
			conn.createStatement();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			endClose();
		}
	}
	public void table2() {
		getConn();				
		sql = "create table DAMA_INFO ("
				+"NICK VARCHAR2(10),"
				+"ID VARCHAR2(10),"
				+"EXP NUMBER(4),"
				+"LV NUMBER(3),"
				+"HP NUMBER(5),"
				+"ATK NUMBER(5),"
				+"DEP NUMBER(5),"
				+"SPD NUMBER(3),"
				+"ENERGY NUMBER(2),"
				+"FOOD NUMBER(3),"
				+"HERBS NUMBER(3),"
				+"STARTDAY NUMBER(3),"
				+"DEADDAY NUMBER(3),"
				+"SICKDAY NUMBER(3),"
				+"CONSTRAINT DAMA_PK PRIMARY KEY (NICK),"
				+"CONSTRAINT DAMA_FK FOREIGN KEY (ID) REFERENCES user_info(ID)"
				+")";
		try {
			conn.createStatement();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			endClose();
		}
	}

	public int insert(String id, String pw, String nick) {

		getConn();
		try {
			String sql = "insert into member values(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			result = psmt.executeUpdate();// 업데이트 줄수
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
		return result;
	}

	public void select() {
		getConn();
		String sql = "select * from member";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String getID = rs.getString(1);
				String getPW = rs.getString(2);
				String getNICK = rs.getString(3);
				System.out.println(getID + " / " + getPW + " / " + getNICK);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			endClose();
		}
	}

	public int update(String set, String where) {
		getConn();
	try {
		String sql = "update member set pw = ? where id =? ";
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, set);
		psmt.setString(2, where);
		result =psmt.executeUpdate();}
	catch (SQLException e) {
		e.printStackTrace();
	}finally {
		endClose();
	}
	return result;
		
	}
	public int delete(String id, String pw) {
		getConn();
	try {
		String sql = "delete from member where id=? and pw =?";
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, id);
		psmt.setString(2, pw);
		result =psmt.executeUpdate();}
	catch (SQLException e) {
		e.printStackTrace();
	}finally {
		endClose();
	}
	return result;
	}
	
	
	
}

