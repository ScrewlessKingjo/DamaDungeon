package Javaproject;

import java.util.Random;
import java.util.Scanner;

public class Event {
	Random rd = new Random(); 
	DAMAVO st = new DAMAVO();
	DAMADAO t = new DAMADAO();
	Face fc = new Face();
	Scanner sc = new Scanner(System.in);
	Battle bt = new Battle();
	Sick si = new Sick();
	
	public void Eventset(String id) {
		int event_menu = rd.nextInt(100);
		if (event_menu<50) {
			int select=0;
			st=t.vo_loding(id);
			System.out.println("    ==랜덤 질병 발생== ");
			System.out.println("    [1]확인   [2]해독 ");
			while(true) {
				select = sc.nextInt();
				if(select == 1) {
					si.SSick(id);
					break;
				}else if(select == 2) {
					if (st.getHurbs()>0) {
						st.setHurbs(st.getHurbs()-1);
						System.out.println("질병을 회피했다.");
						st.Alldate(id);
					}else {
						System.out.println("약초가 없다.");
						System.out.println("질병에 걸렸다 피할 수 없다.");
						si.SSick(id);
					}
					break;
				}
			}
			
		}else if(event_menu>99) {
			int select=0;
			System.out.println("  ==랜덤 전투 발생==");
			System.out.println("   [1] 전투 돌입  ");
			while (select != 1) {
				select=sc.nextInt();
			}
			int a=rd.nextInt(3);
			bt.Phase(id, a);
			
			
		}
	}

}
