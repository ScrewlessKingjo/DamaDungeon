package Javaproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sleep {
	
	int result = 0;
	
	DAMADAO ddao = new DAMADAO();
	
	public int sleep(String id) {
			ddao.getConn();
			try {
				// 수정할 컬럼이 한개 이상일 경우 set 컬럼1 = ?, 컬럼2 = ?, ...
				String sql = "update dama_info set hp = 100, ene = 100 where id = ?";
				
				ddao.psmt = ddao.conn.prepareStatement(sql);
				ddao.psmt.setString(1, id);
				
				result = ddao.psmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				ddao.endClose();
			}
			return result;
		}
	
}
