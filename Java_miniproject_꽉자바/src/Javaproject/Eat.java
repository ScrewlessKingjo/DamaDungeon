package Javaproject;

import java.util.Random;
import java.util.Scanner;

public class Eat {
	// ������ �Դ� Ŭ�����Դϴ�.

	Scanner sc = new Scanner(System.in);
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();
    Random rd = new Random();
    
	private int her;
	private int bob;
	private int hp;
	private int ene;
    private int MaxHp;
    private int MaxEne;
    private int A;
	public void Eat_menu(String id) {
		st = dama.vo_loding(id);
		her = st.getHurbs();
		bob = st.getFood();
		hp = st.getHp();
		ene = st.getEne();
		MaxHp = st.getMaxhp();
		MaxEne = st.getMaxene();
		System.out.println("1. ��" + "(" + st.getFood() + "��)" + " 2. ����" + "(" + st.getHurbs() + "��)" + " 3. �ڷΰ���");
		int eat_choice = sc.nextInt();

		if (eat_choice == 1) {

			if (bob > 0) {
				if(MaxEne>ene) {
				System.out.println("���� �Դ´�.");
				bob--;
				ene += 50;
//				System.out.println(bob);
				st.setFood(bob);
				if (ene>MaxEne) {ene=MaxEne;}
				st.setEne(ene);
				st.Alldate(id);
				fa.Face_Eat_Fish(id);
				}else {
					System.out.println("�׸� ������...");
					
				}
			} else {
				System.out.println("���� ����.");
			}

		} else if (eat_choice == 2) {

			if (her > 0) {
				if(MaxHp>hp) {
				System.out.println("���ʸ� �Դ´�.");
				her--;
				hp += 50;
				st.setHurbs(her);
				if (hp>MaxHp) {hp=MaxHp;}
				st.setHp(hp);
				st.Alldate(id);
				fa.Face_Eat_Medi(id);
				}else {
					System.out.println("�� �Ⱦ�Ǭ��??");
				}
			} else {
				System.out.println("���ʰ� ����.");
			}

		}

	}

	public void Bob_save(String id) {

		st = dama.vo_loding(id);
		bob = st.getFood();
        A = rd.nextInt(2);
		if (bob >= 0) {
			if(A==0) {
				
				System.out.println("���� ���Ѵ�.");
				bob++;
				st.setFood(bob);
				st.VO_day(id,1);
				st.Alldate(id);
				fa.Face_Fishing(id);
				System.out.println("���� "+"1 ȹ���ߴ�!");
				System.out.println("�� �� : "+ st.getFood());
			}else {
				System.out.println("���� ������ ���ߴ�.");
				st.VO_day(id,1);
				st.Alldate(id);
				fa.Face_FishingMiss(id);
				System.out.println("�� �� : "+ st.getFood());
			}
			}
	}

	public void Herb_save(String id) {
		st = dama.vo_loding(id);
		her = st.getHurbs();
		A = rd.nextInt(2);
		if (her >= 0) {
			if(A==0) {
				System.out.println("���ʸ� ���Ѵ�.");
				her++;
				st.setHurbs(her);
				st.VO_day(id,1);
				st.Alldate(id);
				fa.Face_Get_Medi(id);
				System.out.println("���� "+"1 ȹ���ߴ�!");
				System.out.println("�� ���� : "+st.getHurbs());
				
			}else {
				System.out.println("���ʸ� ������ ���ߴ�.");
				st.VO_day(id,1);
				st.Alldate(id);
				System.out.println("�� ���� : "+st.getHurbs());
			}
		}
	}
}
