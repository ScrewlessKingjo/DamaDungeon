package Javaproject;

import java.util.Scanner;

public class Battle {

	DAMADAO dama = new DAMADAO();
	DAMAVO st ;

	Enemy ge = new Enemy();
	Enemy t = ge.getEnemy();
	Scanner sc = new Scanner(System.in);
	private int lv;
	private int exp;
	private int hp;
	private int max_hp;
	private int atk;
	private int def;
	private int spd;
	private String En_name;
	private int En_hp ;
	private int En_atk ;
	private int En_def ;
	private int En_spd ;

	public void Anything () {
		lv = st.getLv();
		exp = st.getExpe();
		hp = st.getHp();
		max_hp = st.getMax_hp();
		atk = st.getAtk();
		def = st.getDef();
		spd = st.getSpd();
		En_name = t.getEn_name();
		En_hp = t.getEn_hp();
		En_atk = t.getEn_atk();
		En_def = t.getEn_def();
		En_spd = t.getEn_spd();

	}

	public void Phase(String id) {
		st=dama.dama_loding(id);
		Anything ();
		int user_dmg = atk - En_def;
		int En_dmg = En_atk - def;
		System.out.println(atk);
		System.out.println(En_def);
		System.out.println(t.getEn_name() + "가 모습을 드러냈습니다.");
		System.out.println(st.getNick() + "은 전투를 준비합니다......");
		if (En_spd >= spd) {
			System.out.println(t.getEn_name() + "의 선공! " + st.getNick() + "은 " + En_dmg + "의 데미지를 받았다!");
			if (def>=En_atk) {
				En_dmg=0;
			}
			hp -= En_dmg;
		} 
			while (true) {
				System.out.println(t.getEn_name()+" 정보// 체력 :" +En_hp+"공격력 : "+En_atk+"방어력 : "+En_def+"속도 : "+En_spd);
				System.out.println("[1] 강력한 펀치를 날린다 [2] 도망친다");
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.println(st.getNick() + "의 강력한 펀치! " + En_name + "은 " + user_dmg + "의 데미지를 받았다!");
					if (En_def>=atk) {
						user_dmg=0;
					}
					En_hp -= user_dmg;
					System.out.println(En_name+"의 공격! "+st.getNick()+"은"+En_dmg+"의 데미지를 받았다!");
					if (def>=En_atk) {
						En_dmg=0;
					}
					hp-=En_dmg;
				} else if (choice == 2) {
					if (En_spd > spd) {
						System.out.println(st.getNick() + "은 도망칠 수 없었다! " + En_dmg + "의 데미지를 받았다!");
						if (def>=En_atk) {
							En_dmg=0;
						}
						hp -= En_dmg;
					} else {
						System.out.println(st.getNick() + "은 겁쟁이처럼 도망갔다!");
						break;
					}
				}
					if (hp<1) {
						System.out.println("당신은 죽었습니다.");
						break;
					} else if (En_hp<0) {
						System.out.println("이겼다!");
						break;
					}
		}
	}

}
