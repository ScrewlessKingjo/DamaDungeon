package Javaproject;

import java.util.Scanner;

public class Battle {

	private String ID;
	private int exp;
	private int lv;
	private int hp;
	private int atk;
	private int def;
	private int spd;
	private int ene;
	private int hurb;
	private int food;
	private int startday;
	private int deadday;
	private int sickday;

	DAMADAO dama = new DAMADAO();
	DAMAVO st = new DAMAVO();

	Enemy ge = new Enemy();
	Scanner sc = new Scanner(System.in);

	public void Phase() {
		
		Enemy t =ge.getEnemy();
		
		System.out.println(t.getEn_name() + "가 당신 앞에 모습을 드러냈습니다.");
		System.out.println("당신은 전투를 준비합니다......");
		while (st.getHp() < 0 || ge.getEn_hp() < 0) {
			System.out.println("[1] 공격한다 [2] 도망친다");
			int choice = sc.nextInt();
			if(choice == 1) {
				
			}
			
		}

	}

}
