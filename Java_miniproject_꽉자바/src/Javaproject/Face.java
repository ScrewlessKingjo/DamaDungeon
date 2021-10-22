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
		System.out.println("    내 이름은 " + st.getNick());
		System.out.println("              ∧ _ ∧  ");
		System.out.println("           　 (O ω O)");
		System.out.println("           .c(__ｕｕ_)");
		System.out.println("    HP  : "+st.getHp()+"\t ENE : "+st.getEne());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe());
	}

}
