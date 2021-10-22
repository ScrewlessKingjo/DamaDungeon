package Javaproject;

public class Sleep {
	
	String id;
	String nick;
	int lv;
	int exp;
	int hp;
	int ene;
	int max_hp;
	int max_ene;
	int atk;
	int def;
	int spd;
	int food;
	int hurbs;
	int startday;
	int sickday;
	DAMADAO dama = new DAMADAO();
	DAMAVO st = new DAMAVO();
	
	public void Face_Normal(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.nick);
		System.out.println("              ∧ _ ∧  ");
		System.out.println("           　 (O ω O)");
		System.out.println("           .c(__ｕｕ_)");
		System.out.println("    HP  : "+st.hp+"\t ENE : "+st.ene);
		System.out.println("    ATK : "+st.atk+"\t DEF : "+st.def+"\t SPD : "+st.spd);
		System.out.println("    Lv  : "+st.lv+"\t EXP : "+st.exp);
	}
	
}
