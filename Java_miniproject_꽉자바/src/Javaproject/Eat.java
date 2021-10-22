package Javaproject;

import java.util.Scanner;

public class Eat {
	// À½½ÄÀ» ¸Ô´Â Å¬·¹½ºÀÔ´Ï´Ù.
	Scanner sc = new Scanner(System.in);

	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();

	public void Eat_menu(String id) {
		int her = st.getHurbs();
		int bob = st.getFood();
		st = dama.dama_loding(id);
		System.out.println("1. ¹ä " + st.getFood() + " 2. ¾àÃÊ " + st.getHurbs());
		int eat_choice = sc.nextInt();

		if (eat_choice == 1) {
			System.out.println("¹äÀ» ¸Ô´Â´Ù.");
			System.out.println();
			if (bob > 0) {
				bob--;
				System.out.println(bob);
				st.setFood(bob);
				fa.Face_Eat_Fish(id);
			}
			System.out.println();

		} else if (eat_choice == 2) {
			System.out.println("¾àÃÊ¸¦ ¸Ô´Â´Ù.");
			System.out.println();
			if (her > 0) {
				her--;
				st.setHurbs(--her);
				fa.Face_Eat_Medi(id);
			}
			System.out.println();
		}
		
	}
}
