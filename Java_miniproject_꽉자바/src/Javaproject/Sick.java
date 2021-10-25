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
		fa.Face_Sick(id);
		System.out.println("질병에 걸렸습니다. 모든 스텟이 " +sickday+"만큼 하락합니다.");
				st.setStr(st.getStr()-sickday);
				st.setDex(st.getDex()-sickday);
				st.setWis(st.getWis()-sickday);
				st.setLuk(st.getLuk()-sickday);
				st.setAtk(st.getAtk()-sickday);
				st.setShd(st.getShd()-sickday);
				st.setSpd(st.getSpd()-sickday);
				st.setHp(st.getHp()-sickday*10);
				st.setEne(st.getEne()-sickday*10);
				if(st.getHp() < 1) {
					st.VO_deadly(id);
				}
				st.setSickday(sickday);
				st.Alldate(id);
			
		}
}