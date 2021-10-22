package Javaproject;

// 메인 화면을 출력하는 클레스입니다.

public class Face {

	DAMADAO dama = new DAMADAO();
	DAMAVO st = new DAMAVO();
	
	public void Face_Normal(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("              ∧ _ ∧  ");
		System.out.println("           　 (O ω O)");
		System.out.println("           .c(__ｕｕ_)");
		System.out.println("    HP  : "+st.getHp()+"\t ENE : "+st.getEne());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe());
	}

	public void Face_Sleep(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("                ∧__∧  ");
		System.out.println("      Zzz     _( ˘ω˘)  ");
		System.out.println("           ∽c(____⊃⊂ ) ");
		System.out.println("    HP  : "+st.getHp()+"\t ENE : "+st.getEne());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe());
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
		System.out.println("    Lv()  : "+st.getLv()+"\t Exp() : "+st.getExpe());
	}
	public void Face_Eat_Medi(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick()+ " 약초를 먹지 우웩 쓰다 써 인생");
		System.out.println("            ∧__∧    ");
		System.out.println("   _____  　(＊＾＊ )_ & ");
		System.out.println("  (_약초_)   ( __ _  )   ");
		System.out.println("  |     |    ˘  ˘ ˘˘   ");
		System.out.println("    HP  : "+st.getHp()+"\t ENE : "+st.getEne());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe());
	}
	
	public void Face_Health(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("                    ");
		System.out.println("          O---∧ _ ∧ ---O      ");
		System.out.println("           　∩(ㅜωㅜ;)∩     ");
		System.out.println("            (  ─┬─   )     ");
		System.out.println("            (  ─┼─   )     ");
		System.out.println("            (  ─┴─   )∽    ");
		System.out.println("    HP  : "+st.getHp()+"\t ENE : "+st.getEne());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe());
	}
	
	public void Face_맷집(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("              ∧ _ ∧  ");
		System.out.println("           　 (> ㅠ<)  ");
		System.out.println("           .c(__uu_)  "); 
		System.out.println("    HP  : "+st.getHp()+"\t ENE : "+st.getEne());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe());
	}
	public void Face_run(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("           ∧ _ ∧   ");
		System.out.println("       　  (● ω●)  ");
		System.out.println("        ┌(     )┘   ");
		System.out.println("         @@@@@@     ");
		System.out.println("    HP  : "+st.getHp()+"\t ENE : "+st.getEne());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe());
	}
	public void Face_Fishing(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("              ∧__∧    ");
		System.out.println("            　(ºωº )   ");
		System.out.println("          〃⌒∠(__u__)┐ ");
		System.out.println("          /           ");
		System.out.println("    ><)))˚>           ");
		System.out.println();
		System.out.println("    HP  : "+st.getHp()+"\t ENE : "+st.getEne());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe());
	}
	public void Face_Get_Medi(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("              ∧__∧     ");
		System.out.println("             (ºωº )    ");
		System.out.println("            ∠(__u__)┐  ");
		System.out.println("    ＠>--- 〃  ＠>---      ");
		System.out.println("         ＠>---         ");
		System.out.println("    HP  : "+st.getHp()+"\t ENE : "+st.getEne());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe());
	}
	public void Face_Fight(String id) {
		st=dama.dama_loding(id);
		System.out.println("        ∧__∧    X    ∩__∩     ");
		System.out.println("       ( ≫⌒≪) /  ＼ (≫⌒≪ )    ");
		System.out.println("     ∽(  ___ )      (_____ )∽  ");

	}
	public void Face_Escape(String id) {
		st=dama.dama_loding(id);
		System.out.println("        ∩__∩         ∧___∧      ");
		System.out.println("    ＼ (＠⌒＠ )       (◐∇ ◐;)    ");
		System.out.println("      (_____ )∽   ∽(⊂     )⊃    ");
		System.out.println("                   @@@@@        ");

	}
	
	public void Face_Sick(String id) {
		st=dama.dama_loding(id);
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("       ∧ _ ∧        ");
		System.out.println("      (＠ △＠)       ");
		System.out.println("     ┌───────┐      "); 
		System.out.println("     │┌─────┐│      "); 
		System.out.println("     ││     ││      "); 
		System.out.println("     │└─────┘│      "); 
		System.out.println("     └───────┘      "); 
		System.out.println("    HP  : "+st.getHp()+"\t ENE : "+st.getEne());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe());
	}
	
}
