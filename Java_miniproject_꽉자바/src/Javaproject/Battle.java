package Javaproject;

import java.util.Random;
import java.util.Scanner;

public class Battle {

	DAMADAO dama = new DAMADAO();
	DAMAVO st;
	Enemy t;
	Random rd = new Random();

	Scanner sc = new Scanner(System.in);
	private String id;
	private String nick;
	private int lv;
	private int expe;
	private int hp;
	private int ene;
	private int max_hp;
	private int max_ene;
	private int atk;
	private int def;
	private int spd;
	private int food;
	private int hurbs;
	private int startday;
	private int sickday;
	private String En_name;
	private int En_atk;
	private int En_def;
	private int En_spd;
	private int En_hp;

	public void Anything() {
		id = st.getId();
		nick = st.getNick();
		lv = st.getLv();
		expe = st.getExpe();
		hp = st.getHp();
		ene = st.getEne();
		max_hp = st.getMax_hp();
		max_ene = st.getMax_ene();
		atk = st.getAtk();
		def = st.getDef();
		spd = st.getSpd();
		food = st.getFood();
		hurbs = st.getHurbs();
		startday = st.getStartday();
		sickday = st.getSickday();
		En_name = t.getEn_name();
		En_hp = t.getEn_hp();
		En_atk = t.getEn_atk();
		En_def = t.getEn_def();
		En_spd = t.getEn_spd();

	}

	public void Phase(String id) {
		Enemy ge = new Enemy();
		t = ge.getEnemy();
		st = dama.dama_loding(id);
		Anything();
		int user_dmg = atk - En_def;
		int En_dmg = En_atk - def;
		System.out.println(atk);
		System.out.println(En_def);
		System.out.println(t.getEn_name() + "이(가) 모습을 드러냈습니다.");
		System.out.println(st.getNick() + "은(는) 전투를 준비합니다......");
		if (En_spd >= spd) {
			System.out.println(t.getEn_name() + "의 기습공격! " + st.getNick() + "은 " + En_dmg + "의 데미지를 받았다!");
			if (def >= En_atk) {
				En_dmg = 0;
			}
			hp -= En_dmg;
		}
		while (true) {
			if (hp < 1) {
				System.out.println("당신은 죽었습니다.");
				break;
			} else if (En_hp < 1) {
				System.out.println("이겼다!" + t.getEn_name() + "을 해치웠다!");
				System.out.println("");
				break;

			}
			System.out.println(
					t.getEn_name() + " 정보// 체력 :" + En_hp + "공격력 : " + En_atk + "방어력 : " + En_def + "속도 : " + En_spd);
			System.out.println(st.getNick() + " 정보// 체력 :" + hp + "공격력 : " + atk + "방어력 : " + def + "속도 : " + spd);
			System.out.println("[1] 강력한 펀치를 날린다 [2] 스킬 [3] 도망친다");
			int choice = sc.nextInt();
			if (choice == 1) {
				if (rd.nextInt(5) == 0) {
					System.out.println(En_name + "회피! " + st.getNick() + "은(는) 아무런 피해도 입히지 못했다!");
				} else {
					if (rd.nextInt(5) == 0) {
						user_dmg = atk;
						System.out.println("크리티컬! " + En_name + "은 " + user_dmg + "의 데미지를 받았다! ");
						En_hp -= user_dmg;
					} else {
						System.out.println(st.getNick() + "의 강력한 펀치! " + En_name + "은(는) " + user_dmg + "의 데미지를 받았다!");
						if (En_def >= atk) {
							user_dmg = 0;
						}
						En_hp -= user_dmg;
						if (rd.nextInt(5) == 0) {
							System.out.println(st.getNick() + "의 재빠른 회피! " + En_name + "은(는) 어떠한 피해도 입히지 못했다!");
						} else {
							if (rd.nextInt(5) == 0) {
								En_dmg = En_atk;
								System.out.println(
										En_name + "의 치명적인 공격! " + st.getNick() + "은(는)" + En_dmg + "의 데미지를 받았다!");
								if (def >= En_atk) {
									En_dmg = 0;
								}
								hp -= En_dmg;
							} else {
								System.out.println(En_name + "의 공격! " + st.getNick() + "은(는)" + En_dmg + "의 데미지를 받았다!");
								if (def >= En_atk) {
									En_dmg = 0;
								}
								hp -= En_dmg;
							}
						}
					}
				}
			} else if (choice == 2) {
				System.out.println("[1] 몸통박치기 [2] 힐 [3] 뒤로가기");
				int choice_skill = sc.nextInt();
				if (choice_skill == 1) {
					if (ene < 30) {
						System.out.println("지금 몸통박치기를 하는 건 위험하다!");
					} else {
						user_dmg = atk;
						ene -= 40;
						System.out.println(st.getNick() + " 몸통박치기! " + En_name + "은(는)" + user_dmg + "의 데미지를 받았다!");
						En_hp -= user_dmg;
					}
				} else if (choice_skill == 2) {
					if (hurbs < 1) {
						System.out.println("약초가 없다! 회복이 불가능하다!");
					} else {
						hp += 20;
						hurbs--;
						if (hp > max_hp) {
							hp = max_hp;
						}
						System.out.println(st.getNick() + "은(는) 약초를 사용하여 체력을 회복했다! 20만큼 체력이 회복되었다!");
					}
				}
			} else if (choice == 3) {
				if (En_spd > spd) {
					System.out.println(st.getNick() + "은(는) 도망칠 수 없었다! " + En_dmg + "의 데미지를 받았다!");
					if (def >= En_atk) {
						En_dmg = 0;
					}
					hp -= En_dmg;
				} else {
					System.out.println(st.getNick() + "은(는) 겁쟁이처럼 도망갔다!");
					break;
				}

			}

		}
		dama.update(id, nick, lv, expe, hp, ene, max_hp, max_ene, atk, def, spd, food, hurbs, startday, sickday);
	}

}
