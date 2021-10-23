package Javaproject;

import java.util.Scanner;

//훈련을 하는 클레스입니다.
public class Training {
	Scanner sc = new Scanner(System.in);
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();
	public void training_base(String id) {
		st=dama.vo_loding(id);
		fa.Face_Health(id);
		st.Alldate(id);
		
	}

}
