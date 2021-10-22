package Javaproject;

import java.util.Scanner;

public class Battle {

	String ID;
	int exp;
	int lv;
	int hp;
	int atk;
	int def;
	int spd;
	int ene;
	int hurb;
	int food;
	int startday;
	int deadday;
	int sickday;
	DAMADAO dama = new DAMADAO();
	DAMAVO st = new DAMAVO();

	Enemy ge = new Enemy();
	Scanner sc = new Scanner(System.in);

	public void Phase() {
		
		Enemy t =ge.getEnemy();
		
		System.out.println(t.En_name + "가 당신 앞에 모습을 드러냈습니다.");
		System.out.println("당신은 전투를 준비합니다......");
		while (st.hp < 0 || ge.En_hp < 0) {
			System.out.println("[1] 공격한다 [2] 도망친다");
			int choice = sc.nextInt();
			
		}

	}

}
