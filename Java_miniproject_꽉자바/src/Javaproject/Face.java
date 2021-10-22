package Javaproject;

// 메인 화면을 출력하는 클레스입니다.

public class Face {
	String ID;
	int exp;
	int Lv;
	int Hp;
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
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("              ∧ _ ∧  ");
		System.out.println("           　 (O ω O)");
		System.out.println("           .c(__ｕｕ_)");
		System.out.println("    Hp()  : "+st.getHp()+"\t Ene() : "+st.getEne());
		System.out.println("    Atk() : "+st.getAtk()+"\t Def() : "+st.getDef()+"\t Spd() : "+st.getSpd());
		System.out.println("    Lv()  : "+st.getLv()+"\t Exp() : "+st.getExp());
	}

	public void Face_Sleep(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("                ∧__∧  ");
		System.out.println("      Zzz     _( ˘ω˘)  ");
		System.out.println("           ∽c(____⊃⊂ ) ");
		System.out.println("    Hp()  : "+st.getHp()+"\t Ene() : "+st.getEne());
		System.out.println("    Atk() : "+st.getAtk()+"\t Def() : "+st.getDef()+"\t Spd() : "+st.getSpd());
		System.out.println("    Lv()  : "+st.getLv()+"\t Exp() : "+st.getExp());
	} 
	
	public void Face_Eat_Fish(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick()+ " 밥을 먹지 쫘압쫘압쩝쩝 후루룩 까꿍");
		System.out.println("           ∧__∧    ");
		System.out.println("         　(☆o☆ )_ ! ");
		System.out.println(" ><)))˚>  ( __ _  )   ");
		System.out.println("           ˘  ˘ ˘˘   ");
		System.out.println("    Hp()  : "+st.getHp()+"\t Ene() : "+st.getEne());
		System.out.println("    Atk() : "+st.getAtk()+"\t Def() : "+st.getDef()+"\t Spd() : "+st.getSpd());
		System.out.println("    Lv()  : "+st.getLv()+"\t Exp() : "+st.getExp());
	}
	public void Face_Eat_Medi(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick()+ " 약초를 먹지 우웩 쓰다 써 인생");
		System.out.println("            ∧__∧    ");
		System.out.println("   _____  　(＊＾＊ )_ & ");
		System.out.println("  (_약초_)   ( __ _  )   ");
		System.out.println("  |     |    ˘  ˘ ˘˘   ");
		System.out.println("    Hp()  : "+st.getHp()+"\t Ene() : "+st.getEne());
		System.out.println("    Atk() : "+st.getAtk()+"\t Def() : "+st.getDef()+"\t Spd() : "+st.getSpd());
		System.out.println("    Lv()  : "+st.getLv()+"\t Exp() : "+st.getExp());
	}
	
	public void Face_Health(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("                    ");
		System.out.println("          O---∧ _ ∧ ---O      ");
		System.out.println("           　∩(ㅜωㅜ ;)∩     ");
		System.out.println("            (  ─┬─   )     ");
		System.out.println("            (  ─┼─   )     ");
		System.out.println("            (  ─┴─   )∽    ");
		System.out.println("    Hp()  : "+st.getHp()+"\t Ene() : "+st.getEne());
		System.out.println("    Atk() : "+st.getAtk()+"\t Def() : "+st.getDef()+"\t Spd() : "+st.getSpd());
		System.out.println("    Lv()  : "+st.getLv()+"\t Exp() : "+st.getExp());
	}
	
	public void Face_맷집(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("              ∧ _ ∧  ");
		System.out.println("           　 (x ＾ x)  ");
		System.out.println("           .c(__uu__)  "); 
		System.out.println("    Hp()  : "+st.getHp()+"\t Ene() : "+st.getEne());
		System.out.println("    Atk() : "+st.getAtk()+"\t Def() : "+st.getDef()+"\t Spd() : "+st.getSpd());
		System.out.println("    Lv()  : "+st.getLv()+"\t Exp() : "+st.getExp());
	}
	public void Face_run(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("           ∧ _ ∧   ");
		System.out.println("       　  (⊙ ω ⊙)  ");
		System.out.println("        ┌(     _)┘   ");
		System.out.println("         @@@@@@     ");
		System.out.println("    Hp()  : "+st.getHp()+"\t Ene() : "+st.getEne());
		System.out.println("    Atk() : "+st.getAtk()+"\t Def() : "+st.getDef()+"\t Spd() : "+st.getSpd());
		System.out.println("    Lv()  : "+st.getLv()+"\t Exp() : "+st.getExp());
	}
}
