package Javaproject;

import java.util.Random;
import java.util.Scanner;

public class Sick {
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();
	
	private int sickday;
	
	public void SSick(String id){
		st=dama.vo_loding(id);
		sickday = st.getSickday()+1;
		for (int i =1; i<sickday ;i++) {
				System.out.println("질병에 걸렸습니다. 모든 스텟이 " +i+"만큼 하락합니다.");
				st.setStr(st.getStr()-i);
				st.setDex(st.getDex()-i);
				st.setWis(st.getWis()-i);
				st.setLuk(st.getLuk()-i);
				st.setAtk(st.getAtk()-i);
				st.setShd(st.getShd()-i);
				st.setSpd(st.getSpd()-i);
				st.setHp(st.getHp()-i*10);
				st.setEne(st.getEne()-i*10);
				if(st.getHp() < 1) {
					st.VO_deadly(id);
				}
				st.setSickday(i);
				st.Alldate(id);
				fa.Face_Sick(id);
			}
		}
}