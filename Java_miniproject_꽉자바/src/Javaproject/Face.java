package Javaproject;

// 메인 화면을 출력하는 클레스입니다.

public class Face {
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
	
	public void Face_Normal(String id) {
		st=dama.dama_loding(id);
		System.out.println("              ∧ _ ∧  ");
		System.out.println("           　 (O ω O)");
		System.out.println("           .c(__ｕｕ_)");
		System.out.println("    HP  : "+st.hp+"\t  MP : "+st.ene);
		System.out.println("    ATK : "+st.atk+" DEF : "+st.def+" SPD : "+st.spd);
		System.out.println("    Lv  : "+st.lv+"\t EXP : "+st.exp);
		

	}

}
