package Javaproject;

// 메인 화면을 출력하는 클레스입니다.

public class Face {

	DAMAVO st;
	DAMADAO dama;
	 
	public Face() {
		dama = new DAMADAO();
	}
	
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
