package Javaproject;

public class Eat {
	//음식을 먹는 클레스입니다.

	
       
		DAMADAO dama = new DAMADAO();
		DAMAVO st;
		
		public void Face_Bob(String id) {
			st=dama.dama_loding(id);
			System.out.println("    내 이름은 " + st.getNick() + " 밥을 먹지 쫘압쫘압쩝쩝 후루룩 까꿍");
			System.out.println("              ∧ _ ∧  ");
			System.out.println("           　 (@ O @)");
			System.out.println("           .c(__ｕｕ_)");
			System.out.println("    HP  : "+st.getHp() + "\t ENE : "+st.getEne());
			System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
			System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExp());
		}
		public void Face_Herb(String id) {
			st=dama.dama_loding(id);
			System.out.println("    내 이름은 " + st.getNick() + " 약초를 먹지 우웩 쓰다 써 인생");
			System.out.println("              ∧ _ ∧  ");
			System.out.println("           　 (ㅡ ^ ㅡ)");
			System.out.println("           .c(__ｕｕ_)");
			System.out.println("    HP  : "+st.getHp() + "\t ENE : "+st.getEne());
			System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getDef()+"\t SPD : "+st.getSpd());
			System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExp());
		}
		
}

