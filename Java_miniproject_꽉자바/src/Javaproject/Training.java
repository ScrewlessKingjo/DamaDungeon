package Javaproject;


//훈련을 하는 클레스입니다.
public class Training {

int result = 0;
	
	DAMADAO ddao = new DAMADAO();
	
	public int threeT (String id) {
			ddao.getConn();
			try {
				String sql = "update dama_info set expe = expe + 1, ene = 100 where id = ?";
				
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
	
	public int shield (String id) {
		ddao.getConn();
		try {
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
	
	public int run (String id) {
		ddao.getConn();
		try {
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
