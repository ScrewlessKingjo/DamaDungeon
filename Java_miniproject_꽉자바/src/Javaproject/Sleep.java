package Javaproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sleep {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int result;
	
	DAMADAO ddao = new DAMADAO();
	
	public void sleep(String id) {
			ddao.getConn();
			try {
				// 수정할 컬럼이 한개 이상일 경우 set 컬럼1 = ?, 컬럼2 = ?, ...
				String sql = "update dama_info set hp = 100, ene = 100 where id = ?";
				
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id);
				
				psmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				ddao.endClose();
			}
		}
		
//		DAMAVO dm = new DAMAVO();
//		getConn();
//		String sql = "update  from DAMA_INFO where id = ?";
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, id);
//			rs = psmt.executeQuery();
//			if (rs.next()) {
//				String getId = rs.getString(1);
//				String getNick = rs.getString(2);
//				int getLv = rs.getInt(3);
//				int getExp = rs.getInt(4);
//				int getHp = rs.getInt(5);
//				int getEne = rs.getInt(6);
//				int getMax_hp = rs.getInt(7);
//				int getMax_ene = rs.getInt(8);
//				int getAtk = rs.getInt(9);
//				int getDef = rs.getInt(10);
//				int getSpd = rs.getInt(11);
//				int getFood = rs.getInt(12);
//				int getHerbs = rs.getInt(13);
//				int getStartday = rs.getInt(14);
//				int getSickday = rs.getInt(15);
//				
//				dm = new DAMAVO(getId, getNick, getLv, getExp, getHp, getEne, getMax_hp, getMax_ene, getAtk, getDef, 
//								getSpd, getFood, getHerbs, getStartday, getSickday);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			endClose();
//		}
//		return dm;
	
	
}
