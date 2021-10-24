package Javaproject;

import java.util.Scanner;

public class Eat {
	// 음식을 먹는 클레스입니다.

	Scanner sc = new Scanner(System.in);
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();

	private int her;
	private int bob;
	private int hp;
	private int ene;

	public void Eat_menu(String id) {
		st = dama.vo_loding(id);
		her = st.getHurbs();
		bob = st.getFood();
		hp = st.getHp();
		ene = st.getEne();
		System.out.println("1. 밥" + "(" + st.getFood() + "개)" + " 2. 약초" + "(" + st.getHurbs() + "개)" + " 3. 뒤로가기");
		int eat_choice = sc.nextInt();

		if (eat_choice == 1) {

			if (bob > 0) {
				System.out.println("밥을 먹는다.");
				bob--;
				ene += 50;
//				System.out.println(bob);
				st.setFood(bob);
				st.setEne(ene);

				st.Alldate(id);
				fa.Face_Eat_Fish(id);
			} else {
				System.out.println("밥이 없다.");
			}

		} else if (eat_choice == 2) {

			if (her > 0) {
				System.out.println("약초를 먹는다.");
				her--;
				hp += 50;
				st.setHurbs(her);
				st.setHp(hp);

				st.Alldate(id);
				fa.Face_Eat_Medi(id);
			} else {
				System.out.println("약초가 없다.");
			}

		}

	}

	public void Bob_save(String id) {

		st = dama.vo_loding(id);
		bob = st.getFood();

		if (bob >= 0) {
			System.out.println("밥을 구한다.");
			bob++;
			st.setFood(bob);
			fa.Face_Fishing(id);
			st.Alldate(id);
			System.out.println("밥을 "+st.getFood()+"획득했다!");
		}
	}

	public void Herb_save(String id) {
		st = dama.vo_loding(id);
		her = st.getHurbs();
		if (her >= 0) {
			System.out.println("약초를 구한다.");
			her++;
			st.setHurbs(her);
			fa.Face_Get_Medi(id);
			st.Alldate(id);
			System.out.println("약을 "+st.getHurbs()+"획득했다!");
		}
	}
}
