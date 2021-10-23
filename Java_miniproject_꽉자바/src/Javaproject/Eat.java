package Javaproject;

import java.util.Scanner;

public class Eat {
	// 음식을 먹는 클레스입니다.
	
	Scanner sc = new Scanner(System.in);
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();

	public void Eat_menu(String id) {
		st=dama.vo_loding(id);
		int her = st.getHurbs();
		int bob = st.getFood();
		int hp = st.getHp();
		int ene = st.getEne();
		System.out.println("1. 밥 " + st.getFood() + " 2. 약초 " + st.getHurbs());
		int eat_choice = sc.nextInt();

		if (eat_choice == 1) {
			
			System.out.println("밥을 먹는다.");
			if (bob > 0) {
				bob--;
				ene+=10;
//				System.out.println(bob);
				st.setFood(bob);
				st.setEne(ene);
				
				fa.Face_Fishing(id);
				st.Alldate(id);
			}else {
				System.out.println("밥이 없다.");
			}

		} else if (eat_choice == 2) {
			
			System.out.println("약초를 먹는다.");
			if (her > 0) {
				her--;
				hp+=10;
				st.setHurbs(her);
				st.setHp(hp);
				
				fa.Face_Eat_Fish(id);
				st.Alldate(id);
				}
			else {
				System.out.println("약초가 없다.");
			}
				
		}
		
	}
}
