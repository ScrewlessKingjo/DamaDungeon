package Javaproject;

import java.util.Random;
import java.util.Scanner;

public class Sick {
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();
	
	private int status;
	
	public void Sick(String id){
		while(true) {
			if(status == 0) {
				st=dama.vo_loding(id);
				System.out.println("질병에 걸렸습니다. 모든 스텟이 1씩 하락합니다.");
				st.setStr(st.getStr()-1);
				st.setDex(st.getDex()-1);
				st.setWis(st.getWis()-1);
				st.setLuk(st.getLuk()-1);
				st.setAtk(st.getAtk()-1);
				st.setShd(st.getShd()-1);
				st.setSpd(st.getSpd()-1);
				st.setHp(st.getHp()-10);
				st.setHp(st.getHp()-10);
				}
			}
		}
}